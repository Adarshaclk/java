class Cabs{
static int  getDistanceBySourceAndDestination(String source,String destination){
	int dist=0;
if(source=="majestic"&&destination=="RRNAGAR"){
	dist=3;
	return dist;
}
else if(source=="majestic"&&destination=="jayNagar"){
	dist=13;
	return dist;
}
else if(source=="majestic"&&destination=="BTM"){
	dist=14;
	return dist;
}
else if(source=="basavangudi"&&destination=="yalahanka"){
	dist=20;
	return dist;
}
else if(source=="majestic"&&destination=="electronicCity"){
	dist=24;
	return dist;
}
else if(source=="majestic"&&destination=="kengeri"){
	dist=15;
	return dist;
}
else if(source=="majestic"&&destination=="devanahalli"){
	dist=30;
	return dist;
}
else if(source=="kempegoudaInternatinalAirport"&&destination=="majestic"){
    dist=550;
	return dist;
}
else if(source=="gorguntepalya"&&destination=="nagarabhavi"){
	dist=9;
	return dist;
}
else if(source=="whiteField"&&destination=="rajajiNagara"){
	dist=11;
	return dist;
}
else if(source=="jalahalli"&&destination=="yashawanthpur"){
	dist=10;
	return dist;
}
else if(source=="bannergatta"&&destination=="indranagar"){
	dist=30;
	return dist;
}
else if(source=="churchStreet"&&destination=="mahalakhmi"){
	dist=12;
	return dist;
}
else if(source=="HSR"&&destination=="KONANKUNTE"){
	dist=9;
	return dist;
}
else if(source=="rajankunte"&&destination=="malleshwaram"){
	dist=15;
	return dist;
}
else if(source=="shiavjiNagara"&&destination=="nelamangala"){
	dist=19;
	return dist;
}
else if(source=="MGroad"&&destination=="kormangala"){
	dist=22;
	return dist;
}
else if(source=="biddi"&&destination=="vijayNagra"){
	dist=7;
	return dist;
}
else if(source=="UBcity"&&destination=="majestic"){
	dist=18;
	return dist;
}
else if(source=="chikpete"&&destination=="majestic"){
	dist=3;
	return dist;
}
else if(source=="electronicCity"&&destination=="kormangala"){
	dist=7;
	return dist;
}
else if(source=="nelamangala"&&destination=="kormangala"){
	dist=19;
	return dist;
}
else if(source=="bannergatta"&&destination=="BTM"){
	dist=27;
	return dist;
}
else if(source=="kormangala"&&destination=="majestic"){
	dist=21;
	return dist;
}
else if(source=="UBcity"&&destination=="kormangala"){
	dist=14;
	return dist;
}
else if(source=="Chinnaswamy"&&destination=="yashawanthpur"){
	dist=120;
	return dist;
}
else if(source=="BTM"&&destination=="chikpete"){
	dist=9;
	return dist;
}

return 0;
}
}