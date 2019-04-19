package com.casic.smartrefreshlayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author 郭宝
 * @project： SmartRefreshLayoutDemo
 * @package： com.casic.smartrefreshlayoutdemo
 * @date： 2019/4/19 0019 16:59
 * @brief:
 */
public class ViewHolder extends  RecyclerView.ViewHolder {

    ImageView item_iv_img;
    TextView item_tv_msg;

    public ViewHolder(View itemView) {
        super(itemView);

        item_iv_img = (ImageView) itemView.findViewById(R.id.item_iv_img);

        item_tv_msg = (TextView) itemView.findViewById(R.id.item_tv_msg);

    }

}
