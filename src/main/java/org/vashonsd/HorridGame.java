package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class HorridGame implements Executable {
    @Override
    public void start(InputStream is, PrintStream ps) {
        Scanner scan = new Scanner(is);
        String lettersNums= "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder n= new StringBuilder();
        Random randy= new Random();
        while(n.length()<10){
            int index = (int) (randy.nextFloat() * lettersNums.length());
            n.append(lettersNums.charAt(index));
        }
        String str= n.toString();
        //ps.println(str);
        ps.println("Guess a sequence of ten letters and numbers: ");


        boolean done= false;
        while(done==false){
            String st= "";
            String ans= scan.nextLine();
        if(ans.length()==10){
        for(int i=1; i<=str.length(); i++){
            if(ans.substring(i-1, i).equals(str.substring(i-1, i))){
                st= st+ (ans.substring(i-1, i));
            }else if(ans.substring(i-1, i)!=(str.substring(i-1, i))){
                st= st+ "!";
            }if(ans.equals(str)){
            //ps.println("Youre done! ");
            done =true; }
        }
        for(int t=1; t<=ans.length(); t++){
            if((!(str.substring(t - 1, t).equals(ans.substring(t - 1, t))) &&ans.contains(str.substring(t-1, t)))){
                ps.println("It also contains " + (str.substring(t-1, t)));
            }
        }if(ans.equals(str)){
                ps.println("You're done! ");
                done =true; }

        ps.println("What you have so far is: "+ st);}

    }}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }
}
