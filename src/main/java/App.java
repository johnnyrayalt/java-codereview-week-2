import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import models.Team;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        post("/post/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String teamName = request.queryParams("teamName");
            Team newTeam = new Team();
            newTeam.setTeamName(teamName);
            model.put("team", newTeam);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Team> team = Team.getAll();
            model.put("team", team);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
