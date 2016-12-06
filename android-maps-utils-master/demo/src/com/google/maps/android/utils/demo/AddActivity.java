package com.google.maps.android.utils.demo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.provider.MediaStore;

public class AddActivity extends Activity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Intent intent1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent1, REQUEST_IMAGE_CAPTURE);
            startActivity(intent1);
            // new LongRunningGetIO().execute();

        }

    }

}
