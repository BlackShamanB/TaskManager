package com.zubarev.taskmanager.service;

import com.zubarev.taskmanager.modal.Task;
import com.zubarev.taskmanager.repos.TaskRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepos taskrepos;


    public TaskServiceImpl(TaskRepos taskrepos) {
        this.taskrepos = taskrepos;
    }

    @Override
    public void addTask(Task task) {
    }

    @Override
    public void deleteTask(Task task) {

    }

    @Override
    public void changTask(Task task) {

    }

    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    public Task getTask(ResultSet rs, int rowNum) throws SQLException {
        Long id=rs.getLong("Id");
        String taskName=rs.getString("taskName");
        String descriptionTask=rs.getNString("descriptionTask");
        Date date=rs.getDate("date");
        String contacts=rs.getNString("contacts");
        return new Task(taskName,descriptionTask,date,contacts);
    }


}
