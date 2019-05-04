import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//first step
@RunWith(Parameterized.class)
public class Parameter_testCase {

	//second step - defining parameters
	String first_name;
	String last_name;
	String password;
	int age;
	
	
	//third step
	public Parameter_testCase(String first_name, String last_name, String password, int age) {
		
		this.first_name=first_name;
		this.last_name=last_name;
		this.password=password;
		this.age=age;
	}
	
	
	//fourth step
	@Parameters
	public static Collection<Object[]> getData(){
		
		Object[][] data=new Object[2][4];
		
		//first row
		data[0][0]="joy";
		data[0][1]="smith";
		data[0][2]="abcd";
		data[0][3]=18;
		
		// second row
		data[1][0] = "Tom";
		data[1][1] = "Williams";
		data[1][2] = "abcde";
		data[1][3] = 28;
		
		return Arrays.asList(data);

	}
	
	@Test
	public void doLogin() {
		
		System.out.println(first_name+"--"+last_name+"--"+password+"--"+age);
	}
}
