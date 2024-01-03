package com.teamproject.hamster.model;

import com.teamproject.hamster.dao.CartMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;



public class CartService {


    public static boolean cancel(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        //삭제
        SqlSession sqlSession = getSqlSession();

        CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
        int result = cartMapper.deleteCart(code);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    private static SqlSession getSqlSession() {
        return null;
    }


}
