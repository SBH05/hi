package com.teamproject.hamster.model.dao;

import com.teamproject.hamster.dto.CartDTO;
import com.teamproject.hamster.dto.ProductDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CartDAO {
    private static Properties prop = new Properties();

    public CartDAO() {

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/teamproject/hamster/mapper/Cart.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int deleteOrder(Connection con, ArrayList<ProductDTO> cancel) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        int result = 0;
        CartDTO cart = null;

        String query = prop.getProperty("deleteOrder");
        try {
            pstmt = con.prepareStatement(query);

            rset = pstmt.executeQuery();


            cart.setCartNo(rset.getInt("cart_no"));

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}
