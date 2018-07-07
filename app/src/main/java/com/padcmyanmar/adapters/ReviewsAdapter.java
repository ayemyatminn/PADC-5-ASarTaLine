package com.padcmyanmar.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.R;
import com.padcmyanmar.data.vo.ReviewVO;
import com.padcmyanmar.viewholders.ReviewsViewHolder;

public class ReviewsAdapter extends BaseRecyclerAdapter<ReviewsViewHolder,ReviewVO> {
    public ReviewsAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ReviewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View reviewItemView=mLayoutInflater.inflate(R.layout.item_view_reviews,parent,false);
        return new ReviewsViewHolder(reviewItemView);
    }

    @Override
    public void onBindViewHolder(ReviewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        //return super.getItemCount();
        return 10;
    }
}
