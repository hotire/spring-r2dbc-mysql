package com.github.hotire.r2dbc.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    private Long id;

    private String description;

    private String details;

    private boolean done;

}
