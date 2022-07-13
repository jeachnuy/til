package com.jeachnuy.til.spring.reflection;

public class UserController {
    @RequestMapping("/save")
    void save() {
        System.out.println("save()");
    }
    @RequestMapping("/delete")
    void delete() {
        System.out.println("delete()");
    }
    @RequestMapping("/update")
    void update() {
        System.out.println("update()");
    }
    @RequestMapping("/find")
    void find() {
        System.out.println("find()");
    }
}
