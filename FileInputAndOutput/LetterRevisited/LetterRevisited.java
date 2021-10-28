//File input and output Letter Revisited 40 pts Angel Chuang
import java.io.*;
import java.util.*;
public class LetterRevisited 
{
    public static void main(String[] args) throws IOException
    {
    File letter = new File("letter.txt");
    FileWriter fw = new FileWriter(letter);
    PrintWriter pw = new PrintWriter(fw);
        pw.println("+---------------------------------------------------------+");
        pw.println("|                                                     ####|");
        pw.println("|                                                     ####|");
        pw.println("|                                                     ####|");
        pw.println("|                                                         |");
        pw.println("|                                                         |");
        pw.println("|                             Angel Chuang                |");
        pw.println("|                             217 Kexueyuan Rd            |");
        pw.println("|                             East Dist. Hsinchu City 300 |");
        pw.println("|                                                         |");
        pw.println("+---------------------------------------------------------+");
        pw.close(); 
    }
}