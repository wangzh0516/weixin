package io.github.rcarlosdasilva.weixin.model.request.custom;

import com.google.gson.annotations.SerializedName;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicWeixinRequest;

/**
 * 获取客服聊天记录请求模型
 * 
 * @author Dean Zhao (rcarlosdasilva@qq.com)
 */
public class CustomMessageRecordsRequest extends BasicWeixinRequest {

  @SerializedName("starttime")
  private long startTime;
  @SerializedName("endtime")
  private long endTime;
  @SerializedName("msgid")
  private long messageId;
  @SerializedName("number")
  private int size;

  public CustomMessageRecordsRequest() {
    this.path = ApiAddress.URL_CUSTOM_MESSAGE_RECORDS;
  }

  /**
   * 开始时间.
   * 
   * @param startTime
   *          time
   */
  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  /**
   * 结束时间.
   * 
   * @param endTime
   *          time
   */
  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }

  /**
   * 消息id.
   * 
   * @param messageId
   *          message id
   */
  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }

  /**
   * 获取条数.
   * 
   * @param size
   *          size
   */
  public void setSize(int size) {
    this.size = size;
  }

}
