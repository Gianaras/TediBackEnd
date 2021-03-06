package gr.uoa.di.tedi.projectbackend.users.handling;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find user " + id);
    }
}
