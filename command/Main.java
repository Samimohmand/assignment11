package command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        CommandConfic  commandConficLight = new CommandConfic(light);

      CommandConfic commandConficFan = new CommandConfic(fan);


        RemotControll remotControll = new RemotControll(commandConficFan);
        remotControll.setCommandConfic(commandConficLight);

     remotControll.onBUttonPress(1,"on");

    }
}
