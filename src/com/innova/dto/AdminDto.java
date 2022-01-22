package com.innova.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

public class AdminDto
{
    private int adminID;
    private String adminName;
    private String adminSurname;
    private Date createdDate;

    public AdminDto(int adminID, String adminName, String adminSurname, Date createdDate) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
        this.createdDate = createdDate;
    }

    public AdminDto() {

    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "adminID=" + adminID +
                ", adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public void setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
