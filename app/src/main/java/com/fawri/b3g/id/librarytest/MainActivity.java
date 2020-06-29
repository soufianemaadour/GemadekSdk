package com.fawri.b3g.id.librarytest;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fawri.b3g.id.doc.customoverlay.CustomScanActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(getApplicationContext(), CustomScanActivity.class);
        startActivity(intent);
        intent.putExtra("activity", "VerificationActivity");
    }
}
