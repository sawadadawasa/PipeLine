package jp.gihyo.jenkinsbook.dto;

import java.io.Serializable;

/**
 * DTO class for SampleServlet.
 */
public class sampleDTO implements Serializable {
    /**
     * First name of the user.
     */
    private String firstName;
    /**
     * Last name of the user.
     */
    private String lastName;
    /**
     * Greeting message.
     */
    private String message;

    /**
     * Store the user name.
     * @param firstName1 first name of the user
     * @param lastName1 last name of the user
     */
    public sampleDTO(final String firstName1, final String lastName1) {
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.setMessage("Hello");
    }

    /**
     * Get first name of the user.
     * @return first name of the user
     */
    public final String getFirstName() {
        return this.firstName;
    }

    /**
     * Get last name of the user.
     * @return last name of the user
     */
    public final String getLastName() {
        return this.lastName;
    }

    /**
     * Get greeting message.
     * @return greeting message
     */
    public final String getMessage() {
        return this.message;
    }

    /**
     * Set first name of the user.
     * @param firstName2 first name of the user
     */
    public final void setFirstName(final String firstName2) {
        this.firstName = firstName2;
    }

    /**
     * Set last name of the user.
     * @param lastName2 last name of the user
     */
    public final void setLastName(final String lastName2) {
        this.lastName = lastName2;
    }

    /**
     * Set greeting message.
     * @param msg greeting message
     */
    public final void setMessage(final String msg) {
        this.message = msg;
    }
}
