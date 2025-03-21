class KitRunner{
public static void main(String[] args){
String name;
 name = "kapoor";
        String[] ref = Jar.searchByLastName(name);
        for (String nm : ref) {
            System.out.println(nm);
        }

        name = "sharma";
        String[] ref1 = Jar.searchByLastName(name);
        for (String fm : ref1) {
            System.out.println(fm);
        }

        name = "shetty";
        String[] ref2 =Jar.searchByLastName(name);
        for (String dm : ref2) {
            System.out.println(dm);
        }
}

}