package com.example.komoriwu.dragitemtag;

import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by KomoriWu
 * on 2018/5/3.
 */

public class DragTagsAdapter extends BaseItemDraggableAdapter<String, BaseViewHolder> {
    public DragTagsAdapter(List<String> data) {
        super(R.layout.item_tags, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_tag, item);
    }
}
