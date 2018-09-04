package nda.siyad.sargalayam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import ndk.utils.Spinner_Utils;

public class Activity_add_inst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_inst);
        Spinner s=findViewById(R.id.spinner);
        ArrayList<String> A=new ArrayList<>();
        A.add("kooi");
        A.add("hi");
        Spinner_Utils.attach_items_to_simple_spinner(this,s,A);
    }
}
