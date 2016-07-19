package com.yz.app.common.utils;

/**
 * ----------BigGod be here!----------/
 * ***┏┓******┏┓*********
 * *┏━┛┻━━━━━━┛┻━━┓*******
 * *┃             ┃*******
 * *┃     ━━━     ┃*******
 * *┃             ┃*******
 * *┃  ━┳┛   ┗┳━  ┃*******
 * *┃             ┃*******
 * *┃     ━┻━     ┃*******
 * *┃             ┃*******
 * *┗━━━┓     ┏━━━┛*******
 * *****┃     ┃神兽保佑*****
 * *****┃     ┃代码无BUG！***
 * *****┃     ┗━━━━━━━━┓*****
 * *****┃              ┣┓****
 * *****┃              ┏┛****
 * *****┗━┓┓┏━━━━┳┓┏━━━┛*****
 * *******┃┫┫****┃┫┫********
 * *******┗┻┛****┗┻┛*********
 * ━━━━━━神兽出没━━━━━━
 *
 * 项目名称：RetrofitDagger2RxJava
 * 类描述：
 * 创建人：zhangwei
 * 创建时间：2016-07-17 21:17
 * 修改人：zhangwei
 * 修改时间：2016-07-17 21:17
 * 修改备注：
 */
public class DiskLruCacheHelper {
    private static volatile DiskLruCacheHelper instance = null;

    private DiskLruCacheHelper() {
    }

    public static DiskLruCacheHelper getInstance() {
        if (instance == null) {
            synchronized (DiskLruCacheHelper.class) {
                if (instance == null) {
                    instance = new DiskLruCacheHelper();
                }
            }
        }
        return instance;
    }


    private void getImageCache(){

    }
}
