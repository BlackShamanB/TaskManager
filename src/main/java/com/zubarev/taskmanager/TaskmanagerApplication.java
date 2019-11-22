package com.zubarev.taskmanager;

import com.zubarev.taskmanager.modal.Task;
import com.zubarev.taskmanager.repos.TaskRepos;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@SpringBootApplication
public class TaskmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);

    }
}
