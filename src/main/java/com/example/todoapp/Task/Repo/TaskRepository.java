package com.example.todoapp.Task.Repo;

import com.example.todoapp.Task.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
