package model.exceptions;


// RunTimeException -> compilador não obriga você a tratar

// Exception -> copilador obriga você a tratar a exceção.
public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
