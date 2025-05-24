import org.springframework.context.annotation.Configuration;

@Configuration //this denotes all the components can be accesed through here
public class AppConfing {
     
	public Samsung getPhone()
	{
		return new Samsung();
	}
	public MobileProcessor getprocessor()
	{
		return new Snapdragon();
	}
}
