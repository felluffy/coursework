package stuff;
import java.io.*;
import java.util.ArrayList;
class Listings
{
	public Listings(String n, String a, String e, int p)
	{
		name = n;
		address = a;
		email = e;
		number = p;
	}
	String name;
	String address;
	int number;
	String email;
}
public class AddressBook 
{
	public int getIndex(BufferedReader br) throws IOException
	{
		return (int) br.read();
	}
	public void sort()
	{
		
	}
	
	public void search()
	{
		
	}
	
	public void load()
	{
		
	}
	
	public void add()
	{
		
	}
	
	public void edit()
	{
		
	}
	
	public void save()
	{
		
	}
	
	public void remove()
	{
		
	}
	
	public static void clearScreen() 
	{  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	   }  
	
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AddressBook adr = new AddressBook();
		try
		{
			while(true)
		{
			switch(adr.getIndex(br))
			{
			case 1: adr.load();
			break;
			case 2: adr.save();
			break;
			case 3: adr.add();
			break;
			case 4: adr.remove();
			break;
			case 5: adr.edit();
			break;
			case 6: adr.sort();
			break;
			case 7: adr.search();
			break;
			case 8: System.out.println("Exitting");
			return;
			default:
				continue;
				
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("Error reading");
		}
	}
	
	String writeToPath;
	String readFromPath;
	int choice;
	ArrayList<Listings> listings;
}
