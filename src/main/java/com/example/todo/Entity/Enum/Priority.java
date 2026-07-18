package com.example.todo.Entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Priority {
    HIGH("high priority"),
    MEDIUM("medium priority"),
    LOW("low priority");

    private final String Priority;
}
