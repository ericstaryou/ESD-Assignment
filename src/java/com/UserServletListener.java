/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Eric
 */
public class UserServletListener implements ServletContextListener {

    private Connection conn = null;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        String db = sc.getInitParameter("dbname");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db.trim(), "root", "");
        }
        catch(ClassNotFoundException | SQLException e){
            sc.setAttribute("error", e);
        }
        sc.setAttribute("connection", conn);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try { conn.close(); } catch(SQLException e) {}
    }
}
