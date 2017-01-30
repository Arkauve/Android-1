package com.example.jordan.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created by Jordan on 24/01/2017.
 */

public class GalleryAndroidActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(GalleryAndroidActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
