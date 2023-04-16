package com.codeengine.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    private Long id;
    //travel, grocery, etc
    private String name;

}
