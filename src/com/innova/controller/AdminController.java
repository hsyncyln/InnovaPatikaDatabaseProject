package com.innova.controller;

import com.innova.dao.AdminDao;
import com.innova.dao.IDaoConnection;
import com.innova.dto.AdminDto;

import java.util.ArrayList;
import java.util.List;

public class AdminController implements IDaoConnection<AdminDto> {

    private  AdminDao adminDao;
    private AdminDto adminDto;
    private List<AdminDto> adminList;
    @Override
    public void Insert(AdminDto adminDto) {
        adminDao = new AdminDao();
        adminDao.Insert(adminDto);
    }

    @Override
    public void Update(AdminDto adminDto) {
        adminDao = new AdminDao();
        adminDao.Update(adminDto);
    }

    @Override
    public void Delete(AdminDto adminDto) {
        adminDao = new AdminDao();
        adminDao.Delete(adminDto);
    }

    @Override
    public ArrayList<AdminDto> List() {
        adminDao = new AdminDao();
        return adminDao.List();
    }
}
