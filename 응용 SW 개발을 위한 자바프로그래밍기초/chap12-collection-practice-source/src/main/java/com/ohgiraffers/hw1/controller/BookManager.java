package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    BookMenu bmn = new BookMenu();
    private static ArrayList<BookDTO> bookList = new ArrayList<>();

    public BookManager() {
    }

    public void addBook(BookDTO booklist) {
        bookList.add(booklist);

        }


    public int deleteBook(int key) {
        bookList.remove(key - 1);
        return key;
    }

    public String searchBook(String title) {
        int count = 0;
        for (int i = 0 ; i < bookList.size(); i ++){
            if (bookList.get(i).getTitle().contains(title)){
                System.out.println("검색하신 도서는 " + bookList.get(i) + "입니다.");
                count++;
            }
        }
        if (count == 0){
        System.out.println("조회한 도서가 목록에 없습니다.");}

        return title;

    }

    public void displayAll() {
        if (bookList.size() == 0) {
            System.out.println("출력 결과가 없습니다.");}

            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(i + " " + bookList.get(i));

        }
    }


    public List<BookDTO> sortedBookList(int type) {
        switch (type) {
            case 1:
                bookList.sort(new AscBookNo());
                break;
            case 2:
                bookList.sort(new DescBookNo());
                break;
            case 3:
                bookList.sort(new AscBookTitle());
                break;
            case 4:
                bookList.sort(new DescBookTitle());
                break;

        }
        return bookList;

    }

    public void printBookList(List<BookDTO> printlist) {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

    }
}


