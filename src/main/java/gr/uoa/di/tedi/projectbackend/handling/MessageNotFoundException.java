package gr.uoa.di.tedi.projectbackend.handling;

public class MessageNotFoundException extends RuntimeException{
    public MessageNotFoundException(Long id){super("Could not find Seller" + id);}
}
