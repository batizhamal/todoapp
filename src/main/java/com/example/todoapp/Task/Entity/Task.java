package com.example.todoapp.Task.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "deadline")
    private LocalDateTime deadline;

    // private User currentOwner;

    @Column(name = "currentState")
    private TaskState currentState;

    @Column(name = "priority")
    private TaskPriority priority;
}
