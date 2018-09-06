package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_reg_gpitem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_gpitem);
        Spinner s = findViewById(R.id.spinner);
        ArrayList<String> A = new ArrayList<>();
        A.add("item1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s, A);
        Spinner s9 = findViewById(R.id.spinner9);
        ArrayList<String> A9 = new ArrayList<>();
        A9.add("M1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s9, A9);
        Spinner s10 = findViewById(R.id.spinner10);
        ArrayList<String> A10 = new ArrayList<>();
        A10.add("item1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s10, A10);
        Spinner s11 = findViewById(R.id.spinner11);
        ArrayList<String> A11 = new ArrayList<>();
        A11.add("item1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s11, A11);
        Spinner s12 = findViewById(R.id.spinner12);
        ArrayList<String> A12 = new ArrayList<>();
        A12.add("item1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s12, A12);
        Spinner s13 = findViewById(R.id.spinner13);
        ArrayList<String> A13 = new ArrayList<>();
        A13.add("item1");
        Spinner_Utils.attach_items_to_simple_spinner(this, s13, A13);
    }
}
