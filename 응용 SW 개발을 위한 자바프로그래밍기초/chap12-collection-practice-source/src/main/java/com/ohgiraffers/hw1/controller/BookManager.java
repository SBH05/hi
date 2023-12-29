package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    BookMenu bmn = new BookMenu();
    private ArrayList<BookDTO> bookList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public BookManager() {
    }

    public void addBook(BookDTO booklist) {


    }

    public int deleteBook() {
    }

    public String searchBook() {

    }

    public void displayAll() {


        }

    }

    public List<BookDTO> sortedBookList(int type) {
        AscBookTitle asc = new AscBookTitle();

        switch (type){
            case 1 : bookList.sort(new AscBookNo()); break;
            case 2 : bookList.sort(new DescBookNo()); break;
            case 3 : bookList.sort(new AscBookTitle()); break;
            case 4 : bookList.sort(new DescBookTitle()); break;

        }
        return bookList;

    }

    public void printBookList(List<BookDTO> printlist) {

        }
    }
}


