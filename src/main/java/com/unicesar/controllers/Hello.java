/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.unicesar.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 *
 * @author orenaro
 */
@Controller("/")
public class Hello {

    public Hello() {
    }

    @Get
    public HttpResponse<String> saludo(){
        return HttpResponse.ok("hello");
    }
}
