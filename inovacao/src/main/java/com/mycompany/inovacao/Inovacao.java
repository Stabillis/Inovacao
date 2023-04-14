/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inovacao;

/**
 *
 * @author victo
 */
public class Inovacao {
    public static void main(String[] args) {
        try{
            System.out.println(Runtime.getRuntime().exec("explorer"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
