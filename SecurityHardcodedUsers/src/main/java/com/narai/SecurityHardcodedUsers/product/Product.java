package com.narai.SecurityHardcodedUsers.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
        private  int id;
        private String name;
        private int quantity;

}
