package com.example.ducviet.mvvmpdemo.screen.main;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ducviet.mvvmpdemo.R;
import com.example.ducviet.mvvmpdemo.data.model.User;
import com.example.ducviet.mvvmpdemo.databinding.UserItemBinding;
import java.util.ArrayList;

/**
 * Created by ducviet on 14/09/2017.
 */

public class RecyclerAdapterUser extends RecyclerView.Adapter<RecyclerAdapterUser.ViewHoderUser>{
    private Context mContext;
    private ArrayList<User> mArrayList;

    public RecyclerAdapterUser(Context context, ArrayList<User> arrayList) {
        mContext = context;
        mArrayList = arrayList;
    }

    @Override
    public ViewHoderUser onCreateViewHolder(ViewGroup parent, int viewType) {
        UserItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.user_item,parent,false);
        return new ViewHoderUser(binding);
    }

    @Override
    public void onBindViewHolder(ViewHoderUser holder, int position) {
        holder.setBinding(mArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class ViewHoderUser extends RecyclerView.ViewHolder{
        private UserItemBinding mItemBinding;

        public ViewHoderUser(UserItemBinding binding) {
            super(binding.getRoot());
            mItemBinding = binding;
        }
        public void setBinding(User user){
            if (user!=null){
                mItemBinding.setUser(user);
                mItemBinding.executePendingBindings();
            }
        }
    }
}
