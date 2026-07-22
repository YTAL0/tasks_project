package com.example.todo.data.Dto.v2;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class TaskDtoV2 {
    private long ID;
    private String name;
    private String priority;
    private String Description;
    private String DayWeek;
    private Date createdAt;
}
