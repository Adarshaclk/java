class HairRunner{
public static void main(String... args){
 
Hair hair=new Hair();
System.out.println("the lenght hair is: "+hair.legnth);
System.out.println("the color hair is: "+hair.color);
System.out.println("the hair belongs is: "+hair.gender);
System.out.println("the type hair is: "+hair.type);


hair.legnth=20;
hair.color="brown";
hair.gender='f';
hair.type="curly";

System.out.println("the updated lenght hair is: "+hair.legnth);
System.out.println("the updated color hair is: "+hair.color);
System.out.println("the updated uphair belongs is: "+hair.gender);
System.out.println("the updated  type hair is: "+hair.type);
}

}