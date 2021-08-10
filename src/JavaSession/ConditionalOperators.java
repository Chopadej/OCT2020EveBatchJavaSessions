package JavaSession;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a>b);
		System.out.println(b>a);
		
		if(b>a)
		{
			System.out.println(" b is greater than a");
			
		}
		else
		{
			System.out.println(" a is greater than b");
		}
		
		if(true)
		{
			System.out.println("Hey");
		}
		else //Dead code 
		{
			System.out.println("Hello");
		}
		
		boolean flag = false;
		if(flag)
		{
			System.out.println("Selenium");
		}
		else
		{
			System.out.println("QTP");
		}
		// nested if
		int marks = 88;
		if(marks<=100)
		{
			if(marks>=90)
			{
				System.out.println("Grade A");
			}
			if(marks>=80)
			{
				System.out.println("Grade B");
			}
		}else
		{
			System.out.println("Not eligible");
		}
	
		// if if if
		int score = 100;
		if(score>= 90)
		{
			System.out.println("Grade A");
		}
		if(score>= 80)
		{
			System.out.println("Grade B");
		}
		if(score>= 70)
		{
			System.out.println("Grade C");
		}
		
		if(score>= 60)
		{
			System.out.println("Grade D");
		}
		
		//if if
		String browser = "Chrome";
		if(browser.equals("Chrome"))
				{
					System.out.println("launch Chrome");
				}
		if(browser.equals("Firefox"))
		{
			System.out.println("launch FF");
		}

		if(browser.equals("IE"))
		{
			System.out.println("launch IE");
		}

		if(browser.equals("Safari"))
		{
			System.out.println("launch Safari");
		}
		else 
		{
			System.out.println("Please pass the correct browser name" + browser);
		}

		
		//if else if
		
		String br = "Chrome";
		if(br.equals("Chrome"))
				{
					System.out.println("launch Chrome");
				}
		else if(br.equals("Firefox"))
		{
			System.out.println("launch FF");
		}

		else if(br.equals("IE"))
		{
			System.out.println("launch IE");
		}

		else if(br.equals("Safari"))
		{
			System.out.println("launch Safari");
		}
		else 
		{
			System.out.println("Please pass the correct browser name" + br);
		}
	
	}
	

	}


