package com.natephillips.teamup;

/**
 * Created by Nate on 3/25/2017.
 */

import java.util.ArrayList;

public class Team {

    private ArrayList<Player> members;
    private String name;

    public Team(String name){
        this.name = name;
        members = new ArrayList<Player>();
    }

    public void addMember(Player player){
        members.add(player);
    }

    public void removeMember(int i){
        members.remove(i);
    }

    public String toString(){
        String result = name + ":\n";

        for(int i = 0; i < members.size(); i++){
            Player p = members.get(i);
            result+= p + "\n";
        }
        return result;
    }


}
