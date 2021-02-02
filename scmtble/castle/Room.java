package scmtble.castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir,Room room){
        exits.put(dir,room);//add key and value to hashmap
    }


    public String getExitDesc() {
        StringBuffer ret = new StringBuffer();
        for (String dir : exits.keySet()) {
            ret.append(dir);
            ret.append(" ");
        }

        return ret.toString();
    }

    public Room getExit(String direction){
        return exits.get(direction);
    }

    @Override
    public String toString()
    {
        return description;
    }
}
