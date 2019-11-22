package com.zubarev.taskmanager.controllers;

import com.zubarev.taskmanager.modal.Task;
import com.zubarev.taskmanager.repos.TaskRepos;
import com.zubarev.taskmanager.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/getAllTasks")
    public @ResponseBody
    List<Task> getAllTasks(){
        return taskService.getAll();
    }



    //TODO @POSTMAPPING как обработать в spring, 8java
}
