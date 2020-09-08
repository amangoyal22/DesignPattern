package com.pattern.behavior.chain;

/**
 * The type Chain of responsibility test.
 */
public class ChainOfResponsibilityTest {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final RequestHandler requestHandler = getChain();
        testForInternal(requestHandler);
        System.out.println("NextChain");
        testForVendor(requestHandler);
        System.out.println("NextChain");
        testForChainEnd(requestHandler);

    }

    /**
     * Gets chain.
     *
     * @return the chain
     */
    private static RequestHandler getChain() {
        return new DBRequestHandler(new InternalRequestHandler(new VendorRequestHandler(null)));
    }

    private static void testForInternal(final RequestHandler requestHandler) {
        RequestData requestData = new RequestData();
        requestData.setRequestType(RequestType.INTERNAL_SERVICE);
        requestData.setRequest("Internal Service");
        requestHandler.process(requestData);
    }

    private static void testForVendor(final RequestHandler requestHandler) {
        RequestData requestData = new RequestData();
        requestData.setRequestType(RequestType.VENDOR);
        requestData.setRequest("Vendor Service");
        requestHandler.process(requestData);
    }

    private static void testForChainEnd(final RequestHandler requestHandler) {
        RequestData requestData = new RequestData();
        requestData.setRequest("Other Service");
        requestHandler.process(requestData);
    }
}
