package com.pattern.behavior.chain;

/**
 * The type Internal request handler.
 */
public class InternalRequestHandler extends RequestHandler {

    /**
     * Instantiates a new Internal request handler.
     *
     * @param requestHandler the request handler
     */
    public InternalRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public boolean process(RequestData requestData) {
        if (RequestType.INTERNAL_SERVICE.equals(requestData.getRequestType())) {
            System.out.println("Internal Request Data is: " + requestData.getRequest());
            return true;
        }
        return requestHandler.process(requestData);
    }
}
