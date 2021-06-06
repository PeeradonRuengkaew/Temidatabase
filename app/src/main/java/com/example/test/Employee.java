package com.example.test;

public class Employee
{
    private String Username;
    private String Password;
    public Employee(){}
    public Employee(String Username,String Password)
    {
        this.Username = Username;
        this.Password = Password;

    }
    public String getUsername()
    {
        return Username;
    }
    public void setUsername(String Username)
    {
        this.Username = Username;
    }
    public String getPassword()
    {
        return Password;
    }
    public void setPassword(String Password)
    {
        this.Password = Password;
    }


}

