/**
 * @author LeiPeifeng
 * @version V1.0
 * @date 2017/11/6 0006 19:54
 * @Description: 单利
 */
public class Danli {

    private static Danli danli;
    private Danli(){}

    public static synchronized Danli getDanli(){
        if (null == danli){
             danli=new Danli ();
        }
        return danli;
    }
}
