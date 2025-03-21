class Brand{
static String[] getBrandsByProduct(String productName){

if(productName=="watch"){
String[] Wbrands={"fastrack","titan","sonata","puma","fossil"};
return Wbrands;
}
else if(productName=="pen"){
String[] pbrands={"cello","parker","rorito","doms"};
return pbrands;
}
else if(productName=="fan"){
String[] fbrands={"USHA","bajaj","crompton","voltas"};
return fbrands;
}
else if(productName=="shirt"){
String[] sbrands={"allenSolley","Lenin","kanva","F20"};
return sbrands;
}
else if(productName=="laptop"){
String[] lbrands={"HP","LENOVO","dell","asus"};
return lbrands;
}
else if(productName=="mobile"){
String[] mbrands={"SAMSUNG","APPLE","redmi","realme","vivo"};
return mbrands;
}
else if(productName=="bltBuds"){
String[] bbrands={"noise","boat","samsung","apple"};
return bbrands;
}
else if(productName=="slipper"){
String[] s1brands={"sparx","walkmate","lunars","bata"};
return s1brands;
}
else if(productName=="shoes"){
String[] s2brands={"sparx","bata","adidas","puma"};
return s2brands;
}
else if(productName=="goldChain"){
String[] jbrands={"malabar","khazana","thanisk","kalyan"};
return jbrands;
}
else if(productName=="bags"){
String[] b1brands={"WC","lunars","americanTuorister","Skybags"};
return b1brands;
}
else if(productName=="belt"){
String[] b3brands={"woodland","peterengland","Ruff","leatercoast"};
return b3brands;
}
else if(productName=="perfume"){
String[] pbrands={"fogg","bellavita","parkevenue","engage"};
return pbrands;
}
else if(productName=="chips"){
String[] cbrands={"lays","balaji","doritos","springles"};
return cbrands;
}
else if(productName=="fan"){
String[] fbrands={"USHA","bajaj","crompton","voltas"};
return fbrands;
}
else if(productName=="cookies"){
String[] c1brands={"darkfantacie","chaco","unibik","palegold"};
return c1brands;
}
else if(productName=="mixer"){
String[] m1brands={"usha","bajaj","butterfly","prestige"};
return m1brands;
}
else if(productName=="fridge"){
String[] f1brands={"samsung","bajaj","LG","goldrge"};
return f1brands;
}
else if(productName=="washingMachine"){
String[] w1brands={"LG","ifg","samsung","bosch"};
return w1brands;
}
else if(productName=="paint"){
String[] p2brands={"asianPaints","indigo","JSW","ultratech"};
return p2brands;
}
else if(productName=="cement"){
String[] fbrands={"ultratech","ambuja","arjuna","JSW"};
return fbrands;
}
else if(productName=="powder"){
String[] p2brands={"ponds","mysoresandal","lux","wild"};
return p2brands;
}
else if(productName=="pickle"){
String[] fbrands={"achie","priya","mtr","kumars"};
return fbrands;
}
else if(productName=="petrol"){
String[] fbrands={"HP","IndianOIL","jio","power"};
return fbrands;

}
else if(productName=="car"){
String[] fbrands={"bmw","benz","audi","MG"};
return fbrands;
}
else{
	System.out.println("the brnads are not matchong");
	return null;
}
}

}