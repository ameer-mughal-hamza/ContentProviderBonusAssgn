package com.ameerhamza.contentprovider;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ameerhamza.contentprovider.Contacts;

import java.util.ArrayList;

/**
 * Created by Ameer Hamza on 12/29/2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    ArrayList<Contacts> list;
    Context context;

    public ContactsAdapter(Context context, ArrayList<Contacts> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.phone_view_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.number.setText(list.get(position).getNumber() + "");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, number;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtName);
            number = itemView.findViewById(R.id.txtNumber);
        }
    }
}
