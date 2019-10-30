package com.example.netflixui;

import com.example.netflixui.models.Category;
import com.example.netflixui.models.Movie;
import com.example.netflixui.models.User;
import com.example.netflixui.models.UserType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientTest implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public ClientTest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        //create a user
        User newUser = new User("Sharon", 345689, UserType.user);
        newUser = feignRestClient.createUser(newUser);
        System.out.println("New user" + newUser);

        //get all users
        List<User> users = feignRestClient.getAllUsers();
        System.out.println("All users" + users);

        //get one user
//        User myUser = feignRestClient.findById((long) 3);
//        User myUser = feignRestClient.findById(newUser.getId());
//        System.out.println("My User is: " + myUser);

        //update a user
//        User updatedUser = new User("Kirigo", 345689);
//        updatedUser = feignRestClient.updateUser(newUser.getId(), updatedUser);
//        System.out.println("Updated user" + updatedUser);

        //delete a user
//        User deletedUser = new User(345689);
//        deletedUser = feignRestClient.deleteUser(newUser.getId(), deletedUser);
//        System.out.println("Deleted User" + deletedUser);

        //create a category
//        Category newcategory = new Category("Horror");
//        newcategory = feignRestClient.createCategory(newcategory);
//        System.out.println("New Category" + newcategory);

        //get all categories
        List<Category> categories = feignRestClient.getAllCategories();
        System.out.println("All categories" + categories);

        //get one category
//        Category myCategory = feignRestClient.findCategoryById(newcategory.getId());
//        System.out.println("Updated Category: " + myCategory);

        //update a category
//        Category updatedCategory = new Category("Drama");
//        updatedCategory = feignRestClient.updateCategory(newcategory.getId(),updatedCategory);
//        System.out.println("Updated Category" + updatedCategory);

        //delete a category
//        Category deletedCategory = feignRestClient.deleteCategoryr(newcategory.getId());
//        System.out.println("Category deleted");

        //create a movie
        Category category1 = feignRestClient.findCategoryById((long)1);
        Category category2 = feignRestClient.findCategoryById((long)2);
        List<Category> findCategories = new ArrayList<Category>();
        findCategories.add(category1);
        findCategories.add(category2);
        Movie newMovie = new Movie("The wedding Year", 2019, findCategories);
        newMovie = feignRestClient.createMovie(newUser.getId(), newMovie);
        System.out.println("New Movie: " + newMovie);

        //get movies by category id and type
    }
}
