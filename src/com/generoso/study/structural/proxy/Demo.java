package com.generoso.study.structural.proxy;

import com.generoso.study.structural.proxy.implementation.ProxyServer;
import com.generoso.study.structural.proxy.implementation.Server;

public class Demo {

  public static void main(String[] args) {
    Server server = new ProxyServer();

    server.authenticate();
    server.get();
    server.post();
    server.put();
    server.delete();
    server.logout();
  }
}
