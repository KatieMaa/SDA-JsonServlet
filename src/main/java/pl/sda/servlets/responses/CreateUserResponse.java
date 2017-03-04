package pl.sda.servlets.responses;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CreateUserResponse {
    private String status;
    private String id;
    private String error;

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {

        return error;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {

        return status;
    }

    public String getId() {
        return id;
    }
}
