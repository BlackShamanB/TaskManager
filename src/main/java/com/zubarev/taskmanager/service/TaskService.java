package com.zubarev.taskmanager.service;

import com.zubarev.taskmanager.modal.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface TaskService {
    public void addTask(Task task);
    public void deleteTask(Task task);
    public void changTask(Task task);
    public List<Task> getAll();
    public Task getTask(ResultSet rs, int rowNum) throws SQLException;
}
