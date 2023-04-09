package com.example.StaticDynamicFilteringDemo.Swagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController
{
    @Autowired
    UserService userService;
    @Operation(summary = "Get All Employees")
    @GetMapping("/users")
    public List<User> findAllUsers()
    {
        return userService.getAllUser();
    }
    @Operation(summary = "Get Employees on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User Found",
                    content =
                            {
                                @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content) })
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id)
    {
        User user= userService.getUserById(id);


        return user;
    }
    @Operation(summary = "Post Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Post Successfully.",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }) })


    @PostMapping("/users")
    public User createUser(@RequestBody User user)
    {
        return userService.addNewUser(user);
    }

    @Operation(summary = "Delete Users on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User Found,Deleted the User",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class)) }),
            @ApiResponse(responseCode = "404", description = "User not found, Invalid id supplied.",
                    content = @Content) })
    @DeleteMapping("/users/{id}")

    public void deleteUser(@PathVariable int id)
    {
        userService.removeUserById(id);
    }

    @PutMapping("/users/{id}")
    public User UpdateUser(@PathVariable int id,@RequestBody User user)
    {
        userService.updateUser(user,id);
        return user;
    }

}

