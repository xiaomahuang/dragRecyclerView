package com.example.majun.gragview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by majun on 16/7/18.
 */
public class RecyclerAdapter extends RecyclerView.Adapter {
    private Context mContext;
    public List<String> mCities;
    public RecyclerAdapter(Context context, List<String> cities) {
        this.mContext=context;
        this.mCities=cities;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_recycler,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.textView.setText(mCities.get(position));
    }

    @Override
    public int getItemCount() {
        return mCities.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.text);
        }
    }
}
