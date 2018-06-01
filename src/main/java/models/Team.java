package models;

public class Team {
    private String teamName;

    public Team(String userTeamName) {
        this.teamName = userTeamName;
    }

    public String getTeamName(String userTeamName) {
        return this.teamName = userTeamName;
    }
}
