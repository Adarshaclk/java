class IronBoxRunner
{
public static void main(String... args){
IronBox ironbox=new IronBox();
System.out.println("the brand of iron box is :"+ironbox.brand);
System.out.println("the legnth  of  wire in iron box is :"+ironbox. w_length);
System.out.println("this iron box is suitable for:"+ironbox.suitable);
System.out.println("the power required for iron box is :"+ironbox.power+" watts");

ironbox.w_length=5;
ironbox.brand="bajaj";
ironbox.suitable="all";
ironbox.power=250;

System.out.println("the updated brand of iron box is :"+ironbox.brand);
System.out.println("the updated legnth  of  wire in iron box is :"+ironbox.w_length);
System.out.println("this updated iron box is suitable for:"+ironbox.suitable);
System.out.println("the updated power required for iron box is :"+ironbox.power+" watts");
}

}