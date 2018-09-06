package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_additem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);
        Spinner s8 = findViewById(R.id.spinner8);
        ArrayList<String> A8 = new ArrayList<>();
        A8.add("Group");
        A8.add("Individual");
        Spinner_Utils.attach_items_to_simple_spinner(this, s8, A8);


    }
}
