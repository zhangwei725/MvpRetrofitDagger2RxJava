package com.yz.app.common.api;

import com.yz.app.entity.GanWuData;
import com.yz.app.entity.ImageData;
import com.yz.app.entity.RandomData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


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
