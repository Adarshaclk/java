class Jar{
static String[] searchByLastName(String name){
if(name=="kapoor"){
	String[] kap={"chaya kapoor","aliya kapoor","shyam kapoor","riya kapoor","shan kapoor"};
	return kap;	
}
else if(name=="sharma"){
	String[] shama={"kapil sharma","rohith sharma","lalith sharma","kamla sharma","bharath sharma"};
    return shama;	
}
else if(name=="shetty"){
	String[] sty={"ram shetty","kumar shetty","harish shetty","kunal shetty","pritham shetty"};
	return sty;
}
else {
	System.out.println("name not found");
	return null;
}
}

}