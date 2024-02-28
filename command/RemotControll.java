package command;

import java.util.ArrayList;

public class RemotControll {

    private ArrayList<CommandConfic> commandConfic = new ArrayList<>();

    public RemotControll(CommandConfic commandConfic) {
       this.commandConfic.add(commandConfic);
    }
    public void setCommandConfic(CommandConfic commandConfic){
        this.commandConfic.add(commandConfic);
    }

    public  void onBUttonPress(int i ,String str){
        commandConfic.get(i).excecute(str);
    }


}
