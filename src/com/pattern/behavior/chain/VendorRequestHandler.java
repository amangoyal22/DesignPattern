package com.pattern.behavior.chain;

/**
 * The type Vendor request handler.
 */
public class VendorRequestHandler extends RequestHandler {

    /**
     * Instantiates a new Vendor request handler.
     *
     * @param requestHandler the request handler
     */
    public VendorRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public boolean process(RequestData requestData) {
        if (RequestType.VENDOR.equals(requestData.getRequestType())) {
            System.out.println("Vendor Request Data is: " + requestData.getRequest());
            return true;
        }
        System.out.println("Not able to process request. Chain ended");
        return false;
    }
}
