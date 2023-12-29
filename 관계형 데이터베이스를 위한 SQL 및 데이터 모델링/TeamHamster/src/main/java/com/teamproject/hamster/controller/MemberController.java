package com.teamproject.hamster.controller;


import com.teamproject.hamster.model.dto.MemberDTO;
import com.teamproject.hamster.service.MemberService;

import java.util.List;
import java.util.Scanner;

public class MemberController {
    private MemberService memberService = new MemberService();

    List<MemberDTO> checklist = null;
    Scanner sc = new Scanner(System.in);
//    public void registMember() {
//
//        System.out.println("************ 회원가입 ************");
//        System.out.print("이름: ");
//        String name = sc.next();
//        System.out.print("아이디 : ");
//        String id = sc.next();
//        System.out.print("비밀번호 : ");
//        String pwd = sc.next();
//        System.out.print("휴대폰 번호 : ");
//        String phone = sc.next();
//        System.out.print("주소 : ");
//        String address = sc.next();
//
//
//            MemberDTO newMember = new MemberDTO();
//            newMember.setName(name);
//            newMember.setId(id);
//            newMember.setPwd(pwd);
//            newMember.setPhone(phone);
//            newMember.setAddress(address);
//
//
////            checklist
//
//
//
//
//        int result = memberService.registMember(newMember);
//
//        if(result > 0){
//            System.out.println("회원 등록 성공!");
//        }else{
//            System.out.println("회원 등록 실패!");
//        }
//
//    }

    public List<MemberDTO> selectMemberId() {

        List<MemberDTO> memberList = memberService.selectMemberId();

        checklist = memberList;
        //받아온 아이디값을 담아온 것을 여기서 정의한(14줄) 배열에 넣어줌.
        // registMember()메소드에서 아이디체크할 때 쓰려고

        return memberList;
    }

    public void registMember() {

        Scanner sc = new Scanner(System.in);
        System.out.println("************ 회원가입 ************");
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("아이디 : ");
        String id = sc.next();
        System.out.print("비밀번호 : ");
        String pwd = sc.next();
        System.out.print("휴대폰 번호 : ");
        String phone = sc.next();
        System.out.print("주소 : ");
        String address = sc.next();

        MemberDTO newMember = new MemberDTO();



        newMember.setName(name);
        newMember.setId(id);
        newMember.setPwd(pwd);
        newMember.setPhone(phone);
        newMember.setAddress(address);

        memberService.registMember(newMember);

        System.out.println(newMember);


    }

    public List<MemberDTO> selectMemberName() {

        List<MemberDTO> memberNameList = memberService.selectMemberName();

        return memberNameList;
    }

    public List<MemberDTO> updateMember() {

        List<MemberDTO> updateMember = memberService.updateMember();

        return updateMember;
    }




//            if(checkId(id)){
//        Member newMember = new Member(name, id, pwd, phone, true);
//        System.out.println();
//        System.out.println("환영합니다! " + id + "님, 가입축하 쿠폰이 발급되었습니다.");
//        System.out.println();
//        memberList.add(newMember);
//
//        return true;
//    } else{
//
//        return false;
//    }
//}
//    public boolean checkId(String checkId) {
//
//        for (Member m : memberList) {
//
//            if (m.getId().contains(checkId)) { //contains()
//                System.out.println("이미 가입된 회원입니다.");
//                return false;
//            }
//        }
//
//        return true;
//    } //signUp 메소드에서 입력받은 id의 인자를 가져와 equals 검사에 쓸 것이므로
//    // 그 id를 매개변수로 받기 위해 String checkId로 매개변수 자리를 만들어주었다.






}
