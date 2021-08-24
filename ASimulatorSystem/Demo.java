package ASimulatorSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
    public static void main(String args[]) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///project","root","Arshat");
            System.out.println(c);

        }catch(Exception e){}
    }

}
