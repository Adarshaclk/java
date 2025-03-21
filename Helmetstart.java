class Helmetstart{
    public static void main(String[] args){
	//(String matirel,String comp,char size,int rating,int tough 
	String mat="fiber";
	String com="Secure";
	char sz='x';
	float rate=4.5f;
	int tough=78;
	Helmet.h_details(mat,com,sz,rate,tough);
	System.out.println("");
	
	 mat="fiber";
	com="care";
	sz='s';
	 rate=4.8f;
	 tough=83;
	Helmet.h_details(mat,com,sz,rate,tough);
	System.out.println("");
	
	 mat="plastic";
	 com="Secure";
	sz='L';
	 rate=3.5f;
	 tough=56;
	Helmet.h_details(mat,com,sz,rate,tough);
	System.out.println("");
	
	 mat="metal";
	com="flying";
	 sz='l';
	 rate=4.8f;
	 tough=88;
	Helmet.h_details(mat,com,sz,rate,tough);
	System.out.println("");
	
	 mat="metal";
	 com="Secure";
	 sz='m';
	 rate=4.2f;
	 tough=83;
	Helmet.h_details(mat,com,sz,rate,tough);
	}
}