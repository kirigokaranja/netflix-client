package com.example.netflixui;

import com.example.netflixui.models.Category;
import com.example.netflixui.models.Movie;
import com.example.netflixui.models.MovieType;
import com.example.netflixui.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client",url = "https://netflix-api.herokuapp.com/", configuration = FeignConfig.class)
public interface FeignRestClient {
    //Create a user
    @RequestMapping(method = RequestMethod.POST, value = "users")
    User createUser(@RequestBody User user);

    //get all users
    @RequestMapping(method = RequestMethod.GET, value = "users")
    List<User> getAllUsers();

    //get one user by id
    @RequestMapping(method = RequestMethod.GET, value = "users/{id}")
    User findById(@PathVariable(name = "id") Long id);

    //update user details
    @RequestMapping(method = RequestMethod.PATCH, value = "users/{id}")
    User updateUser(@PathVariable(name = "id") Long id, @RequestBody User user);

    //delete a user
    @RequestMapping(method = RequestMethod.DELETE, value = "users/{id}")
    User deleteUser(@PathVariable(name = "id") Long id, @RequestBody User user);

    //crate a category
    @RequestMapping(method = RequestMethod.POST, value="categories")
    Category createCategory(@RequestBody Category category);

    //get all categories
    @RequestMapping(method = RequestMethod.GET, value = "categories")
    List<Category> getAllCategories();

    //get one category by id
    @RequestMapping(method = RequestMethod.GET, value = "categories/{id}")
    Category findCategoryById(@PathVariable(name = "id") Long id);

    //update category details
    @RequestMapping(method = RequestMethod.PATCH, value = "categories/{id}")
    Category updateCategory(@PathVariable(name = "id") Long id, @RequestBody Category category);

    //delete a category
    @RequestMapping(method = RequestMethod.DELETE, value = "categories/{id}")
    Category deleteCategoryr(@PathVariable(name = "id") Long id);

    //create a movie
    @RequestMapping(method = RequestMethod.POST, value = "users/{id}/movie")
    Movie createMovie(@PathVariable(name = "id") Long id, @RequestBody Movie movie);

    //get movies by category id and type
    @RequestMapping(method = RequestMethod.GET, value = "movies/category/{id}")
    List<Movie> movieByCategoryAndType(@PathVariable(name = "id") Long id, @RequestParam(value = "type") MovieType type);

    //get all movies
    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movie> allMovies();

    //get one mvoie
    @RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
    Movie findMovieById(@PathVariable(name = "id")Long id);

    //update one movie
    @RequestMapping(method = RequestMethod.PATCH, value = "users/{userid}/movie/{id}")
    Movie updateMovie(@PathVariable(value = "id") Long id, @PathVariable(value = "userid") Long userid, @RequestBody Movie movie);

    //delete movie
    @RequestMapping(method = RequestMethod.DELETE, value = "users/{userid}/movie/{id}")
    String deleteMovie(@PathVariable(value = "id") Long id, @PathVariable(value = "userid") Long userid);
}
