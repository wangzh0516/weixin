package io.github.rcarlosdasilva.weixin.model.notification;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.github.rcarlosdasilva.weixin.model.Account;

/**
 * 微信推送通知模型
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
@XStreamAlias("notification")
public class Notification extends NotificationMeta {

  @XStreamAlias("AppId")
  private String appId;
  private String plaintext;
  private Event event;
  private Message message;
  private OpenInfo openInfo;
  private Account account;

  /**
   * appid.
   * <p>
   * 公众号平台的通知：appid = 公众号appid<br>
   * 开放平台的通知：appid = 第三方appid
   * 
   * @return appid
   */
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * xml明文原文，在安全模式下，微信验证URL时解密后有值，对应URL中的echostr.
   * 
   * @return 明文
   */
  public String getPlaintext() {
    return plaintext;
  }

  public void setPlaintext(String plaintext) {
    this.plaintext = plaintext;
  }

  /**
   * 获取事件相关内容.
   * 
   * @return {@link Event}
   */
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  /**
   * 获取消息相关内容.
   * 
   * @return {@link Message}
   */
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  /**
   * 获取开放平台相关内容.
   * 
   * @return {@link OpenInfo}
   */
  public OpenInfo getOpenInfo() {
    return openInfo;
  }

  public void setOpenInfo(OpenInfo open) {
    this.openInfo = open;
  }

  /**
   * 获取推送对应的公众号配置信息.
   * 
   * @return {@link Account}
   */
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

}