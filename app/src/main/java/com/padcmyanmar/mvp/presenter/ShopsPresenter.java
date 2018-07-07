package com.padcmyanmar.mvp.presenter;

import android.arch.lifecycle.MutableLiveData;

import com.padcmyanmar.data.model.WarTeeModel;
import com.padcmyanmar.data.vo.ShopsVO;
import com.padcmyanmar.delegates.ShopsActionDelegate;
import com.padcmyanmar.mvp.view.ShopsView;

import java.util.List;

public class ShopsPresenter extends BasePresenter<ShopsView> implements ShopsActionDelegate{

    private MutableLiveData<List<ShopsVO>> mShopsListLD;

    public void initPresenter(ShopsView view){
        super.initPresenter(view);
        mShopsListLD=new MutableLiveData<>();
        WarTeeModel.getInstance().StartLoadingShops(mShopsListLD,mErrorLD);
    }

    public MutableLiveData<List<ShopsVO>> getmShopsListLD() {
        return mShopsListLD;
    }

    @Override
    public void onTapShops() {
        mView.lunchShopDetail();
    }
}
