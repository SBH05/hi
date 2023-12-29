package com.teamproject.hamster.model.dto;

public class MemberDTO {

    private Integer code;
    private String name;
    private String id;
    private String pwd;
    private String phone;
    private String address;

    public MemberDTO() {
    }

    public MemberDTO(Integer code, String name, String id, String pwd, String phone, String address) {
        this.code = code;
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
