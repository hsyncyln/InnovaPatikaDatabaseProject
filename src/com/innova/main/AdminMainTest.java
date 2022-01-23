package com.innova.main;

import com.innova.controller.AdminController;
import com.innova.dto.AdminDto;

public class AdminMainTest {
    public static void main(String[] args) {
        AdminController adminController = new AdminController();
        AdminDto adminDto = new AdminDto();

        //insert
        //adminDto.setAdminName("Abc");
        //adminDto.setAdminSurname("Def");
        //adminController.Insert(adminDto);

        //update
        //adminDto.setAdminName("XYZ");
        //adminDto.setAdminSurname("DEF");
        //adminDto.setAdminID(4);
        //adminController.Update(adminDto);

        //delete
        //adminDto.setAdminID(4);
        //adminController.Delete(adminDto);

        var list = adminController.List();
        for (var item : list) {
            System.out.println(item);
        }


    }
}
