interface Command{
	public void execute1();
}

class LightOnCommand implements Command{
	Light light;
	public LightOnCommand(Light light)
	{
		this.light=light;
	}
	public void execute1()
	{
		light.switchon();
	}
}

class LightOffCommand implements Command{
	Light light;
	public LightOffCommand(Light light)
	{
		this.light=light;
	}
	public void execute1()
	{
		light.switchoff();
	}
}

//Receiver

class Light{
	private boolean on;
	public void switchon()
	{
		on=true;
		System.out.println("Light is on");
	}
	public void switchoff()
	{
		on=false;
		System.out.println("Light is off");
	}
}

//Invoker
class Remotecontrol
{
	private Command command;
    public void setCommand(Command command)
    {
    	this.command=command;
    }
    public void pressbutton()
    {
    	command.execute1();
    }
}

public class Commandpat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Remotecontrol control=new Remotecontrol();
       
       Light light=new Light();
       
       Command LightsOn=new LightOnCommand(light);
       
       Command LightsOff=new LightOffCommand(light);
       
       //switch on
       
       control.setCommand(LightsOn);
       control.pressbutton();
       
       control.setCommand(LightsOff);
       control.pressbutton();
       
	}

}
