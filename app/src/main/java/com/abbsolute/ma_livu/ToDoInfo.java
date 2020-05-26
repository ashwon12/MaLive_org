package com.appsolute.org.todolist;

public class ToDoInfo {

    String content;
    String detailContent;
    String dates;
    String dDay;

    public ToDoInfo(){

    }
    ToDoInfo(String content,String detailContent,String dates,String dDay){
        this.content=content;
        this.detailContent=detailContent;
        this.dates=dates;
        this.dDay=dDay;
    }

    public String getdDay() {
        return dDay;
    }

    public void setdDay(String dDay) {
        this.dDay = dDay;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetailContent(){return detailContent;}
    public void setDetailContent(String detailContent){
        this.detailContent=detailContent;
    }
}
