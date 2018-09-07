package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_edit_inst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_inst);
        Spinner s16 = findViewById(R.id.spinner16);
        ArrayList<String> A16 = new ArrayList<>();
        A16.add("M1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s16, A16);
    }
}
