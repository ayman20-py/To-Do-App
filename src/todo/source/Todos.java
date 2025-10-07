package todo.source;

public class Todos {
   private String id;
   private String content;
   private String date;
   private String deadline;
   
   // Constructor
   public Todos(String newID, String newContent, String newDate, String newDeadline) {
        this.id = newID;
        this.content = newContent;
        this.date = newDate;
        this.deadline = newDeadline;
   }

   // Getters
   public String getID() {
        return this.id;
   }

   public String getContent() {
        return this.content;
   }

   public String getDate() {
        return this.date;
   }

   public String getDeadline() {
        return this.deadline;
   }

   // Setters
   public void setID(String newID) {
        this.id = newID;
   }

   public void setContent(String newContent) {
        this.id = newContent;
   }

   public void setDate(String newDate) {
        this.id = newDate;
   }

   public void setDeadline(String newDeadline) {
        this.deadline = newDeadline;
   }

}
