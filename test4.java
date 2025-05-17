package Literal;

public class test4{
public static void main (String[]args)
{
	int x = 10;        //(10)8 = (10)       output= 10
	int y = 010;       //0x8 + 1x8 = 8      output= 8
	int z = 0x10;      //(10)16=(16)        output= 16
	System.out.println(x+" "+y+" "+z);
}
}