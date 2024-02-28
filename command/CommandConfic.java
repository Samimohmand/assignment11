package command;

public class CommandConfic implements Command{
private IOT iot;

    public CommandConfic(IOT light) {
        this.iot = light;
    }





    @Override
    public void excecute(String str) {
        if (str.equals("on"))
        iot.on();
        else if (str.equals("off"))
            iot.off();
        else throw new RuntimeException("no command please write good command");


    }



}
