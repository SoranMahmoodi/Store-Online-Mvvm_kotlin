package com.soran.mahmoodi.storeonlinemvvmkotlin.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class DataBindingTools {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView view, String imageUrl) {
        Picasso.get().load(imageUrl).into(view);
    }
}
