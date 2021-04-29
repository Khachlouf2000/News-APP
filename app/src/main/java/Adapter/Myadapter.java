package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywork.R;

import java.util.List;

import model.ListItem;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {
    Context context ;
    List<LauncherActivity.ListItem> listeitems;
    public Myadapter(Context context , List listeitem) {
        this.context=context;
        this.listeitems=listeitems;
    }

    @NonNull
    @Override
    public Myadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.ViewHolder holder, int position) {
        holder.description.setText("Click here !");

    }

    @Override
    public int getItemCount() {

        return 6;
}

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            description = itemView.findViewById(R.id.desc);
        }
    }
}
