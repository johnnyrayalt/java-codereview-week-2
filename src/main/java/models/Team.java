package models;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private String teamDescription;
    private List<String> teamMembers;

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

    public List<String> getTeamMembers() {
        return teamMembers;
    }
}
