package com.example.todo.v1.Dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class TaskDto {
    private long ID;
    private String name;
    private String priority;
    private String Description;
    private String DayWeek;
}
