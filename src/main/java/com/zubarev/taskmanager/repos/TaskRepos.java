package com.zubarev.taskmanager.repos;

import com.zubarev.taskmanager.modal.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepos extends CrudRepository<Task, Long> { //

}
