

class Branch {
    static String[] branchnames = {null,null,null};
    static int index = 0;

    public static void addbranch(String branchname) {
        if (branchname != null) {
            if (index < branchnames.length) { 
                branchnames[index] = branchname;
                System.out.println("The branch name saved successfully");
				index++;
                
				for(int i=0;i<branchnames.length;i++){
					
					System.out.println("branch name is :"+branchnames[i]);
				}

            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Branch name is null");
        }
    }
    
}
