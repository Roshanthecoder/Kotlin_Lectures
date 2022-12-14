package com.example.kotlin_lectures;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.Viewholder> {
    Context context;
    String imag,img2,img3,img4,img5,img6;
    ArrayList<ImageModel> arrimagemodel;
    ImageAdapter(Context context,ArrayList<ImageModel> arrimagemodel){
        this.context=context;
        this.arrimagemodel=arrimagemodel;
    }
    @NonNull
    @Override
    public ImageAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.instagram_profile,parent,false);
       Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.Viewholder holder, int position) {
     /* holder.imageView.setImageBitmap(arrimagemodel.set(position).getImage());*/
    }

    @Override
    public int getItemCount() {
        return arrimagemodel.size();
    }
    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.prof);

        }
    }
}
