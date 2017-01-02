package com.example.abhisheki.androidsession5_assignment3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String [] Contacts={"Gaurish","Preetika","Rama","Santosh"};
    public static String [] Phones={"567456788","544566788","457890677","678976540"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeList();
    }
    public void MakeList()
    {
        CustomList customList = new CustomList(this, Contacts, Phones);
        listView = (ListView) findViewById(R.id.MyList);
        listView.setAdapter(customList);
        registerForContextMenu(listView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Call");
        menu.add(0, v.getId(), 0, "SMS");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle()=="Call"){
            Toast.makeText(getApplicationContext(),"Making a call",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"Sending SMS",Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}


