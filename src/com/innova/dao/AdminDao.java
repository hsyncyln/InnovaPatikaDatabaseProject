package com.innova.dao;

import com.innova.dto.AdminDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDao implements IDaoConnection<AdminDto> {


    @Override
    public void Insert(AdminDto adminDto) {
        try(Connection connection = getInterfaceConnection()) {
            String sql = "insert into admin(admin_name,admin_surname) values(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());

            int rowEffected = preparedStatement.executeUpdate();
            if(rowEffected > 0){
                System.out.println(AdminDao.class + " başarılı");
            }
            else{
                System.out.println(AdminDao.class + " başarısız");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Update(AdminDto adminDto) {
        try(Connection connection = getInterfaceConnection()) {
            String sql = "update innova_patika_project_1.admin set admin_name = ? , admin_surname = ? where admin_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());
            preparedStatement.setInt(3, adminDto.getAdminID());

            int rowEffected = preparedStatement.executeUpdate();
            if(rowEffected > 0){
                System.out.println(AdminDao.class + " başarılı");
            }
            else{
                System.out.println(AdminDao.class + " başarısız");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void Delete(AdminDto adminDto) {

        try(Connection connection = getInterfaceConnection()) {
            String sql = "delete from innova_patika_project_1.admin where admin_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, adminDto.getAdminID());

            int rowEffected = preparedStatement.executeUpdate();
            if(rowEffected > 0){
                System.out.println(AdminDao.class + " başarılı");
            }
            else{
                System.out.println(AdminDao.class + " başarısız");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<AdminDto> List() {
        try(Connection connection = getInterfaceConnection()) {
            String sql = "SELECT * FROM innova_patika_project_1.admin";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            var result = preparedStatement.executeQuery();

            ArrayList<AdminDto> list = new ArrayList<>();

            while (result.next()){

                var dto = new AdminDto();
                dto.setAdminID(result.getInt("admin_id"));
                //dto.setAdminID(Integer.parseInt(result.getObject(1).toString()));

                dto.setAdminName(result.getString("admin_name"));
                //dto.setAdminName(result.getObject(2).toString());

                dto.setAdminSurname(result.getString("admin_surname"));
                //dto.setAdminSurname(result.getObject(3).toString());

                dto.setCreatedDate(result.getDate("date_created"));

                list.add(dto);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
