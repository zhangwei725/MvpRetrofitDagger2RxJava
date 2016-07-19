package com.yz.app.common.api;

import com.yz.app.entity.GanWuData;
import com.yz.app.entity.ImageData;
import com.yz.app.entity.RandomData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

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
 * 创建时间：2016-07-17 16:52
 * 修改人：zhangwei
 * 修改时间：2016-07-17 16:52
 * 修改备注：
 */

public interface ApiService {

    @GET("data/福利/" + 10 + "/{page}")
    Observable<ImageData> getImageData(
            @Path("page") int page);

    @GET("day/{year}/{month}/{day}")
    Observable<GanWuData> getGanWuData(
            @Path("year") int year,
            @Path("month") int month,
            @Path("day") int day);

    @GET("random/data/{type}/{page}")
    Observable<RandomData> getRandomData(
            @Path("type") String type,
            @Path("page") String page);
}
