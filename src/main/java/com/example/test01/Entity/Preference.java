package com.example.test01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Preference {

    private Long id;
    private FoodItem foodItem;
    private LocalDateTime timestamp;
}
