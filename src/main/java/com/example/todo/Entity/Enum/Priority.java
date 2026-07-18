package com.example.todo.Entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Priority {
    HIGH("High priority"),
    MEDIUM("Medium priority"),
    LOW("Low priority");

    private final String Priority;
}
