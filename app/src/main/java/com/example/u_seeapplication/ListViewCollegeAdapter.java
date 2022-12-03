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

public class ListViewCollegeAdapter extends BaseAdapter {

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewCollegeAdapter (Context context, List<Model> modellist) {
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

                if(modellist.get(position).getTitle().equals("COLLEGE OF INFORMATION TECHNOLOGY AND COMPUTER SCIENCE")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, citcsAct.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF ACCOUNTANCY")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, coaAct.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF ENGINEERING AND ARCHITECTURE")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ceaAct.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF TEACHER EDUCATION")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ctecollege.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF ARTS AND SCIENCES")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, cascollege.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF BUSINESS ADMINISTRATION")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, cbacollege.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF HOSPITALITY AND TOURISM MANAGEMENT")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, chtmcollege.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF NURSING")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, concollege.class);
                    mContext.startActivity(intent);
                }
                if(modellist.get(position).getTitle().equals("COLLEGE OF LAW")){
                    //start New Activity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, colcollege.class);
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
