package co.wethinkcode.healthsafe;

import io.javalin.Javalin;
import java.util.Map;


public class AlertLevelServiceApp {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7032);

        app.get("/health", ctx -> ctx.result("OK"));

    app.get("/alert-level", ctx -> {
        Map<String, Object> level = Map.of("level", 0);
        ctx.json(level);
    });


        // TODO (Tracks the hospital Emergency Status (0-8, 8 = full Code Blue).)
        // Add domain endpoints for alert-level-service here.
    }
}
