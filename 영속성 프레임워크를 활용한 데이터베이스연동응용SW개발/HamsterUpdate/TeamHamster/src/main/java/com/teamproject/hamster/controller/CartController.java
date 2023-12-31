package com.teamproject.hamster.controller;

import com.teamproject.hamster.dto.ProductDTO;
import com.teamproject.hamster.view.ListView;
import com.teamproject.hamster.controller.PaymentController;

import java.util.ArrayList;
import java.util.Scanner;


public class CartController {
    ListView LM = new ListView();
    Scanner sc = new Scanner(System.in);

    ArrayList<ProductDTO> SbList = new ArrayList<>();
    public void shopBasket() {
        while (true) {

            System.out.println("1. 선택한 상품 보기");
            System.out.println("2. 사이즈 변경");
            System.out.println("3. 상품 취소");
            System.out.println("4. 상품 더 보기");
            System.out.println("5. 결제 하기");
            System.out.println("0. 메인페이지로 돌아가기");
            System.out.print("번호를 입력 하세요 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1 :
                    System.out.println(SbList);
                    continue;
                case 2:
                    changeSize(SbList);
                    continue;
                case 3:
                    cartCancel(SbList);
                    continue;
                case 4:
                    selectMenu();
                    continue;
                case 5:
                    PaymentController pc = new PaymentController();
                    pc.print(SbList);
                    break;
                case 0 :
                    System.out.println("메인페이지로 돌아갑니다.");
                    break;
            }
            break;
        }
    }


    public void selectMenu() {
        int productNumber = 0;

        ArrayList<ProductDTO> productList = new ListView().getProductList();

        while (true){
            System.out.println();

            if (SbList.size() > 0) {
                System.out.println("============선택한 상품 목록입니다============");
                for (int i = 0; i < SbList.size(); i++) {
                    System.out.println((i + 1) + ")" + SbList.get(i).getName() + " | 사이즈: " + SbList.get(i).getSize() + " | 금액: " + SbList.get(i).getPrice() + "원");

                }
            }

            System.out.println("============준비된 상품 목록입니다============");
            for (int i = 0; i < productList.size(); i++) {
                System.out.println((i + 1) + ") " + productList.get(i).getName() + " | 사이즈: " + productList.get(i).getSize() + " | 금액: " + productList.get(i).getPrice() + "원");
            }
            System.out.println("==========================================");
            System.out.print(productList.size()+1+") 선택상품 초기화\n");
            System.out.print(productList.size()+2+") 메인페이지로 돌아가기\n");


            if (SbList.size() > 0) {
                System.out.print(productList.size()+3+") 장바구니가기\n"); // 장바구니호출하기
            }
            System.out.print("선택할 상품을 입력하세요 : ");
            productNumber = sc.nextInt();


            if (productNumber == productList.size()+1) {
                SbList.clear();
            }
            if (productList.size() > productNumber - 1) {
                SbList.add(productList.get(productNumber - 1));
            }

            if (productNumber == productList.size()+2) {
                break;
            }
            if (productNumber == 18) {
                shopBasket();
                break;
            }

        }
    }


    public ArrayList<ProductDTO> getSbLists(){  // 선택한 상품목록 메소드
        return SbList;
    }

    // 선택 취소 메소드
    public void cartCancel(ArrayList<ProductDTO> cancel) { // 선택 취소 메소드
        for (int i = 0; i < cancel.size(); i++) { //담은 목록 출력
            System.out.print(cancel.get(i).getName() + ", ");
            System.out.print(cancel.get(i).getSize() + ", ");
            System.out.println(cancel.get(i).getPrice() + " ");
        }
        System.out.println("어떤 것을 취소하겠습니까? ");
        sc.nextLine();
        System.out.print("신발 이름을 입력하세요 : ");
        String st = sc.nextLine();
        System.out.print("선택한 사이즈를 입력하세요 : ");
        int siz = sc.nextInt();
        for (int i = 0; i < cancel.size(); i++) {
            if (st.equals(cancel.get(i).getName()) && siz == cancel.get(i).getSize()) {
                System.out.println(cancel.get(i).getName() + " " + cancel.get(i).getSize() + "취소 되었습니다.");
                cancel.remove(i); //제거 기능(인덱스)
                System.out.println("장바구니에 돌아 갑니다.");
                shopBasket(); //장바구니에 돌아감
            }
        }
        System.out.println("잘못 입력하셨습니다");
    }


    //사이즈 변경 메소드
    public void changeSize(ArrayList<ProductDTO> change) {
        for (int i = 0; i < change.size(); i++) { //담은 목록 출력
            System.out.print(change.get(i).getName() + ",  ");
            System.out.print(change.get(i).getSize() + ",  ");
            System.out.println(change.get(i).getPrice() + " ");
        }

        System.out.println("어떤 것을 변경합니까? ");
        sc.nextLine();
        System.out.print("신발 이름을 입력하세요 : ");
        String st = sc.nextLine();
        System.out.print("선택한 사이즈를 입력하세요 : ");
        int siz = sc.nextInt();
        int pr = 0;

        ListView mv = new ListView();
        ArrayList<ProductDTO> productList = mv.getProductList();


        for (int j = 0; j < change.size(); j++) {
            if (st.equals(change.get(j).getName()) && siz == change.get(j).getSize()) {
                change.remove(j);
                for (int i = 0; i < productList.size(); i++) {
                    if (st.equals(productList.get(i).getName())) {
                        System.out.println("제품 이름 : " + productList.get(i).getName());
                        System.out.println("제품 사이즈 : " + productList.get(i).getSize());
                        System.out.println("제품 가격 : " + productList.get(i).getPrice());
                    }
                }
                System.out.println("===변경 할 수 있는 사이즈 목록===");

                System.out.print("변경할 사이즈를 입력 해주세요 : ");
                int chan = sc.nextInt();

                for (int i = 0; i < productList.size(); i++) {
                    if (st.equals(productList.get(i).getName())) {
                        pr = productList.get(i).getPrice();
                        change.add(new ProductDTO(st, chan, pr));
                        break;
                    }
                }
                System.out.println(st + " " + chan + "사이즈로 변경 되었습니다.");
                System.out.println("장바구니에 돌아 갑니다.");
                shopBasket(); //장바구니에 돌아감
            }
        }
        System.out.println("잘못 입력하셨습니다");
    }


}

