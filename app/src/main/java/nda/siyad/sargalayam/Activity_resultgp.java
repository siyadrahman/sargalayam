package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_resultgp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultgp);

        setContentView(R.layout.activity_result_individual);
        Spinner s3 = findViewById(R.id.spinner4);
        ArrayList<String> A3 = new ArrayList<>();
        A3.add("Add Item");
        Spinner_Utils.attach_items_to_simple_spinner(this, s3, A3);
        Spinner s4 = findViewById(R.id.spinner5);
        ArrayList<String> A4 = new ArrayList<>();
        A4.add("A");
        Spinner_Utils.attach_items_to_simple_spinner(this, s4, A4);
        Spinner s5 = findViewById(R.id.spinner6);
        ArrayList<String> A5 = new ArrayList<>();
        A5.add("B");
        Spinner_Utils.attach_items_to_simple_spinner(this, s5, A5);
        Spinner s6 = findViewById(R.id.spinner7);
        ArrayList<String> A6 = new ArrayList<>();
        A6.add("C");
        Spinner_Utils.attach_items_to_simple_spinner(this, s6, A6);
    }
}
