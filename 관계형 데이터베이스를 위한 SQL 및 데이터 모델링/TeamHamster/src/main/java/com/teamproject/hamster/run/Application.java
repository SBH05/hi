package com.teamproject.hamster.run;


import com.teamproject.hamster.view.MemberView;

import java.sql.Connection;

import static com.teamproject.hamster.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {


//        new MemberView().MemberView();

        new MemberView().updateMember(); // 회원수정

    }
}
