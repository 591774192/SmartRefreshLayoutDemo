package com.casic.smartrefreshlayoutdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭宝
 * @project： SmartRefreshLayoutDemo
 * @package： com.casic.smartrefreshlayoutdemo
 * @date： 2019/4/19 0019 17:00
 * @brief:
 */
public class DataUtils {


    public static List<PhotoWall> getData(){
        ArrayList<PhotoWall> photoWalls = new ArrayList<>();

        PhotoWall photoWall;
        for (int i = 0; i <50 ; i++) {
            photoWall = new PhotoWall();
            photoWall.setImg(R.mipmap.ic_launcher);
            photoWall.setMsg("描述"+i);

            photoWalls.add(photoWall);
        }

        return photoWalls;


    }

}
