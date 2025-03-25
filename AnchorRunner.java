class AnchorRunner{
public static void main(String... args){
Anchor anchor=new Anchor();
System.out.println("the weight of anchor is :"+anchor.weight);
System.out.println("the capacity of anchor is :"+anchor.capacity+" tons");
System.out.println("the type of anchor is :"+anchor.type);
System.out.println("the metal  used for anchor is :"+anchor.metal);

anchor.weight=300;
anchor.capacity=200;
anchor.type="doamstic";
anchor.metal="iron";
System.out.println("");

System.out.println("the updated weight of anchor is :"+anchor.weight);
System.out.println("the updated capacity of anchor is :"+anchor.capacity+" tons");
System.out.println("the updated type of anchor is :"+anchor.type);
System.out.println("the updated metal  used for anchor is :"+anchor.metal);



}
}