package com.example.e_shop;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

  public class itemAdapter extends ArrayAdapter {
      List<Item> itemList;

      public itemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
          super(context, resource, objects);

          itemList = objects;

      }


      @NonNull
      @Override
      public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

          View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

          Item currentItem = itemList.get(position) ;

          TextView ctp =     view.findViewById(R.id.ctp) ;
          TextView ct =    view.findViewById(R.id.ct) ;
          ImageView cti =   view.findViewById(R.id.cti) ;

          ct.setText(currentItem.getItemName());
          ctp.setText(String.valueOf(currentItem.getItemPrice()));
          cti.setImageResource(currentItem.getItemImage());


          ImageView dlb = view.findViewById(R.id.dlb) ;

          dlb.setOnClickListener(new View.OnClickListener() {
              Item removeItem = itemList.get(position) ;
              @Override
              public void onClick(View view) {
                  AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("it`s yummy , are you sure ?").setTitle("Why ?")
                          .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialogInterface, int i) {
                                  itemList.remove(removeItem) ;
                                  notifyDataSetChanged();

                              }
                          }).setNegativeButton("Yummy it is", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialogInterface, int i) {
                                  dialogInterface.dismiss();
                              }
                          });

                             builder.show();
              }
          });

          return  view ;




      }

  }

