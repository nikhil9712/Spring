
public class Samsung {

	MobileProcessor Cpu;

	public MobileProcessor getCpu() {
		return Cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		Cpu = cpu;
	}
	
	public void config()
	{
		System.out.println("Octacore 4gb , 256");
		Cpu.processor();
	}
}
