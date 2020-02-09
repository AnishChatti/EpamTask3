
public class Business {

 public static double result (char o)
{

double first=Data.geta();
double second=Data.getb();
switch(o)
{
    case '+':
        return (double)first + second;
      
    case '-':
        return (double)first - second;

    case '*':
        return (double)first * second;
    case '/':
        return (double)first / second;
    default:
      throw new IllegalStateException();
}

	 	
}

 
}
