package com.codecool.balazs.laczko.webRouteTest;

public class Routes {
    @WebRoute("/test1")
    public String test1() {
        return "Hello from test1";
    }

    @WebRoute("/test2")
    public String test2() {
        return "Hello from the other side... erm I mean test2 as well";
    }
}
