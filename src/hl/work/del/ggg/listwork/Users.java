package hl.work.del.ggg.listwork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Users {
    private  String name;
    private  int password;
    public Users(){
    }

    public Users(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
