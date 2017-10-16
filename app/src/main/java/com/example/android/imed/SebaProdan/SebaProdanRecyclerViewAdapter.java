package com.example.android.imed.SebaProdan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.imed.Model.Seba;
import com.example.android.imed.R;

import java.util.List;

/**
 * Created by Android on 10/10/2017.
 */

public class SebaProdanRecyclerViewAdapter extends RecyclerView.Adapter<SebaProdanRecyclerViewAdapter.ViewHolder> {

    Context context;
    public List<Seba>sebaList;

    public SebaProdanRecyclerViewAdapter(Context context,List<Seba>sebaList){
        this.context = context;
        this.sebaList = sebaList;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sebaview,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Seba seba = sebaList.get(position);
        holder.tv_sebaprodan.setText(seba.getName());


    }


    @Override
    public int getItemCount() {
        return sebaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tv_sebaprodan;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_sebaprodan = (TextView)itemView.findViewById(R.id.tv_SebaProdan);
        }
    }
}
