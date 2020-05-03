package com.example.sepatulokal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sepatulokal.adapter.ListSepatuAdapter;
import com.example.sepatulokal.model.Sepatu;
import com.example.sepatulokal.model.SepatuData;
import java.util.ArrayList;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSepatu;
    private ArrayList<Sepatu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSepatu = findViewById(R.id.rv_sepatu);
        rvSepatu.setHasFixedSize(true);

        list.addAll(SepatuData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                break;

        }
    }

    private void showRecyclerList(){
        rvSepatu.setLayoutManager(new LinearLayoutManager(this));
        ListSepatuAdapter listHeroAdapter = new ListSepatuAdapter(list);
        rvSepatu.setAdapter(listHeroAdapter);
    }
}