package com.pattern.behavior.chain;

/**
 * The interface Request handler.
 */
public abstract class RequestHandler {

    /**
     * The Request handler.
     */
    public RequestHandler requestHandler;

    /**
     * Instantiates a new Request handler.
     *
     * @param requestHandler the request handler
     */
    public RequestHandler(final RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    /**
     * Process boolean.
     *
     * @param requestData the request data
     * @return the boolean
     */
    public abstract boolean process(RequestData requestData);
}
