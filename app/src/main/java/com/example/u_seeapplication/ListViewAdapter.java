package com.example.u_seeapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor

    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitletTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitletTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitletTv.setText(modellist.get(position).getTitle());
        holder.mDescTv.setText(modellist.get(position).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(position).getIcon());

        //listView item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(modellist.get(position).getTitle().equals("M301")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, MainActivityViewPagerM301.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("M302")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, MainActivityViewPagerM302.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("M303")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, MainActivityViewPagerM303.class);
                    mContext.startActivity(intent);
                }

            }
        });
        return view;
    }
    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length() ==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList) {
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)) {
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}
