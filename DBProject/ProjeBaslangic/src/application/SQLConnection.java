package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
	
public Connection connection;
    public  Connection getConnection(){


    	try
    	{
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/database2?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "yasemin987.");


    	} catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    }

}

