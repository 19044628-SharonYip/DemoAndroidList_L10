package sg.edu.rp.c346.id19044628.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDemo;
    ArrayList<AndroidVersion> alDemo;
    //ArrayAdapter<AndroidVersion> aaDemo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDemo=findViewById(R.id.lvDemo);

        alDemo=new ArrayList<>();

        AndroidVersion item1= new AndroidVersion("Pie","9.0");
        AndroidVersion item2= new AndroidVersion("Oreo","8.0 - 8.1");
        AndroidVersion item3= new AndroidVersion("Nougat","7.0 - 7.1.2");
        AndroidVersion item4= new AndroidVersion("Marshmallow","6.0 - 6.0.1");
        AndroidVersion item5= new AndroidVersion("Lollipop","5.0 - 5.1.1");
        AndroidVersion item6= new AndroidVersion("KitKat","4.4 - 4.4.4");
        AndroidVersion item7= new AndroidVersion("Jelly Bean","4.1 - 4.3.1");

        alDemo.add(item1);
        alDemo.add(item2);
        alDemo.add(item3);
        alDemo.add(item4);
        alDemo.add(item5);
        alDemo.add(item6);
        alDemo.add(item7);

        //aaDemo=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alDemo);
        //lvDemo.setAdapter(aaDemo);

        adapter=new CustomAdapter(this, R.layout.row, alDemo);
        lvDemo.setAdapter(adapter);


    }
}