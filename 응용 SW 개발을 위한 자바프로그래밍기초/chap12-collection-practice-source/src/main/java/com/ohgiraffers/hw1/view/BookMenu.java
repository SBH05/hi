package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();
    public BookMenu() {
    }
    public void mainMenu() {
        bm = new BookManager();
        while (true){
            System.out.println("***     도서 관리 프로그램      ***");
            System.out.println("1. 새 도서 추가.");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 프로그램 종료 ");
            System.out.println("*********************************");
            System.out.print("원하시는 프로그램을 선택해주세요 : ");
            int a = sc.nextInt();
            sc.nextLine();

            }
        }

    }
    public BookDTO inputBook(){
        System.out.print("도서 번호를 입력해주세요 : ");
        int bNo = sc.nextInt();
        System.out.print("도서 장르 ( 1 : 인문 / 2 : 자연과학 / 3 : 의료 / 4 : 기타) 를 선택해주세요.");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("도서 저자를 입력해주세요 : ");
        String author = sc.nextLine();

        BookDTO bookList = new BookDTO(bNo,category,title,author);

        System.out.println("추가하신 도서는 " + bookList + "입니다.");

        return bookList;
    }
    public int inputBookNo(){

    }
    public String inputBookTitle (){


        return title;
    }
    public List<BookDTO> selectSortedBook(){
        System.out.println("도서 정렬 방식을 선택해주세요.");
        System.out.println("1. 도서번호 (ISBN)으로 오름차순 정렬");
        System.out.println("2. 도서번호 (ISBN)으로 내림차순 정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정렬");



        return

    }
}
