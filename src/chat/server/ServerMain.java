package chat.server;

import java.io.IOException;

public class ServerMain {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        SessionManager sessionManager = new SessionManager();

        // CommandManager 점진적으로 변경
        // CommandManagerV2 commandManager = new CommandManagerV2(sessionManager);
        // CommandManagerV3 commandManager = new CommandManagerV3(sessionManager);
        CommandManagerV4 commandManager = new CommandManagerV4(sessionManager);

        Server server = new Server(PORT, commandManager, sessionManager);
        server.start();
    }
}
