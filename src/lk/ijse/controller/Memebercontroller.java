/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.controller;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.library.Db.DBconnction;
import lk.ijse.library.model.Member;

public class Memebercontroller {
   public static boolean addmember(Member member) throws ClassNotFoundException, SQLException{
       Connection connection=DBconnction.getDBconnection().getConnection();
       String sql="insert into member values(?,?,?,?)";
       PreparedStatement smt=connection.prepareStatement(sql);
       smt.setObject(1,member.getMemberid());
       smt.setObject(2,member.getName());
       smt.setObject(3, member.getAddrss());
       smt.setObject(4,member.getStatus());
       return smt.executeUpdate()>0;
   }
   public static Member search(String mid) throws ClassNotFoundException, SQLException{
       Connection connection=DBconnction.getDBconnection().getConnection();
       String sql="select *from member where id='"+mid+"'";
       Statement stm=connection.createStatement();
       ResultSet rst = stm.executeQuery(sql);
       Member member=new Member();
       rst.next();
       //member.setMemberid(rst.getString("id"));
       member.setName(rst.getString("name"));
       member.setAddrss(rst.getString("adress"));
       member.setStatus(rst.getString("status"));
       return member;
   }
   public static boolean deletemember(String mid) throws ClassNotFoundException, SQLException{
        Connection connection=DBconnction.getDBconnection().getConnection();
        String sql="delete from member where id='"+mid+"'";
         Statement stm=connection.createStatement();
        return stm.executeUpdate(sql)>0;
   } 
}
