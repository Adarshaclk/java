class Cab{
static int getCostBySourceAndDestination(String source,String destination){
	int cost=0;
if(source=="majestic"&&destination=="RRNAGAR"){
	cost=100;
	return cost;
}
else if(source=="majestic"&&destination=="jayNagar"){
	cost=130;
	return cost;
}
else if(source=="majestic"&&destination=="BTM"){
	cost=230;
	return cost;
}
else if(source=="basavangudi"&&destination=="yalahanka"){
	cost=250;
	return cost;
}
else if(source=="majestic"&&destination=="electronicCity"){
	cost=289;
	return cost;
}
else if(source=="majestic"&&destination=="kengeri"){
	cost=150;
	return cost;
}
else if(source=="majestic"&&destination=="devanahalli"){
	cost=500;
	return cost;
}
else if(source=="kempegoudaInternatinalAirport"&&destination=="majestic"){
	cost=550;
	return cost;
}
else if(source=="gorguntepalya"&&destination=="nagarabhavi"){
	cost=199;
	return cost;
}
else if(source=="whiteField"&&destination=="rajajiNagara"){
	cost=349;
	return cost;
}
else if(source=="jalahalli"&&destination=="yashawanthpur"){
	cost=100;
	return cost;
}
else if(source=="bannergatta"&&destination=="indranagar"){
	cost=250;
	return cost;
}
else if(source=="churchStreet"&&destination=="mahalakhmi"){
	cost=230;
	return cost;
}
else if(source=="HSR"&&destination=="KONANKUNTE"){
	cost=99;
	return cost;
}
else if(source=="rajankunte"&&destination=="malleshwaram"){
	cost=150;
	return cost;
}
else if(source=="shiavjiNagara"&&destination=="nelamangala"){
	cost=230;
	return cost;
}return 0;
}
}