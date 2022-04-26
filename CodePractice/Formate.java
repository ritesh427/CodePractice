/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            char arr []= new char[n];
            char arr2 []= new char[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=s.charAt(i);
                arr2[i]=s.charAt(i);
                
            }
            for(int i=0;i<5;i++){ 
              for(int j=0;j<s.length();j++){ 
                if(arr[j]=='?'){ 
                  arr[j]=(char)(i+'a'); 
                } 
                else{ 
                  arr[j]=arr[j]; 
                } 
              } 
              for (int l = 0; l < arr.length; l++) {
                if(arr[l]==t[l]){ 
                    System.out.println(arr);
                    break;
                  } 
              }
              
            } 
            System.out.println(-1);
          }

        }
    

