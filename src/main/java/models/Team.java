package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
    private String teamName;
    private String teamDescription;
    private ArrayList<String> teamMembers;
    private static ArrayList<Team> instances = new ArrayList<>();

    public Team() {
        this.teamName = "";
        this.teamDescription = "";
        this.teamMembers = new ArrayList<>();
        instances.add(this);
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public static ArrayList<Team> getAll() {
        return instances;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }

    public void setTeamMembers(String stringUserInputTeamMemberName) {
        this.teamMembers = new ArrayList<>(Arrays.asList(stringUserInputTeamMemberName.split("\\s*,\\s*")));
    }



}
