package com.as.recyclersuspension;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * -----------------------------
 * Created by zqf on 2018/11/28.
 * ---------------------------
 */
public class AdapterBean implements MultiItemEntity {

    public static final int TYPE1 = 1212;
    public static final int TYPE2 = 2646;

    private int Type;

    @Override
    public int getItemType() {
        return Type;
    }

    public TitleBean getTitleBean() {
        return titleBean;
    }

    public void setTitleBean(TitleBean titleBean) {
        this.titleBean = titleBean;
    }

    public ContentBean getContentBean() {
        return contentBean;
    }

    public void setContentBean(ContentBean contentBean) {
        this.contentBean = contentBean;
    }

    private TitleBean titleBean;
    private ContentBean contentBean;

    public AdapterBean(int type, ContentBean contentBean) {
        Type = type;
        this.contentBean = contentBean;
    }

    public AdapterBean(int type, TitleBean titleBean) {
        Type = type;
        this.titleBean = titleBean;
    }
}
