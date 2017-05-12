public class TestAnd
{
public static void main(String[] anda){
int i = 10, j = 9;
boolean test;
test = i > 10 && j++ > 10;
System.out.println(i);
System.out.println(j);
System.out.println(test);
test = i > 10 & j++ > 10;
System.out.println(i);
System.out.println(j);
System.out.println(test);
}} 


