package Assessment;
import java.io.*;
import java.util.Scanner;
public class Lockedme 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int Choose,Operation;
		
		
		System.out.println("WELCOME TO THE PROJECT: LOCKEDME.COM");
		System.out.println("=================================\n\n");
		System.out.println("PRESS ENTER TO START...");
		System.in.read();
		{        	
		System.out.println("MAIN MENU");
		System.out.println("Select the Options Given Below:");
	    System.out.println("1.TO VIEW FILES");
	    System.out.println("2. BUSINESS OPERATIONS");
	    System.out.println("3. EXIT\n");
	    Choose= sc.nextInt();
		switch(Choose) {
		case 1:
		System.out.println("FILES AT THE LOCATION ARE");
		File Fobj = new File("D:\\Mphasis\\File\\Assign");
		File Farray[] = Fobj.listFiles();
	   	for(int i=0;i<Farray.length;i++) 
	   	{
	   		if(Farray[i].isFile()) 
	   		{
	   			System.out.println("File: "+Farray[i] +"\n");
			}   		
		}
		break;
		case 2:
		do {
			
			System.out.println("BUSINESS OPERATIONS\n");
		    System.out.println("SELECT THE REQUIRED OPERATION");
		    System.out.println("1. ADD A FILE");
		    System.out.println("2. DELETE A FILE");
		    System.out.println("3. SEARCH A FILE");
		    System.out.println("4. BACK TO MAIN MENU");
		    System.out.println("5. EXIT");
		    Operation= sc.nextInt();
		    switch(Operation) 
			{
		    case 1:
		    	System.out.println("Add a File");
		 		System.out.println("Please Enter the File name: ");
		    	String af = sc.next();
		    	File addfile = new File("D:\\Mphasis\\File\\Assign\\"+af);
		    	if(addfile.exists()) 
		    	{
	    		System.out.println("Already exits !! Please Enter Again\n");
				}
		    	else {
		    		try {
		    			addfile.createNewFile();
					    System.out.println("Your file is created\n");
					    }
		    		catch(IOException e)
		    		{
					  e.printStackTrace();
					}
					}	    			
					break;
			  case 2:
				  System.out.println("Delete a File");
				  System.out.println("Please Enter the File Name: ");
				  String df = sc.next();
				  File delFile = new File("D:\\Mphasis\\File\\Assign\\"+df);
				  if(delFile.exists()) 
				  {
					  delFile.delete();
					  System.out.println("File Deleted\n");
				  }
				  else {
					    System.out.println("File not Found!\n");
					   }
					    break;				    	
			  case 3:
				 System.out.println("Search a File");
				 System.out.println("Please Enter Name of File: ");
				 String sf = sc.next();
				 File fsearch = new File("D:\\Mphasis\\File\\Assign\\");
			     File FSarray[] = fsearch.listFiles();
				 for(int i=0;i<FSarray.length;i++) 
				 {
					 if(FSarray[i].getName().startsWith(sf)) 
					 {
						 if(FSarray[i].isFile()) 
						 {
							 System.out.println("File: "+FSarray[i]+"\n");
						 }
						 else 
						 {
							 System.out.println("No File found\n");
							 }							 
				     }				    							 
				 }
				 				 
					   	break;
		      case 4:
		    	  System.out.println("Press Enter to continue...");
		  		System.in.read();
		  		{        	
		  		System.out.println("MAIN MENU");
		  		System.out.println("Select the Options Given Below:");
		  	    System.out.println("1.TO VIEW FILES");
		  	    System.out.println("2. BUSINESS OPERATIONS");
		  	    System.out.println("3. EXIT\n");
		  		}
		  				break;
		    	  
			  case 5:
				System.out.println("THANKS");
			    System.exit(1);
			    break;
					    
			  default:
				System.out.println("Wrong input");					    
				}
					    
				System.out.println("Press Enter to continue...");
				System.in.read();
				}while(Operation!=4);
				 break;
		case 3:
			System.out.println("THANK YOU ");
	    	System.exit(1);
		default:
			System.out.println("INCORRECT PREFERENCE");
				    }
			}
		}
}