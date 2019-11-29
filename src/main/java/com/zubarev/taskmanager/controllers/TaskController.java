package com.zubarev.taskmanager.controllers;

import com.zubarev.taskmanager.modal.Task;
import com.zubarev.taskmanager.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



    @PostMapping("/addTask")
    public @ResponseBody
    Task create(@RequestBody Task task){
        return taskService.addTask(task);
    }

    @DeleteMapping("/deleteTask/{id}")
    public void delete(@PathVariable Long id){
        taskService.deleteTaskId(id);
    }

    @PutMapping("/index")
    public  @ResponseBody Task updateTask(@PathVariable Long id,@RequestBody Task task){
        task.setId(id);
        return taskService.changeTask(task);
    }



    @GetMapping("/index")
    public  String getAll(Model model){

        model.addAttribute("abc",taskService.getAll());
        return "index";
    }
    @PostMapping("/index")
    public String add(@RequestParam String taskName, @RequestParam String descriptionTask, @RequestParam String contacts,Model model){
        Task task=new Task(taskName,descriptionTask,null,contacts);
        taskService.addTask(task);
        model.addAttribute("abc",taskService.getAll());
        return "index";
    }




    //TODO @POSTMAPPING как обработать в spring, 8java
}
