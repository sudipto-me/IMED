package com.example.android.imed.Officials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.imed.ItemClickListener;
import com.example.android.imed.LogInFragment;
import com.example.android.imed.Model.Offices;
import com.example.android.imed.R;

import java.util.List;

/**
 * Created by Android on 10/15/2017.
 */

public class OfficesRecyclerAdapter extends RecyclerView.Adapter<OfficesRecyclerAdapter.OfficeViewHolder> {

    Context context;
    public List<Offices> officesList;

    public OfficesRecyclerAdapter(Context context, List<Offices> officesList) {
        this.context = context;
        this.officesList = officesList;
    }


    @Override
    public OfficeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.officeview, parent, false);
        OfficeViewHolder viewHolder = new OfficeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(OfficeViewHolder holder, int position) {
        final Offices offices = officesList.get(position);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void OnClick(View view, int position) {

                Intent intent = new Intent(view.getContext(),PersonalsList.class);
                view.getContext().startActivity(intent);




            }
        });
        holder.tv_officeName.setText(offices.getOffice_name());

    }


    @Override
    public int getItemCount() {
        return officesList.size();
    }

    public class OfficeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tv_officeName;
        public ImageView iv_rightArrow;
        public ItemClickListener itemClickListener;

        public OfficeViewHolder(View itemView) {
            super(itemView);
            tv_officeName = (TextView) itemView.findViewById(R.id.tv_office_name);
            iv_rightArrow = (ImageView) itemView.findViewById(R.id.iv_right_button);
            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            itemClickListener.OnClick(view, (int) getItemId());
        }
    }
}
