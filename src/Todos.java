public class Todos {
   private String id;
   private String content;
   private String date;
   
   // Constructors
   public Todos(String newID, String newContent, String newDate) {
        this.id = newID;
        this.content = newContent;
        this.date = newDate;
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


}
