package co.getdev.bucketlists.resource.wrapper;

/**
 * API model for the authentication token.
 *
 * @author Ogundipe Segun David
 */
public class AuthenticationToken {
    
    private String token;

    public AuthenticationToken() {

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
