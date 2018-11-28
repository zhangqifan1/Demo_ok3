package com.as.recyclersuspension;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String path0="https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2249893882,1165836821&fm=27&gp=0.jpg";
    private String path1="https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2310514390,3580363630&fm=27&gp=0.jpg";
    private String path2="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=581021037,1227266908&fm=27&gp=0.jpg";
    private String path3="https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3594232439,2220325256&fm=27&gp=0.jpg";
    private String path4="https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3258641584,555286175&fm=27&gp=0.jpg";
    private String path5="https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3972169330,4211815266&fm=27&gp=0.jpg";
    private String path6="https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=889120611,3801177793&fm=27&gp=0.jpg";
    private String path7="https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1539976553,73815174&fm=27&gp=0.jpg";
    private String path8="https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=484763539,264346239&fm=27&gp=0.jpg";
    private String path9="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=4095470285,4213575198&fm=27&gp=0.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<AdapterBean> list=new ArrayList<>();
        TitleBean titleBean0 = new TitleBean("出师表", "先帝中道崩殂", "既知已死乎", path0, path1);
        TitleBean titleBean1 = new TitleBean("爱莲说", "世人盛爱牡丹", "吾独爱搞特殊", path2, path3);
        TitleBean titleBean2 = new TitleBean("陶渊明", "草盛豆苗稀", "带月荷锄归", path4, path5);
        TitleBean titleBean3 = new TitleBean("李二白", "太子呼不去", "臣是酒中仙", path6, path7);
        TitleBean titleBean4 = new TitleBean("杜甫", "八月秋风高风怒号", "卷我屋上三重茅", path8, path9);

        ContentBean a1 = new ContentBean("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ContentBean b2 = new ContentBean("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        ContentBean b3 = new ContentBean("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        ContentBean d4 = new ContentBean("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        ContentBean e5 = new ContentBean("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");

        AdapterBean adapterBean = new AdapterBean(AdapterBean.TYPE1, titleBean0);
        AdapterBean adapterBean1 = new AdapterBean(AdapterBean.TYPE1, titleBean1);
        AdapterBean adapterBean2 = new AdapterBean(AdapterBean.TYPE1, titleBean2);
        AdapterBean adapterBean3 = new AdapterBean(AdapterBean.TYPE1, titleBean3);
        AdapterBean adapterBean4 = new AdapterBean(AdapterBean.TYPE1, titleBean4);

        AdapterBean adapter=new AdapterBean(AdapterBean.TYPE2,a1);
        AdapterBean adapter1=new AdapterBean(AdapterBean.TYPE2,b2);
        AdapterBean adapter2=new AdapterBean(AdapterBean.TYPE2,b3);
        AdapterBean adapter3=new AdapterBean(AdapterBean.TYPE2,d4);
        AdapterBean adapter4=new AdapterBean(AdapterBean.TYPE2,e5);

        list.add(adapterBean);
        list.add(adapter);
        list.add(adapterBean1);
        list.add(adapter1);
        list.add(adapterBean2);
        list.add(adapter2);
        list.add(adapterBean3);
        list.add(adapter3);
        list.add(adapterBean4);
        list.add(adapter4);

        MultiAdapter multiAdapter = new MultiAdapter(list);
        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        recyclerview.addItemDecoration(new StickyItemDecoration());

        recyclerview.setAdapter(multiAdapter);
    }
}
