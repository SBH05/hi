package com.teamproject.hamster.view;


import com.teamproject.hamster.controller.MemberController;
import com.teamproject.hamster.model.dto.MemberDTO;
import com.teamproject.hamster.service.MemberService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberView {

    private MemberController memberController = new MemberController();
    Scanner sc = new Scanner(System.in);
    public void MemberView(){

//        List<MemberDTO> memberList = new ArrayList<>();


        do{
            System.out.println("******************************************************");
            System.out.println("회원가입 부분 데이터베이스 not null 조건 오류있음. 잘 실행되는지는 3번 눌러서 확인. id만 가져오는 쿼리입니다. ");
            System.out.println("2. 회원가입 ");
            System.out.println("******************************************************");
            System.out.println();
            System.out.print("번호 선택 : ");
            int num = sc.nextInt();

            switch (num) {

                case 2:
                    memberController.registMember();
                    break;
                case 3:
                    List<MemberDTO> memberList = memberController.selectMemberId();
                    System.out.println(memberList);
                        break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }

        }while(true);

    }

    public void updateMember() {
         do {
            System.out.println("**************회원정보 수정*****************");
            System.out.print("수정할 회원의 이름을 입력하세요 : ");
            String modifyMember = sc.nextLine();

            List<MemberDTO> memberNameList = memberController.selectMemberName();
            boolean istrue = false;
             for (MemberDTO mem : memberNameList) {
                 if (modifyMember.equals(mem.getName())) {
                     istrue = true;
                 }
            }


               if (istrue) {

                   List<MemberDTO> updateMember = memberController.updateMember();


                   do {
                       System.out.println("\n1 이름변경");
                       System.out.println("2 아이디변경");
                       System.out.println("3 비밀번호변경");
                       System.out.println("4 휴대폰번호변경");
                       System.out.println("5 주소변경");
                       System.out.print(modifyMember+"회원님의 수정할 목록을 입력하세요 : ");
                       int no = sc.nextInt();

                       switch (no) {
                           case 1 : break ;
                           case 2 : break ;
                           case 3 : break ;
                           case 4 : break ;
                           case 5 : break ;
                           default:
                               System.out.print("\n없는 번호입니다! 다시입력하세요 : "); continue;
                       }
                   }while (true);



            } else {
                System.out.println("없는 회원입니다ㅜㅜ 다시 입력하세요 : \n"); continue;
            }

        } while (true);
    }

}
