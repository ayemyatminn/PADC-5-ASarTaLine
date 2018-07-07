package com.padcmyanmar.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import com.padcmyanmar.R;
import com.padcmyanmar.adapters.ShopsAdapter;
import com.padcmyanmar.components.EmptyViewPod;
import com.padcmyanmar.components.SmartRecyclerView;
import com.padcmyanmar.data.model.WarTeeModel;
import com.padcmyanmar.data.vo.ShopsVO;
import com.padcmyanmar.delegates.ShopsActionDelegate;
import com.padcmyanmar.mvp.presenter.ShopsPresenter;
import com.padcmyanmar.mvp.view.ShopsView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ShopActivity extends BaseActivity implements ShopsView{

    @BindView(R.id.rv_shops)
    SmartRecyclerView rvShops;


//    @BindView(R.id.vp_empty_news)
//    EmptyViewPod vpEmptyNews;

    private ShopsAdapter mShopsAdapter;

    private ShopsPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        ButterKnife.bind(this,this);

        WarTeeModel.initModel(getApplicationContext());

        mPresenter= ViewModelProviders.of(this).get(ShopsPresenter.class);
        mPresenter.initPresenter(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //rvShops.setEmptyView(vpEmptyNews);
        rvShops.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        mShopsAdapter=new ShopsAdapter(getApplicationContext(),mPresenter);
        rvShops.setAdapter(mShopsAdapter);

        mPresenter.getmShopsListLD().observe(this, new Observer<List<ShopsVO>>() {
            @Override
            public void onChanged(@Nullable List<ShopsVO> shopsVOS) {
                displayShopsList(shopsVOS);
            }
        });
        mPresenter.getErrorLD().observe(this,this);
    }

    public void displayShopsList(List<ShopsVO> shopsList){
        mShopsAdapter.appendFoodData(shopsList);
    }

    @Override
    public void displayErrorMsg(String errorMsg) {
        Snackbar.make(rvShops, errorMsg, Snackbar.LENGTH_INDEFINITE).show();
    }

    @Override
    public void lunchShopDetail() {
        Intent intent=ShopsDetailActivity.newIntent(getApplicationContext());
        startActivity(intent);
    }
}
