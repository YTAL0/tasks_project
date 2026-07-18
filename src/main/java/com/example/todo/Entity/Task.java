package com.example.todo.Entity;

import com.example.todo.Entity.Enum.Priority;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "Tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @Column
    private String name;
    @Column
    private String priority;
    @Column
    private String Description;
    @Column(name = "Day_week")
    private String DayWeek;

}
