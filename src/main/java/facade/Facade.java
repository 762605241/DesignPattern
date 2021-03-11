package facade;

/**
 * 系统门面
 * 使客户端访问门面类，不直接访问系统内部。
 * 又门面类访问系统内部。隐藏系统内部复杂逻辑
 */
public class Facade {

    // 引用系统内部对象，实际操作的对象
    private Fund fund = new Fund();

    /**
     * 投资理财
     * 系统内部复杂的处理过程
     */
    public void investment() {
        fund.buy();
        fund.buy();
        fund.buy();
        fund.sell();
        fund.sell();
        fund.buy();
    }
}
