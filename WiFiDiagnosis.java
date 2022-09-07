
import java.util.Scanner; 

public class WiFiDiagnosis {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);  
		
		String check = "Did that fix the problem? (Yes or No)";
		String answer; 
		String yes = "yes";
		String no = "no";
		
		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.");
		System.out.println("");
		System.out.println("Reboot the computer and try to connect");
		System.out.println(check);
		answer = stdin.nextLine();
		
		if(answer.equalsIgnoreCase(yes)) {
			System.out.println("");
			System.out.println("Done");

		}
		else if(answer.equalsIgnoreCase(no)) {
			System.out.println("Reboot the router and try to connct");
			
			System.out.println(check);
			answer = stdin.nextLine();
			
			if(answer.equalsIgnoreCase(yes)) {
				System.out.println("");
				System.out.println("Done");

			}
			else if(answer.equalsIgnoreCase(no)) {
				System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
				System.out.println(check);
				answer = stdin.nextLine();
				
				if(answer.equalsIgnoreCase(yes)) {
					System.out.println("");
					System.out.println("Done");

				}
				else if(answer.equalsIgnoreCase(no)) {
					System.out.println("Move the computer closer to the router and try to connect");
					System.out.println(check);
					answer = stdin.nextLine();
					
					if(answer.equalsIgnoreCase(yes)) {
						System.out.println("");
						System.out.println("Done");

					}
					else if(answer.equalsIgnoreCase(no)) {
						System.out.println("Contact your ISP");
					}
					else{
						System.out.println("Invalid answer; try again");
					}
				}
				else{
					System.out.println("Invalid answer; try again");
				}
			}
			else{
				System.out.println("Invalid answer; try again");
			}
		}
		else {
			System.out.println("Invalid answer; try again");
		}



		System.out.println("Programmer: Abdul Khan");
		stdin.close();
	}}


