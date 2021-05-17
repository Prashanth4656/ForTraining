package training;

import java.util.*;
public class Details 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Participant> tmap = new TreeMap<>();

        while(true){

            System.out.println("1. Enter new Participant details.");
            System.out.println("2. View All Participant Details.");
            System.out.println("3. Update Participant Details.");
            System.out.println("4. Delete Participant Details.");
            System.out.println("5. Exit");
            System.out.println("Sort Details.");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                  
                    Participant participant = new Participant();

                   
                    System.out.println("Enter Id");
                    while (true)
                    {
                        participant.setId(sc.nextInt());

                        if(tmap.get(participant.getId())!=null){
                            System.out.println("Id is already taken, enter a new one ");
                        }
                        else
                            break;
                    }

                    System.out.println("Enter Name");
                    participant.setName(sc.next());
                    System.out.println("Enter Skills");
                    participant.setSkills(sc.next());

                    
                    tmap.put(participant.getId(), participant);
                    System.out.println("Added.");

                    break;
                case 2:
                    System.out.println(tmap);
                    break;
                case 3:
                    System.out.println("Enter Id");
                    int id = sc.nextInt();

                    Participant old = tmap.get(id);

                    if(old != null)
                    {

                        System.out.println("Enter New Name");
                        old.setName(sc.next());
                        System.out.println("Enter New Skills");
                        old.setSkills(sc.next());

                        System.out.println("Updated.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Id");
                    int id1 = sc.nextInt();

                    Participant old1 = tmap.remove(id1);

                    if(old1 != null)
                    {
                        System.out.println("Removed " + old1.getName());
                    }else 
                    {
                        System.out.println("No participant is found to delete.");
                    }
                    break;
                case 5:
                    System.exit(0);
                    
                case 6:
                	System.out.println("Sort By :");
                	System.out.println("1. Sort by Id.");
                	System.out.println("2. Sort by skills"); 
                	System.out.println("3. Sort by First Name"); 
                	System.out.println("4. Sort by Last Name");
                	int b;
                	Scanner abc=new Scanner(System.in);
                	b=abc.nextInt();
                	switch(b)
                	{
                     case 1:
                    	 Collections.sort(tmap,new SortByName());
                    	 
                    	 
                	}	 
            }

        }

    }
}
