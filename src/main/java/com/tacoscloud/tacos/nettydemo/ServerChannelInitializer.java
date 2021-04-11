package com.tacoscloud.tacos.nettydemo;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {


        socketChannel.pipeline()
                .addLast(new Decoder())
                .addLast(new ServerHandler())
                .addLast(new ServerOutboundHandler())
                .addLast("logging", new LoggingHandler(LogLevel.INFO));
    }
}
