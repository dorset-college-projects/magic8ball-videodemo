/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magic8Balll;
import java.util.Random;
/**
 *
 * @author John Rowley
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] ball8 = {"It is certain", "It is decidedly so", "Without a doubt", "Yes – definitely",
"You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes",
"Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now",
"Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no",
"Outlook not so good", "Very doubtful"};

Random answer = new Random(); // ignore this error
int answer1 = answer.nextInt(ball8.length);

System.out.println(ball8[answer1]);
    }
    
}
