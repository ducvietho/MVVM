package com.example.ducviet.mvvmpdemo.utils.binding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ducviet on 14/09/2017.
 */

public class BindingUtils {
    @BindingAdapter("bind:recyclerAdapter")
    public static void setAdapterRecycler(RecyclerView recycler, RecyclerView.Adapter adapter){
        recycler.setAdapter(adapter);
    }
}
