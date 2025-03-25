class TerraceRunner{
public static void main(String... args){
Terrace terrace=new Terrace();

System.out.println("the length of the terrace is :"+terrace.length);
System.out.println("the width of the terrace is :"+terrace.width);
System.out.println("does the terraceas elivator :"+terrace.elivator);
System.out.println("floor number where the terrace is located :"+terrace.floor_no);

terrace.length=30;
terrace.width=20;
terrace.elivator=true;
terrace.floor_no=9;

System.out.println("the length of the terrace is :"+terrace.length);
System.out.println("the width of the terrace is :"+terrace.width);
System.out.println("does the terraceas elivator :"+terrace.elivator);
System.out.println("floor number where the terrace is located :"+terrace.floor_no);
}

}