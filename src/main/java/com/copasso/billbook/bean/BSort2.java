package com.copasso.billbook.bean;

public class BSort2 extends BaseBean {
    private Integer id;

    private String uid;

    private String sortName;

    private String sortImg;

    private Integer priority;

    private Boolean income;

    public BSort2() {
        super();
    }

    public BSort2(BSort sort) {
        this.id = sort.getId();
        this.uid = sort.getUid();
        this.sortName = sort.getSortName();
        this.sortImg = sort.getSortImg();
        this.income = sort.getIncome();
    }

    public BSort2(String uid, String sortName, String sortImg, Boolean income) {
        this.uid = uid;
        this.sortName = sortName;
        this.sortImg = sortImg;
        this.income = income;
    }

    public BSort2(Integer id, String uid, String sortName, String sortImg, Integer priority, Boolean income) {
        this.id = id;
        this.uid = uid;
        this.sortName = sortName;
        this.sortImg = sortImg;
        this.priority = priority;
        this.income = income;
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

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }

    public String getSortImg() {
        return sortImg;
    }

    public void setSortImg(String sortImg) {
        this.sortImg = sortImg == null ? null : sortImg.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getIncome() {
        return income;
    }

    public void setIncome(Boolean income) {
        this.income = income;
    }
}