package com.contribute.demo.tools.pushmessage;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName : MessageWarning
 * @Description : TODO
 * @Author : niran
 * @Date : 2019/12/28
 **/

public class MessageWarning extends ResMessage {

    private final String type="waring";

    public MessageWarning(PushMethod pushMethod, String title, String message) {
        super(pushMethod, title, message);
    }

    @Override
    public void pushToOne(String id) {
        pushMethod.pushToOne(id,this.messageToJson());
    }

    @Override
    public void pushToAll() {
        pushMethod.pushToAll(this.messageToJson());
    }

    private String messageToJson(){
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("title",this.title);
        jsonObject.put("message",this.message);
        jsonObject.put("type",this.type);
        return jsonObject.toJSONString();
    }
}