package com.yz.app.common.image;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;

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
 * 项目名称：ProjectFunction
 * 类描述： 全局配置
 * 创建人：zhangwei
 * 创建时间：2016-06-15 16:06
 * 修改人：zhangwei
 * 修改时间：2016-06-15 16:06
 * 修改备注：
 */

public class AppGlideModule extends OkHttpGlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        //设置磁盘缓存
        builder.setDiskCache(getDiskFactory(context));
//        MemorySizeCalculator memorySizeCalculator = new MemorySizeCalculator(context);
//        int customMemorySize = (int) (1.2 * memorySizeCalculator.getMemoryCacheSize());
//        int customBitmaPoolSize = (int) (1.2 * memorySizeCalculator.getBitmapPoolSize());
//        builder.setMemoryCache(new LruResourceCache(customMemorySize));
//        builder.setBitmapPool(new LruBitmapPool(customBitmaPoolSize));
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        super.registerComponents(context, glide);
    }

    private DiskCache.Factory getDiskFactory(Context context) {
        return new ExternalCacheDiskCacheFactory(context, "imageCache", 200 * 1024 * 1024);
    }

}
