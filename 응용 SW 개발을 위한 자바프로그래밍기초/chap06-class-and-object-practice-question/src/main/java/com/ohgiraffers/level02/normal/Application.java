package com.ohgiraffers.level02.normal;

import java.awt.print.Book;

public class Application {

    public static void main(String[] args) {

        BookDTO book = new BookDTO();
        book.getTitle();
        book.getPublisher();
        book.getAuthor();
        book.getPrice();
        book.getDiscountRate();

        System.out.print(book.getTitle() + ", ");
        System.out.print(book.getPublisher() + ", ");
        System.out.print(book.getAuthor() + ", ");
        System.out.print(book.getPrice() + ", ");
        System.out.print(book.getDiscountRate());
//=====================
        System.out.println();
//========================
        BookDTO book1 = new BookDTO("자바의 정석" , "도우출판", "남궁석");
        System.out.println(book1.printInformation());
//=========================
        System.out.println();
//==================
        BookDTO book2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.println(book2.printInformation());



    }
}
