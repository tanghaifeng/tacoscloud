package com.tacoscloud.tacos.nettydemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class Decoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        System.out.println("decode..............");
        if (byteBuf.isDirect()) {
            System.out.println("Direct");
        }

        if (byteBuf.isReadable()) {
            System.out.println(byteBuf.readByte());
        }
        list.add(byteBuf);
    }
}
