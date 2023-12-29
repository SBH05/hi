package com.teamproject.hamster.model.dto;

public class ProductDTO {

        private String name;
        private int size;
        private int price;

        public ProductDTO() {
        }

        public ProductDTO(String name, int size, int price) {
            this.name = name;
            this.size = size;
            this.price = price;
        }
        public String getName() {return name;}
        public int getSize() {
            return size;
        }
        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "ProductDTO{" +
                    "name='" + name + '\'' +
                    ", size=" + size +
                    ", price=" + price +
                    '}';
        }
    }
