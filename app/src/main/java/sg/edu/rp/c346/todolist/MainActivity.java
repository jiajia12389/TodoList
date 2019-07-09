package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView arrayListView;
    ArrayList<CustomToDo> todoList;

    //ArrayAdapter<AndroidVersion> aaList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListView = findViewById(R.id.todoLV);
        todoList = new ArrayList<>();

        CustomToDo item1 = new CustomToDo("MSA","1/7/2019");
        CustomToDo item2 = new CustomToDo("Go for haircut","22/9/2019");

        todoList.add(item1);
        todoList.add(item2);

        adapter = new CustomAdapter(MainActivity.this,R.layout.row,todoList);
        arrayListView.setAdapter(adapter);


    }
}
