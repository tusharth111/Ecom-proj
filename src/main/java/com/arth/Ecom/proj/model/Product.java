package com.arth.Ecom.proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.math.BigDecimal;
import java.util.Date;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  14 3/14/2026 9:22 PM
 Project Name : Ecom-proj
 ***/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;        // ✅ changed from int

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") // ✅ fixed pattern to match HTML date input
    private Date releaseDate;

    private Boolean productAvailable;
    private Integer stockQuantity;  // ✅ changed from int

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageDate;
}
