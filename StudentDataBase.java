package javaproject;

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aparna
 */
public class StudentDataBase implements Serializable
{
    String name;
    String rollno;
    String password;
    String borrowed[]=new String[100];
    int nborrow;
    
    public StudentDataBase(){
        name=null;
        rollno=null;
        password=null;
        for(int i=0;i<100;i++)
            borrowed[i]=null;
        nborrow=0;
        
        
    }
    public void removeborrow(String str)
    {
      StudentDataBase sdb2=new StudentDataBase();
        ArrayList<StudentDataBase> al=new ArrayList();
        int flag=-1;
        int j;
        try{
             FileInputStream fis ;
             fis= new FileInputStream("students.txt");
             ObjectInputStream ois;
             ois =new ObjectInputStream(fis);
             while((sdb2=(StudentDataBase)ois.readObject())!=null)
             {
                 if(sdb2.getrollno().equals(this.getrollno()))
                 {
                     for(int i=0;i<this.nborrow;i++){
                         if(str.equals(this.borrowed[i])){
                              flag=i;
                              break;
                             //this.borrowed[i]=this.borrowed[i+1];
                             //sdb2.borrowed[i]=sdb2.borrowed[i+1];
                         }
                         //this.borrowed[i]=null;
                         //sdb2.borrowed[i]=null;
                         
                           //this.borrowed[i]=null;
                            //this.nborrow--;
                           //sdb2.borrowed[i]=null;
                          // sdb2.nborrow--;
                         }
                     if(flag!=-1)
                     {
                         for(j=flag;j<this.nborrow-1;j++)
                         {
                             this.borrowed[j]=this.borrowed[j+1];
                             sdb2.borrowed[j]=sdb2.borrowed[j+1];
                         }
                     this.borrowed[j]=null;
                         sdb2.borrowed[j]=null;
                         this.nborrow--;
                         sdb2.nborrow--;
                          JOptionPane.showMessageDialog(null, "You have successfully returned the book","Message",JOptionPane.INFORMATION_MESSAGE);
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "You have not issued this book!","Message",JOptionPane.ERROR_MESSAGE);
                     }
                    
                 }
                 al.add(sdb2);
             }
             ois.close();
             fis.close();
        }
        catch(FileNotFoundException e)
        {
        }
        catch(EOFException e)
        {
        }
        catch(ClassNotFoundException e)
        {
        }
        catch(IOException e)
        {
               e.printStackTrace();
        }
        try{
          // System.out.println("Entering try");
           FileOutputStream fos;
           fos=new FileOutputStream("students.txt");
           ObjectOutputStream oos;
           oos=new ObjectOutputStream(fos);
           Iterator i = al.iterator();
                while(i.hasNext())
                {
                   // System.out.println("Inside while");
                    sdb2=(StudentDataBase)i.next();
                    //System.out.println("Inside while2");
                    oos.writeObject(sdb2);
                 //   System.out.println("Inside while");
                }
               // System.out.println("Outside while");
                fos.close();
                oos.close();
               
           
     
        }catch(IOException e){}  
    }
   public void addborrow(String str)
    {
        StudentDataBase sdb2=new StudentDataBase();
        ArrayList<StudentDataBase> al=new ArrayList();
        
        try{
             FileInputStream fis ;
             fis= new FileInputStream("students.txt");
             ObjectInputStream ois;
             ois =new ObjectInputStream(fis);
             while((sdb2=(StudentDataBase)ois.readObject())!=null)
             {
                 if(sdb2.getrollno().equals(this.getrollno()))
                 {
                     this.borrowed[nborrow]=str;
                     this.nborrow++;
                     sdb2.borrowed[nborrow]=str;
                     sdb2.nborrow++;
                 }
                 al.add(sdb2);
             }
             ois.close();
             fis.close();
        }
        catch(FileNotFoundException e)
        {
        }
        catch(EOFException e)
        {
        }
        catch(ClassNotFoundException e)
        {
        }
        catch(IOException e)
        {
               e.printStackTrace();
        }
        try{
          // System.out.println("Entering try");
           FileOutputStream fos;
           fos=new FileOutputStream("students.txt");
           ObjectOutputStream oos;
           oos=new ObjectOutputStream(fos);
           Iterator i = al.iterator();
                while(i.hasNext())
                {
                   // System.out.println("Inside while");
                    sdb2=(StudentDataBase)i.next();
                    //System.out.println("Inside while2");
                    oos.writeObject(sdb2);
                 //   System.out.println("Inside while");
                }
                //System.out.println("Outside while");
                fos.close();
                oos.close();
                JOptionPane.showMessageDialog(null, "You have successfully issued the book","Message",JOptionPane.INFORMATION_MESSAGE);
           
     
        }catch(IOException e){}
    }
    public void addrecord(String name1,String rollno1, String password1, String borr)
    {
        this.name=name1;
        this.rollno=rollno1;
        this.password=password1;
        for(int i=0;i<100;i++)
        {
            if( borrowed[i]==null)
           {
               borrowed[i]=borr;
               break;
           }
        }
        
        
    }
    public String getname(){
        return this.name;
    }
    public String getrollno(){
        return this.rollno;
        
    }
    public String getpassword(){
        return this.password;
    }
    public void printborrow(){
        StudentDataBase sdb3=new StudentDataBase();
        
        
        try{
             FileInputStream fis ;
             fis= new FileInputStream("students.txt");
             ObjectInputStream ois;
             ois =new ObjectInputStream(fis);
             while((sdb3=(StudentDataBase)ois.readObject())!=null)
             {
                 if(sdb3.getrollno().equals(this.getrollno()))
                 {
                     for(int i=0;i<sdb3.nborrow;i++)
                     {
                         if(!this.borrowed[i].equals(null))
                         System.out.println(this.borrowed[i]);
                     }
                     
                 }
                 
             }
             ois.close();
             fis.close();
        }
        catch(FileNotFoundException e)
        {
        }
        catch(EOFException e)
        {
        }
        catch(ClassNotFoundException e)
        {
        }
        catch(IOException e)
        {
               e.printStackTrace();
        }
        
        
    }
   public int getnborrow(){
       return nborrow;
   }
    
    
    
}
