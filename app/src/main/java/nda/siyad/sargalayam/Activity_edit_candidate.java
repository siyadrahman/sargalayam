package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_edit_candidate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_candidate);
        Spinner s15 = findViewById(R.id.spinner15);
        ArrayList<String> A15 = new ArrayList<>();
        A15.add("Chest1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s15, A15);
    }
}
