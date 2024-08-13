package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapert extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Context context;
    ArrayList<ContactModel> arrContacts;
    RecyclerContactAdapert(Context context, ArrayList<ContactModel> arrContacts){
        this.context=context;
        this.arrContacts=arrContacts;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewH=new ViewHolder(v);
        return viewH;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.imgView.setImageResource(arrContacts.get(position).img);
        viewHolder.txtName.setText(arrContacts.get(position).name);
        viewHolder.txtNumber.setText(arrContacts.get(position).contact);


    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNumber, txtName;
        ImageView imgView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            imgView = itemView.findViewById(R.id.imgContact);
        }
    }


}
