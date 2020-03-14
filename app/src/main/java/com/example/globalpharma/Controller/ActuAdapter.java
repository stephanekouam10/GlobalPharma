package com.example.globalpharma.Controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.globalpharma.R;
import com.example.globalpharma.Views.Actusante;

import java.util.List;

public class ActuAdapter extends RecyclerView.Adapter<ActuAdapter.ViewHolder> {

    private List<Actusante> listActus;
    private Context context;

    public ActuAdapter(List<Actusante> listActus, Context context) {
        this.listActus = listActus;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.actusante_item, parent, false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Actusante actusante = listActus.get(position);

        holder.Image.setImageResource(actusante.getImage());
        holder.Titre.setText(actusante.getTitre());
        holder.Description.setText(actusante.getDescription());
    }

    @Override
    public int getItemCount() {
        return listActus.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{

        public ImageView Image;
        public TextView Titre;
        public TextView Description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Image = (ImageView) itemView.findViewById(R.id.imageActu);
            Titre = (TextView) itemView.findViewById(R.id.txt_titre);
            Description = (TextView) itemView.findViewById(R.id.txt_Description);
        }
    }
}
