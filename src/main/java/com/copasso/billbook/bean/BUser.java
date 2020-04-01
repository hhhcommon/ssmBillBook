package com.copasso.billbook.bean;

public class BUser extends BaseBean {
    private String id;

    private String username;

    private Float budget;

    private Integer state;

    public BUser() {
        super();
    }

    public BUser(String username, Float budget) {
        this.username = username;
        this.budget = budget;
    }

    public BUser(String id, String username, Float budget) {
        this.id = id;
        this.username = username;
        this.budget = budget;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget == null ? null : budget;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}