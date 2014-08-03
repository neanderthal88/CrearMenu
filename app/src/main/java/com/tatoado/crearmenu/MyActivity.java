package com.tatoado.crearmenu;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_cortar:
                Toast.makeText(getApplicationContext(), "corte", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_pegar:
                Intent i = new Intent(this, Pegar.class);
                startActivity(i);
                break;
            case R.id.menu_compartir:
                Toast.makeText(getApplicationContext(), "compartir", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "settinggsssss", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
