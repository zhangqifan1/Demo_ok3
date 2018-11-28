package com.as.recyclersuspension;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2018/11/28.
 * ---------------------------
 */
public class MultiAdapter extends BaseMultiItemQuickAdapter<AdapterBean, BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public MultiAdapter(List<AdapterBean> data) {
        super(data);
        addItemType(AdapterBean.TYPE1, R.layout.item_title);
        addItemType(AdapterBean.TYPE2, R.layout.item_content);
    }

    @Override
    protected void convert(BaseViewHolder helper, AdapterBean item) {
        switch (item.getItemType()) {
            case AdapterBean.TYPE1:
                View view = helper.getView(R.id.background);
                helper.itemView.setTag(true);
                if (helper.getAdapterPosition() % mData.size() == 0) {
                    view.setBackgroundColor(mContext.getResources().getColor(R.color.colorAccent));
                } else if (helper.getAdapterPosition() % mData.size() == 2) {
                    view.setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                } else {
                    view.setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimaryDark));
                }

                TitleBean titleBean = item.getTitleBean();
                helper.setText(R.id.title1, titleBean.getTitle1());
                helper.setText(R.id.title2, titleBean.getTitle2());
                helper.setText(R.id.title3, titleBean.getTitle3());

                Glide.with(mContext)
                        .asBitmap()
                        .transition(BitmapTransitionOptions.withCrossFade())
                        .load(titleBean.getImage1())
                        .into((ImageView) helper.getView(R.id.image1));
                Glide.with(mContext)
                        .asBitmap()
                        .transition(BitmapTransitionOptions.withCrossFade())
                        .load(titleBean.getImage2())
                        .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background))
                        .into((ImageView) helper.getView(R.id.image2));

                break;
            case AdapterBean.TYPE2:
                helper.itemView.setTag(false);
                ContentBean contentBean = item.getContentBean();
                helper.setText(R.id.textContent, contentBean.getTextcontent());

                break;
            default:
                break;
        }


    }


    @Override
    protected BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateDefViewHolder(parent, viewType);
    }
}
