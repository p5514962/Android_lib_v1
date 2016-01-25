package com.eascs.app.common_lib.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/**
 * @param <K>
 */
public abstract class BaseModelAdapter<K> extends BaseAdapter {

    public BaseModelAdapter() {
        super();
    }

    @Override
    public int getCount() {
        return getModelList().size();
    }

    @Override
    public K getItem(int position) {
        if (position >= 0 && position < getCount())
            return getModelList().get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ModelViewHolder holder;
        if (convertView == null) {
            convertView = getModelView(position, parent);
            holder = getItemViewHolder(convertView);
            holder.mContentView = convertView;
            convertView.setTag(holder);
        } else {
            holder = (ModelViewHolder) convertView.getTag();
        }
        holder.setPosition(position);
        if (position >= 0) {
            doUpdateModelView(convertView, holder, getItem(position));
        }
        return convertView;
    }

    protected abstract List<K> getModelList();

    protected abstract View getModelView(int position, ViewGroup parent);

    protected abstract ModelViewHolder getItemViewHolder(View convertView);

    protected void doUpdateModelView(View convertView, ModelViewHolder holder, K model) {
    }

    public static class ModelViewHolder {
        private View mContentView;
        private int mPosition;

        public void setContentView(View view) {
            mContentView = view;
        }

        public View getContentView() {
            return mContentView;
        }

        public int getPosition() {
            return mPosition;
        }

        public void setPosition(int position) {
            this.mPosition = position;
        }
    }
}
