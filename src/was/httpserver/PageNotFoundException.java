package was.httpserver;

public class PageNotFoundException extends RuntimeException{

    PageNotFoundException(String message) {
        super(message);
    }
}
