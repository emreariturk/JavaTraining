package com.in28minutes.rest.webservices.resfullwebservices.hellowrold;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-dto")
    public HelloWorldDto helloWorldDto()
    {
        return new HelloWorldDto("naber lan");
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-dto/{message}")
    public HelloWorldDto helloWorldDtoMessage(@PathVariable("message") String message)
    {
        return new HelloWorldDto(message);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-dto-message/{message}")
    public String helloWorldDtoMessageString(@PathVariable("message") String message)
    {
        HelloWorldDto worldDto= new HelloWorldDto(message);
        return worldDto.toString();
    }

}
