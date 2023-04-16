package com.codeengine.expense.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "expense")
public class Expense {
    @Id
    private Long id;
    private String name;
    private String description;
    @NotNull
    private Instant expenseDate;
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "IS_NECESSARY", nullable = false)
    private boolean isNecessary;
}
