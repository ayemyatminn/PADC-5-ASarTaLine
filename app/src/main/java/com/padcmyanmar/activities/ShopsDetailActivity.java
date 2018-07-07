package com.padcmyanmar.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;

import com.padcmyanmar.R;
import com.padcmyanmar.adapters.ReviewsAdapter;
import com.padcmyanmar.adapters.ShopsDetailsImagesAdapter;
import com.padcmyanmar.components.SmartRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShopsDetailActivity extends BaseActivity {

    @BindView(R.id.rv_reviews)
    SmartRecyclerView rvReviews;

    @BindView(R.id.vp_shops_details_image)
    ViewPager vpShopsDetaislImage;

    private ReviewsAdapter mReviewAdapter;

    private ShopsDetailsImagesAdapter mShopsDetailsImagesAdapter;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ShopsDetailActivity.class);
        //intent.putExtra(IE_NEWS_ID, newsId);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops_details);
        ButterKnife.bind(this,this);

        mShopsDetailsImagesAdapter=new ShopsDetailsImagesAdapter(getApplicationContext());
        vpShopsDetaislImage.setAdapter(mShopsDetailsImagesAdapter);

        rvReviews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        mReviewAdapter=new ReviewsAdapter(getApplicationContext());
        rvReviews.setAdapter(mReviewAdapter);
    }
}
