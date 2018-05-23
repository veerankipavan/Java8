package com.java7.topics;

import javax.naming.NamingEnumeration;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandling {

    FileOutputStream fos;
    DataOutputStream dos;

    public void oldTry() {



        try{

            fos= new FileOutputStream("movies.txt");

            dos= new DataOutputStream(fos);

            dos.writeUTF("Java 7 Block Buster");

        } catch(IOException e) {

            e.printStackTrace();

        } finally{

            try{

                fos.close();

                dos.close();

            } catch(IOException e) {

                // log the exception

            }

        }



    }

    public void newTry() {



        try(FileOutputStream fos = new FileOutputStream("movies.txt");

            DataOutputStream dos = new DataOutputStream(fos);) {

            dos.writeUTF("Java 7 Block Buster");

        } catch(IOException e) {

            // log the exception

        }

    }

}
