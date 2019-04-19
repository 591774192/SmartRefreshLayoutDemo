package com.casic.smartrefreshlayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SmartRefreshLayout mSrl;
    private RecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initEvent();
    }

    private void initData() {

        //设置RecyclerView布局的朝向
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRv.setLayoutManager(linearLayoutManager);

        //获取RecyclerView要显示的数据
        List<PhotoWall> photoWalls = DataUtils.getData();
        MyAdapter myAdapter = new MyAdapter(this, photoWalls);

        mRv.setAdapter(myAdapter);
    }

    private void initEvent() {

        /*
        * 下拉刷新监听
        * */
        mSrl.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
            }
        });

        /*上拉加载更多监听*/
        mSrl.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
            }
        });
    }

    private void initView() {

        mSrl = findViewById(R.id.srl);
        mRv = findViewById(R.id.rv);

    }


}
