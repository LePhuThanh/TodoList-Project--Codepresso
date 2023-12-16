package com.codepresso.todo.controller;

import java.util.List;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/todo")
public class TodoController {
    private TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    //todo TodoService를 활용하기 위해 의존성 주입 코드를 작성하세요
    //todo API문서를 확인하여 GET /todo REST API를 완성하세요
    //todo TodoService를 활용하세요

    @GetMapping(value = "/get-todo")
    public List<Todo> getTodoList(){
        List<Todo> list = todoService.getTodoList();
        return list;
    }

    //todo API문서를 확인하여 POST /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    //Added by PT
    @PostMapping(value = "/add-todo")
    public ResultDto addTodo(@RequestBody Todo todo) {
        //todo return code는 변경하지 마세요
        todoService.addTodo(todo);
        return new ResultDto(200, "Success");
    }

    //todo API문서를 확인하여 DELETE /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    public ResultDto deleteTodo(@PathVariable("id") Integer id) {

        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success");
    }

}
