package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_red_cand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_cand);
        Spinner s14 = findViewById(R.id.spinner14);
        ArrayList<String> A14 = new ArrayList<>();
        A14.add("M 1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s14, A14);


    }
}
