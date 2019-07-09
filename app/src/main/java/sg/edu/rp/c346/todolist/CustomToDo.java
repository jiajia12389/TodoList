package sg.edu.rp.c346.todolist;

public class CustomToDo {

    private String todo;
    private String date;

    public CustomToDo(String todo, String date) {
        this.todo = todo;
        this.date = date;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
