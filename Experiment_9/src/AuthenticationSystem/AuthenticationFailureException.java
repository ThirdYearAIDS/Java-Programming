package AuthenticationSystem;

class AuthenticationFailureException extends RuntimeException {
    public AuthenticationFailureException(String error) {
        super(error);
    }
}