package com.example.jordan.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

/**
 * Created by Jordan on 24/01/2017.
 */

public class NumberPickerActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_picker);
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker2);
        ((NumberPicker) numberPicker).setMaxValue(20);
        ((NumberPicker) numberPicker).setMinValue(10);
    }
}
