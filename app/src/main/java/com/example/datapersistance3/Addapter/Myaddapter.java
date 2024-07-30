package com.example.datapersistance3.Addapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datapersistance3.NativeDatabaseImpliment_internal_Database.Car;
import com.example.datapersistance3.R;

import java.util.ArrayList;

public class Myaddapter extends RecyclerView.Adapter<Myaddapter.Viewholder> {

   ArrayList<Car> arrayList;

   public Myaddapter(ArrayList<Car> arrayList){
       this.arrayList=arrayList;
   }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.costume_layout,parent,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.color.setText(arrayList.get(position).getColor());
        holder.id.setText(arrayList.get(position).getId());
        holder.model.setText(arrayList.get(position).getMode());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder{

       TextView model,id,color;
       public Viewholder(@NonNull View itemView) {
           super(itemView);
           model=itemView.findViewById(R.id.model);
           id=itemView.findViewById(R.id.id);
           color=itemView.findViewById(R.id.color);
       }
   }
}
