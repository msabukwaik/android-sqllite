package sqlite.msabukwaik.com.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sqlite.msabukwaik.com.sqlite.model.DataItem;
import sqlite.msabukwaik.com.sqlite.sample.SampleDataProvider;

public class MainActivity extends AppCompatActivity {

    List<DataItem> dateItemList = SampleDataProvider.dataItemList;
    List<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Access list view
        ListView lv = (ListView) findViewById(android.R.id.list);

        //Order the list of dateitems
        Collections.sort(dateItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem dataItem, DataItem t1) {
                    return dataItem.getItemName().compareTo(t1.getItemName());
            }
        });

        for (DataItem item : dateItemList) {
            items.add(item.getItemName());
        }

        Collections.sort(items);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, items);
        lv.setAdapter(arrayAdapter);
    }
}
