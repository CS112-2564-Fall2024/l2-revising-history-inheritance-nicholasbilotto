public class HistoricalEvent {
    private String description;
    private Date date;

    public HistoricalEvent() {
        description = "None";
        date = new Date();
    }

    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDesription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
    
    public String toString() {
        return this.date.toString() + "---" + description;
    }
    
    public void teach() {
        System.out.println("=========================================");
        System.out.println("Historical Event Example");
        System.out.println("=========================================");
        System.out.println(this.toString());
    }

}
