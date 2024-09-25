package com.coderscampus.assigment9.web;

import com.coderscampus.assigment9.domain.Recipe;
import com.coderscampus.assigment9.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class RecipeController {
    public RecipeService recipeService;
    @Autowired
    public RecipeController ( RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("/gluten-free") //Made to handle GET request
    public List<Recipe> glutenFreeRecipes() throws IOException {
        recipeService.loadRecipes();
        return recipeService.glutenFreeRecipes();
    }
    @GetMapping("/vegan")
    public List<Recipe> veganRecipes() throws IOException {
        recipeService.loadRecipes();
        return recipeService.veganRecipes();
    }
    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> veganAndGlutenFreeRecipes() throws IOException {
        recipeService.loadRecipes();
        return recipeService.veganAndGlutenFreeRecipes();
    }
    @GetMapping("/vegetarian")
    public List<Recipe> vegetarianRecipes() throws IOException{
        recipeService.loadRecipes();
        return recipeService.vegetarianRecipes();
    }
    @GetMapping("/all-recipes")
    public List<Recipe> allRecipes() throws IOException {
        recipeService.loadRecipes();
        return recipeService.allRecipes();
    }

}