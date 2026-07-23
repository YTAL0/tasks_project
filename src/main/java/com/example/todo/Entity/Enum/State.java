package com.example.todo.Entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum State {
    PENDING("Pending"),
    DONE("Done");
    private final String State;
}
