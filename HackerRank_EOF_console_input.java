/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EOF;

import java.util.Scanner;

public class HackerRank_EOF_console_input{
    public static void main(String[] args)throws Exception{
           
            Scanner sc = new Scanner(System.in);
            int line_no = 1;
            while(sc.hasNext())
            {               
                String line = sc.nextLine();
                System.out.println(line_no + " " + line);
                line_no++;
            }
    }
}
