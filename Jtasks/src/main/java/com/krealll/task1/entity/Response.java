package com.krealll.task1.entity;

public class Response<T> {
    private T response;
    private ResponseStatus responseStatus;

    public enum ResponseStatus{
        PARSE_ERR,
        VALIDATE_ERR,
        OK
    }

    public Response(T response, ResponseStatus responseStatus) {
        this.response = response;
        this.responseStatus = responseStatus;
    }

    public Response(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response<?> responseO = (Response<?>) o;
        if(response!=null){
            return response.equals(responseO.response);
        }
        else {
            return responseO.response==null;
        }

    }

    @Override
    public int hashCode() {
        int result =17;
        long value;
        if(responseStatus!=null){
            value=responseStatus.hashCode();
        }
        else {
            value=0;
        }
        result=37*result+(int)value;
        if(response!=null){
            value=response.hashCode();
        }
        else {
            value=0;
        }
        result=37*result+(int)value;
        return result;
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer("Response:{");
        string.append("Response body: ").append(response);
        string.append(", status:").append(responseStatus).append("}");
        return string.toString();
    }
}
