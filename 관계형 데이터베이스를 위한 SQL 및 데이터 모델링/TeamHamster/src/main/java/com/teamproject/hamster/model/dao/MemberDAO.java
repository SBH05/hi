package com.teamproject.hamster.model.dao;

import java.sql.Connection;
import com.teamproject.hamster.model.dto.MemberDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.teamproject.hamster.common.JDBCTemplate.close;

public class MemberDAO {
    private Properties prop = new Properties();
    public MemberDAO(){

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/teamproject/hamster/mapper/member-query.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public List<MemberDTO> selectMemberId(Connection con) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<MemberDTO> memberList = null;

        String query = prop.getProperty("selectMemberId");

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            memberList = new ArrayList<>();

            while(rset.next()){
                MemberDTO member = new MemberDTO();
                member.setId(rset.getString("MEMBER_ID"));

                memberList.add(member);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rset);
            close(pstmt);
        }
        return memberList;

    }

    public int registMember(Connection con, MemberDTO newMember) {
        int result = 0;
        PreparedStatement pstmt = null;
        String query = prop.getProperty("registMember");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, null);
            pstmt.setString(2,newMember.getName());
            pstmt.setString(3,newMember.getId());
            pstmt.setString(4,newMember.getPwd());
            pstmt.setString(5,newMember.getPhone());
            pstmt.setString(6,newMember.getAddress());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }close(pstmt);


        return result;
    }

    public List<MemberDTO> selectMemberName(Connection con) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<MemberDTO> memberNameList = null;

        String query = prop.getProperty("selectMemberName");

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            memberNameList = new ArrayList<>();

            while(rset.next()){
                MemberDTO member = new MemberDTO();
                member.setName(rset.getString("member_name"));

                memberNameList.add(member);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rset);
            close(pstmt);
        }
        return memberNameList;

    }

    public List<MemberDTO> updateMember(Connection con) {

        PreparedStatement pstmt = null;
        int result = 0;

        List<MemberDTO> memberNameList = null;

        String query = prop.getProperty("updateMember");

        try {
            pstmt = con.prepareStatement(query);

            memberNameList = new ArrayList<>();




        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        return memberNameList;


    }


}
