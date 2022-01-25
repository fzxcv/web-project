package by.it_academy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;

public class Controller extends HttpServlet {
    public static final long serialVersionUID = 1L;
    private static final String COMMAND = "command";
    private final CommandProvider provider = new CommandProvider();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Controller");

        String commandName = request.getParameter(COMMAND);
        Command command = provider.getCommand(commandName);
        command.execute(request, response);
    }
}

