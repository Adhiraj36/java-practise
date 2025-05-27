import java.util.Arrays;
import java.util.Scanner;
public class Word
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        String[] words=sentence.split("\\s+");
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        for(int i=0; i<words.length; i++)
        {
            for(int j=0; j<words.length - i - 1; j++)
            {
                 System.out.println("");
            }
        System.out.println(words[i]);
        }
    sc.close();
    }
}