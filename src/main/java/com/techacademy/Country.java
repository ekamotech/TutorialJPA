package com.techacademy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombokのアノテーション
@Data
@AllArgsConstructor
@NoArgsConstructor
// Spring JPAのアノテーション
@Entity
@Table(name="country")
public class Country {
    @Id
    private String code;
    private String name;
    private int population;

}
