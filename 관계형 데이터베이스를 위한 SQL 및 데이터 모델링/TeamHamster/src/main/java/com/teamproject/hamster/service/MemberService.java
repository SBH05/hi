package com.teamproject.hamster.service;



import com.teamproject.hamster.model.dao.MemberDAO;
import com.teamproject.hamster.model.dto.MemberDTO;

import java.sql.Connection;
import java.util.List;

import static com.teamproject.hamster.common.JDBCTemplate.close;
import static com.teamproject.hamster.common.JDBCTemplate.getConnection;


public class MemberService {

    private MemberDAO memberDAO = new MemberDAO();

    public List<MemberDTO> selectMemberId() {

        Connection con = getConnection();

        List<MemberDTO> memberList = memberDAO.selectMemberId(con);
        close(con);
        return memberList;
    }


    public int registMember(MemberDTO newMember) {

        Connection con = getConnection();


        int result = memberDAO.registMember(con, newMember);

        return result;

    }

    public List<MemberDTO> selectMemberName() {

        Connection con = getConnection();

        List<MemberDTO> memberNameList = memberDAO.selectMemberName(con);
        close(con);
        return memberNameList;
    }

    public List<MemberDTO> updateMember() {
        Connection con = getConnection();

        List<MemberDTO> modifyMember = memberDAO.updateMember(con);
        close(con);
        return modifyMember;

    }
}
