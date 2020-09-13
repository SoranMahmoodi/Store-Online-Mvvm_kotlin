package com.soran.mahmoodi.storeonlinemvvmkotlin.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.soran.mahmoodi.storeonlinemvvmkotlin.R;
import com.soran.mahmoodi.storeonlinemvvmkotlin.adapter.MainAdapter;
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Products;

import java.util.List;

public class CustomRecyclerView extends RelativeLayout {
    private View rootView;
    private RecyclerView rvCustom;
    private TextView tvProductTitle, tvSeeAll;


    public CustomRecyclerView(Context context) {
        super(context);
        init();
    }

    public CustomRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomRecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        rootView = LayoutInflater.from(getContext()).inflate(R.layout.custom_view_rv, this, true);
        rvCustom = rootView.findViewById(R.id.rv_rawProduct);
        tvProductTitle = rootView.findViewById(R.id.tv_rawProduct_title);
        tvSeeAll = rootView.findViewById(R.id.tv_rawProduct_seeAll);
        rvCustom.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, true));

    }

    public void attach(List<Products> products) {
        rvCustom.setAdapter(new MainAdapter(products));
    }

    public void setTextTitle(String title) {
        tvProductTitle.setText(title);
    }

    public void setTextSeeAll(String seeAll) {
        tvSeeAll.setText(seeAll);
    }
}
