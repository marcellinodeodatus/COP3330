public class TaskItem {
    private String title;
    private String description;
    private String date;

    // constructors
    public TaskItem() {

    }

    public TaskItem(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    // Getter and Setter methods
    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return getDescription();
    }

    public String getDate(){
        return getDate();
    }

    public void SetTitle(String newValue) {
        title = newValue;
    }

    public void setDescription(String newValue) {
        description = newValue;
    }

    public void setDate (String newValue) {
        date = newValue;
    }

    public String toString() {
        return "["+date +"]"+ title +":"+ description+"\n";
    }

} // end TaskItem
