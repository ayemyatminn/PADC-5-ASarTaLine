package com.padcmyanmar.data.model;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;

import com.padcmyanmar.data.vo.ShopsVO;
import com.padcmyanmar.networks.response.GetShopsResponse;
import com.padcmyanmar.utils.AppConstants;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WarTeeModel extends BaseModel {

    private static WarTeeModel objInstance;

    private WarTeeModel(Context context) {
        super(context);
    }

    public static void initModel(Context context){
        objInstance=new WarTeeModel(context);
    }

    public static WarTeeModel getInstance() {
        if (objInstance == null) {
            throw new RuntimeException("WarteeModel is being invoked before initializing.");
        }
        return objInstance;
    }

    public void StartLoadingShops(final MutableLiveData<List<ShopsVO>> shopsListLD,final MutableLiveData<String> errorLD){
        mTheShopsAPI.loadShops(AppConstants.ACCESS_TOKEN)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GetShopsResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GetShopsResponse getShopsResponse) {
                        if (getShopsResponse!=null && getShopsResponse.getShopsList().size()>0){
                            shopsListLD.setValue(getShopsResponse.getShopsList());
                        }else {
                            errorLD.setValue("No data could be loaded for now. Pls try again later.");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        errorLD.setValue(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
