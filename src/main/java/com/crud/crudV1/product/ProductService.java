package com.crud.crudV1.product;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        return List.of(
                new Product(
                        21312L,
                        "Laptop MAC",
                        450,
                        LocalDate.of(2025, Month.MARCH, 5),
                        2
                )
        );
    }
}
