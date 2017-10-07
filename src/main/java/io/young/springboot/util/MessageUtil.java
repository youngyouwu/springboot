package io.young.springboot.util;

import io.young.springboot.domain.MyMessage;

import java.util.Map;

final public class MessageUtil {
    private MessageUtil() {
    }

    public static MyMessage success(Map data) {
        MyMessage message = new MyMessage();
        message.setCode(20);
        message.setMessage("操作成功");
        message.setData(data);
        return message;
    }

    public static MyMessage fail(Map data) {
        MyMessage message = new MyMessage();
        message.setCode(55);
        message.setMessage("操作失败");
        message.setData(data);
        return message;
    }
}
