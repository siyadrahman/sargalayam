package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Spinner s1 = findViewById(R.id.spinner2);
        ArrayList<String> A = new ArrayList<>();
        A.add("item1");
        A.add("item2");
        Spinner_Utils.attach_items_to_simple_spinner(this, s1, A);
        Spinner s2 = findViewById(R.id.spinner3);
        ArrayList<String> A1 = new ArrayList<>();
        A1.add("101");
        A1.add("102");
        Spinner_Utils.attach_items_to_simple_spinner(this, s2, A1);


    }
}