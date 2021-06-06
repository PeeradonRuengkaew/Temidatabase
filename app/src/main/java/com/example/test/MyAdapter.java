package com.example.test;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{


    Context context;
    ArrayList<Employee> list;

    public MyAdapter(Context context, ArrayList<Employee> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        Employee user = list.get(position);
        holder.Username.setText(user.getUsername());
        holder.Password.setText(user.getPassword());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Username, Password;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Username = itemView.findViewById(R.id.tvUsername);
            Password = itemView.findViewById(R.id.tvPassword);
        }
    }
}


