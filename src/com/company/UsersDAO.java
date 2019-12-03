package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.HashMap;


public class UsersDAO {
    private ObjectOutputStream objectOutput; //Read from file
    private ObjectInputStream objectInput; //Write from file


    public void saveUser(UsersInfo user) throws IOException, ClassNotFoundException {
        try {
            objectOutput = new ObjectOutputStream(new FileOutputStream("file.txt", true));
            this.objectOutput.writeObject(user);
            this.objectOutput.close();
            System.out.println("The data has been saved");
        } catch (IOException e) {
                e.printStackTrace();
        }

    }

    public void getAllUsers() throws IOException, ClassNotFoundException {
            try{
                FileInputStream fin = new FileInputStream("file.txt");
                while(true){
                    ObjectInputStream ois = new ObjectInputStream(fin);
                    UsersInfo user = (UsersInfo) ois.readObject();
                    System.out.println("Name: " + user.getName());
                    System.out.println("Phone number: " + user.getPhoneNumber());
                }
            }
            catch (EOFException eof) {
                System.out.println("Reached end of file");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    }
    public UsersInfo returnUser(String name){
        try{
            FileInputStream fin = new FileInputStream("file.txt");
            while(true){
                ObjectInputStream ois = new ObjectInputStream(fin);
                UsersInfo user = (UsersInfo) ois.readObject();
                if(user.getName().equals(name))
                    return user;
            }

        } catch (EOFException eof) {
            System.out.println("No such user exist.");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
