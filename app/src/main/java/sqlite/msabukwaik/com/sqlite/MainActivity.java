package sqlite.msabukwaik.com.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import sqlite.msabukwaik.com.sqlite.model.DataItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataItem item = new DataItem("", "Item name", "Description", "Category", 1, 10.2, "android.jpg");

        TextView tv = (TextView) findViewById(R.id.out);
        tv.setText(item.toString());
    }
}
