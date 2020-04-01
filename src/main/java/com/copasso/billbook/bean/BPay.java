package com.copasso.billbook.bean;

public class BPay {
    private Integer id;

    private String uid;

    private String payName;

    private String payImg;

    private String payNum;

    public BPay() {
        super();
    }

    public BPay(String uid, String payName, String payImg, String payNum) {
        this.uid = uid;
        this.payName = payName;
        this.payImg = payImg;
        this.payNum = payNum;
    }

    public BPay(Integer id, String uid, String payName, String payImg, String payNum) {
        this.id = id;
        this.uid = uid;
        this.payName = payName;
        this.payImg = payImg;
        this.payNum = payNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getPayImg() {
        return payImg;
    }

    public void setPayImg(String payImg) {
        this.payImg = payImg == null ? null : payImg.trim();
    }

    public String getPayNum() {
        return payNum;
    }

    public void setPayNum(String payNum) {
        this.payNum = payNum == null ? null : payNum.trim();
    }
}