package language.basics;

public class DataTypes {
/*
Data-type 	Variable = 	data;
Data-type represents nature of data and how much of memory required
Variable is nothing but the name of memory location where we are going to store the data
 = is a operator i.e special character used to perform specific operation in programming
Data is a piece of information to store for future reference
; ===> is a semicolon, its purpose is to end the line
	*/
/*
 Data types in java are divided into two groups
Primitive Data Types ==> Included byte, short, int, long, float, double, boolean and char
primitive data types are pre-defined where as non-primitive data types are not pre-defined
In primitive data types ====> 1. Amount of memory and 2. The range of values both are fixed


Non primitive Data Types ==> String, Arrays and class
 */
	
/*
1 byte = 8 bit 
       ===> 2*8 ====> 256
       ===> range will be -128 to +127 ( to 127 because it also accommodate 0 )	

Data types: byte(1byte), short(2byte), int(4byte), long(8byte)only numerical data types without decimals
whereas float(4bytes)(6to7 decimal digits) and double(8bytes)(15decimal digits) numerical with decimals
boolean(1bit) stores true of false value
char(2bytes) stores a single character/letter or ASCII values
 */
	public static void main(String[] args) {
byte a = 127;
short c= 32767;
int	b = 2147483;
long phonenumber = 7020701462L;
float k = 12.343344f;
double l = 3287328.12345679012345;
char semicolon = ';';
System.out.println(phonenumber);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(k);
System.out.println(l);
System.out.println(semicolon);


	}

}
