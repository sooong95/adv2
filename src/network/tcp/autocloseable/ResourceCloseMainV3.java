package network.tcp.autocloseable;

public class ResourceCloseMainV3 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CallException, CloseException {

        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;

        try {
            resource1 = new ResourceV1("resource1");
            resource2 = new ResourceV1("resource2");

            resource1.call();
            resource2.callEx(); // CallException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        } finally {

            if (resource1 != null) {
                try {
                    resource1.closeEx();
                } catch (CloseException e) {
                    // close 에서 발생한 예외는 버린다. 필요하면 로깅
                    // 보통 자원을 닫다가 발생한 예외는 별로 할 수 있는 게 없다. 개발자가 인지할 수 있도록 로깅 정도
                    System.out.println("close ex: " + e);
                }
            }
            if (resource2 != null) {

                try {
                    resource2.closeEx();
                } catch (CloseException e) {
                    System.out.println("close ex: " + e);
                }
            }
        }
    }
}
