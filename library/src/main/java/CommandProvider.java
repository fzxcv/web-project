
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {

    private final Map<String, Command> commands = new HashMap<>();

    public static final String LOG_IN_COMMAND = "Log in";
    public static final String SIGN_IN_COMMAND = "Sign up";

   // public static final String AUTHORIZATION_PAGE = "GO_TO_AUTHORIZATION_PAGE";
    public static final String REGISTRATION_PAGE = "GO_TO_REGISTRATION_PAGE";
    public static final String INDEX_PAGE = "GO_TO_INDEX_PAGE";
    public static final String MAIN_PAGE = "GO_TO_MAIN_PAGE";

    public CommandProvider() {
        commands.put(LOG_IN_COMMAND, new LogInCommand());
        commands.put(SIGN_IN_COMMAND, new SignUpCommand());

       // commands.put(AUTHORIZATION_PAGE, new GoToAuthorizationPage());
        commands.put(REGISTRATION_PAGE, new GoToRegistrationPage());
        commands.put(INDEX_PAGE, new GoToIndexPage());
        commands.put(MAIN_PAGE, new GoToMainPage());
    }

    public Command getCommand(String commandName) {
        Command command = commands.get(commandName);
        return command;
    }
}
