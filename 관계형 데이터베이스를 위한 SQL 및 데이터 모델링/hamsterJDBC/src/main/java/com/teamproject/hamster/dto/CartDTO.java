package com.teamproject.hamster.dto;

public class CartDTO {

    private int selectCount;
    private int cartNo;
    private int memberNo;
    private int sizeNo;

    public CartDTO() {
    }

    public CartDTO(int selectCount, int cartNo, int memberNo, int sizeNo) {
        this.selectCount = selectCount;
        this.cartNo = cartNo;
        this.memberNo = memberNo;
        this.sizeNo = sizeNo;
    }

    public int getSelectCount() {
        return selectCount;
    }

    public void setSelectCount(int selectCount) {
        this.selectCount = selectCount;
    }

    public int getCartNo() {
        return cartNo;
    }

    public void setCartNo(int cartNo) {
        this.cartNo = cartNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getSizeNo() {
        return sizeNo;
    }

    public void setSizeNo(int sizeNo) {
        this.sizeNo = sizeNo;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "selectCount=" + selectCount +
                ", cartNo=" + cartNo +
                ", memberNo=" + memberNo +
                ", sizeNo=" + sizeNo +
                '}';
    }
}
