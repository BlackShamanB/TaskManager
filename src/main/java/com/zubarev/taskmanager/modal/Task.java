package com.zubarev.taskmanager.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String taskName;
    private String descriptionTask;
    private Date date;
    private String contacts;

    protected Task(){ }

    public Task(String taskName, String descriptionTask, Date date, String contacts){
        this.taskName=taskName;
        this.descriptionTask=descriptionTask;
        this.date =date;
        this.contacts=contacts;
    }

    public String getTaskName(){
        return taskName;
    }
    public String getDescriptionTask(){
        return descriptionTask;
    }
    public Date getDate(){
        return date;
    }
    public String getContacts(){
        return contacts;
    }

    public void setTaskName(String taskName){
        this.taskName=taskName;
    }
    public void setDescriptionTask(String descriptionTask){
        this.descriptionTask=descriptionTask;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public void setContacts(String contacts){
        this.contacts=contacts;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", descriptionTask='" + descriptionTask + '\'' +
                ", date=" + date +
                ", contacts='" + contacts + '\'' +
                '}';
    }
}
