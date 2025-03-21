class Fact{
public static void main(String[] args){
int[] element={1,2,3,4,5};

for(int i=0;i<element.length;i++){
	int n=1;
for(int j=1;j<=element[i];j++){
n*=j;
}
System.out.println(n);

}
}
}
