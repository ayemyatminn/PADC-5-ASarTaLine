package com.padcmyanmar.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.R;
import com.padcmyanmar.data.vo.ShopsVO;
import com.padcmyanmar.delegates.ShopsActionDelegate;
import com.padcmyanmar.viewholders.ShopsViewHolder;

public class ShopsAdapter extends BaseRecyclerAdapter<ShopsViewHolder,ShopsVO> {

    private ShopsActionDelegate mShopsActionDelegate;

    public ShopsAdapter(Context context,ShopsActionDelegate shopsActionDelegate) {
        super(context);
        mShopsActionDelegate=shopsActionDelegate;
    }

    @NonNull
    @Override
    public ShopsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View shopsItemView=mLayoutInflater.inflate(R.layout.item_view_shops,parent,false);
        return new ShopsViewHolder(shopsItemView,mShopsActionDelegate);
    }

}
