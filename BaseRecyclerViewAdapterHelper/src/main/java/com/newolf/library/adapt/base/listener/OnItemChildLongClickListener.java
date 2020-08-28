package com.newolf.library.adapt.base.listener;

import android.view.View;

import androidx.annotation.NonNull;

import com.newolf.library.adapt.base.BaseQuickAdapter;

/**
 * ================================================
 *
 * @author : NeWolf
 * @version : 1.0
 * @date :  2020/8/27
 * 描述:
 * 历史:<br/>
 * ================================================
 */
public interface OnItemChildLongClickListener {
    /**
     * callback method to be invoked when an item in this view has been
     * click and held
     *
     * @param adapter  this BaseQuickAdapter adapter
     * @param view     The childView within the itemView that was clicked and held.
     * @param position The position of the view int the adapter
     * @return true if the callback consumed the long click ,false otherwise
     */
    boolean onItemChildLongClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position);
}
