package javaproject;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aparna
 */
public class Book implements Serializable{
    String bookname;
    String author;
    String serialno;
    
    
    public Book(){
        bookname=null;
        author=null;
        serialno=null;
        
        
    }
    public void addbook(String book_name,String author_name,String serial_no){
        this.bookname=book_name;
        this.author=author_name;
        this.serialno=serial_no;
        
        
    }
    public String getbookname(){
        return this.bookname;
    }
    public String getauthor(){
        return this.author;
        
    }
    public String getserial(){
        return this.serialno;
    }
   
    
    
    
}
