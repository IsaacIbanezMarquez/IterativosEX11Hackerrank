
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



// ENUNCIADO:

// La línia:

/* Escriu una línia de N asteriscs. N serà un paràmetre d'entrada del programa. Si s'entra un nombre negatiu missatge d'error "N ha de ser NO negatiu".

Input Format

Enter N que marca quants asteriscs s'han de fer.

Constraints

N és un nombre NO negatiu.

Output Format

N asteriscs en posició horitzontal

Sample Input 0

5
Sample Output 0

*****
Sample Input 1

-5
Sample Output 1

N ha de ser NO negatiu

 */















public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = N;
        String a = "*";
        int value = 0;

        if (N < 0){ System.out.print("N ha de ser NO negatiu");}
        while (count > 0)
        {
            System.out.print(a);
            count--;
        }

    }
}
