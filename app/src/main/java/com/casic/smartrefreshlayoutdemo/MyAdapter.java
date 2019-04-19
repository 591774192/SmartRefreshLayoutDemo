package com.casic.smartrefreshlayoutdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author 郭宝
 * @project： SmartRefreshLayoutDemo
 * @package： com.casic.smartrefreshlayoutdemo
 * @date： 2019/4/19 0019 16:58
 * @brief:
 */
public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {


    private Context mContext;

    private List<PhotoWall> mPhotoWallList;

    public MyAdapter(Context context, List<PhotoWall> photoWallList) {
        mContext = context;
        mPhotoWallList = photoWallList;
    }

    /**
     * 创建RecyclerView要显示的视图
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rootlayout, parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PhotoWall photoWall = mPhotoWallList.get(position);
        holder.item_iv_img.setBackgroundResource(photoWall.getImg());
        holder.item_tv_msg.setText(photoWall.getMsg());
    }

    @Override
    public int getItemCount() {
        return mPhotoWallList.size();
    }
}
