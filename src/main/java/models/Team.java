package models;

public class Team {
    private String teamName;
    private String teamDescription;

    public Team() {
        this.teamName = "";
        this.teamDescription = "";
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getTeamDescription() {
        return this.teamDescription;
    }
}
