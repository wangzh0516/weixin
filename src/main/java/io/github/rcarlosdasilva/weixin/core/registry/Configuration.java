package io.github.rcarlosdasilva.weixin.core.registry;

import io.github.rcarlosdasilva.weixin.core.listener.AccessTokenUpdatedListener;
import io.github.rcarlosdasilva.weixin.core.listener.JsTicketUpdatedListener;

public class Configuration {

  private boolean strictUseOpenPlatform = false;
  private boolean throwException = true;
  private boolean useRedisCache = false;
  private boolean useSpringRedis = false;
  private AccessTokenUpdatedListener accessTokenUpdatListener = null;
  private JsTicketUpdatedListener jsTicketUpdatedListener = null;
  private RedisConfiguration redisConfiguration = null;

  public boolean isStrictUseOpenPlatform() {
    return strictUseOpenPlatform;
  }

  /**
   * 设置是否强制使用开放平台代理公众号的api调用.
   * <p>
   * 只有当设置了开放平台的信息，该配置才起作用<br>
   * 设置为强制：代码注册的公众号信息，将不会起作用，公众号能否使用，完全依赖于开放平台是否获取到授权<br>
   * 不强制：优先使用开放平台对公众号进行api调用，但如果开放平台未受到公众号的授权，
   * 并且代码中注册了公众号的信息（appid与appsecret），则尝试直接调用公众号平台的api
   * 
   * @param strictUseOpenPlatform
   *          是否强制，默认否
   */
  public void setStrictUseOpenPlatform(boolean strictUseOpenPlatform) {
    this.strictUseOpenPlatform = strictUseOpenPlatform;
  }

  public boolean isThrowException() {
    return throwException;
  }

  /**
   * 当调用api接口出错时，是否抛出异常.
   * 
   * @param throwException
   *          boolean
   */
  public void setThrowException(boolean throwException) {
    this.throwException = throwException;
  }

  public boolean isUseRedisCache() {
    return useRedisCache;
  }

  /**
   * 是否使用Redis做缓存.
   * 
   * @param useRedisCache
   *          boolean
   */
  public void setUseRedisCache(boolean useRedisCache) {
    this.useRedisCache = useRedisCache;
  }

  public boolean isUseSpringRedis() {
    return useSpringRedis;
  }

  /**
   * 是否使用Spring中配置的Redis做缓存.
   * 
   * @param useSpringRedis
   *          boolean
   */
  public void setUseSpringRedis(boolean useSpringRedis) {
    this.useSpringRedis = useSpringRedis;
  }

  public AccessTokenUpdatedListener getAccessTokenUpdatListener() {
    return accessTokenUpdatListener;
  }

  /**
   * 设置公众号的access_token更新时的监听器（当使用开放平台时，监听器将无用）.
   * <p>
   * 当ccess_token变更时，将会通知到该监听器，开发者可在监听器中做响应的处理
   * 
   * @param accessTokenUpdatListener
   *          listener
   */
  public void setAccessTokenUpdatListener(AccessTokenUpdatedListener accessTokenUpdatListener) {
    this.accessTokenUpdatListener = accessTokenUpdatListener;
  }

  public JsTicketUpdatedListener getJsTicketUpdatedListener() {
    return jsTicketUpdatedListener;
  }

  /**
   * 设置公众号js_ticket更新时的监听器（与setAccessTokenUpdatListener相似）.
   * 
   * @param jsTicketUpdatedListener
   *          listener
   */
  public void setJsTicketUpdatedListener(JsTicketUpdatedListener jsTicketUpdatedListener) {
    this.jsTicketUpdatedListener = jsTicketUpdatedListener;
  }

  public RedisConfiguration getRedisConfiguration() {
    return redisConfiguration;
  }

  /**
   * 设置Redis缓存服务器的配置（当使用Spring的Redis时，无需设置）.
   * 
   * @param redisConfiguration
   */
  public void setRedisConfiguration(RedisConfiguration redisConfiguration) {
    this.useRedisCache = true;
    this.useSpringRedis = false;
    this.redisConfiguration = redisConfiguration;
  }

}
