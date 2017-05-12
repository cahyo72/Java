public class Testincrement
{
public static void main(String[] ada){
int i = 4, k = 0;
k = i-- + 2 *i*++i;
System.out.println("i ="+i);
System.out.println("k ="+k);
k=--i+2*i*i++;
System.out.println("i ="+i);
System.out.println("k ="+k);
}} 