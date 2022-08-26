package com.example.e_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.details);
        super.onCreate(savedInstanceState);
        ;


        Bundle bundle = getIntent().getExtras();

        Item deliverItem =(Item) bundle.getSerializable("item") ;

        TextView dn = findViewById(R.id.dn) ;

        ImageView dni = findViewById(R.id.dni) ;

        dn.setText(deliverItem.getItemds());

        dni.setImageResource(deliverItem.getItemImage());



    }
}