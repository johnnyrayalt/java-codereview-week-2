package models;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private String teamDescription;
    private ArrayList<String> teamMembers;

    public Team() {
        this.teamName = "";
        this.teamDescription = "";
        this.teamMembers = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public ArrayList<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }

    public void setTeamMembers(String userInputTeamMemberName) {
        ArrayList<String> teamMemberRosterSize = getTeamMembers();
        teamMemberRosterSize.add(userInputTeamMemberName);
    }
}
