package com.pattern.behavior.chain;

/**
 * The type Request data.
 */
public class RequestData {

    /**
     * The Request type.
     */
    private RequestType requestType;

    /**
     * The Request.
     */
    private String request;

    /**
     * Gets request type.
     *
     * @return the request type
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets request type.
     *
     * @param requestType the request type
     */
    public void setRequestType(final RequestType requestType) {
        this.requestType = requestType;
    }

    /**
     * Gets request.
     *
     * @return the request
     */
    public String getRequest() {
        return request;
    }

    /**
     * Sets request.
     *
     * @param request the request
     */
    public void setRequest(final String request) {
        this.request = request;
    }
}
