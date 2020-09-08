package com.pattern.behavior.chain;

/**
 * The type Db request handler.
 */
public class DBRequestHandler extends RequestHandler {


    /**
     * Instantiates a new Request handler.
     *
     * @param requestHandler the request handler
     */
    public DBRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public boolean process(RequestData requestData) {
        if (RequestType.DB.equals(requestData.getRequestType())) {
            System.out.println("DB Request Data is: " + requestData.getRequest());
            return true;
        }
        return requestHandler.process(requestData);
    }
}
