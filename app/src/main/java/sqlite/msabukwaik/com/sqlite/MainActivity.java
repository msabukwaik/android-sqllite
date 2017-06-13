package sqlite.msabukwaik.com.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.out);

        //Order the list of dateitems
        Collections.sort(dateItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem dataItem, DataItem t1) {
                    return dataItem.getItemName().compareTo(t1.getItemName());
            }
        });

        for (DataItem item : dateItemList) {
            tv.setText(item.getItemName() + "\n");
        }
    }
}
