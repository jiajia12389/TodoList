package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<CustomToDo> todoList;

    public CustomAdapter(Context context, int resource, ArrayList<CustomToDo> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.todoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvTodo = rowView.findViewById(R.id.tvTodo);
        TextView tvDate = rowView.findViewById(R.id.tvDate);

        CustomToDo todoP = todoList.get(position);

        tvTodo.setText(todoP.getTodo());
        tvDate.setText(todoP.getDate());

        return rowView;
    }

}
