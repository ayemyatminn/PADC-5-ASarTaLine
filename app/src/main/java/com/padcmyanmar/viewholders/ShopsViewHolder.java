package com.padcmyanmar.viewholders;

import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import com.padcmyanmar.R;
import com.padcmyanmar.data.vo.ShopsVO;
import com.padcmyanmar.delegates.ShopsActionDelegate;

import butterknife.BindView;

public class ShopsViewHolder extends BaseViewHolder<ShopsVO> {

    @BindView(R.id.iv_shops_img)
    RoundedImageView ivShopsImg;

    @BindView(R.id.tv_shops_name)
    TextView tvShopsName;
    @BindView(R.id.tv_shops_town)
    TextView tvShopsTown;

    private ShopsActionDelegate mShopsActionDelegate;

    private ShopsVO mShops;

    public ShopsViewHolder(View itemView, ShopsActionDelegate shopsActionDelegate) {
        super(itemView);
        mShopsActionDelegate=shopsActionDelegate;
    }

    @Override
    public void setData(ShopsVO data) {
        mShops=data;

        Glide.with(ivShopsImg.getContext())
                .load(data.getImages().get(0))
                .into(ivShopsImg);
        tvShopsName.setText(data.getName());
        tvShopsTown.setText(data.getTownship());

    }

    @Override
    public void onClick(View view) {
        mShopsActionDelegate.onTapShops();
    }
}
