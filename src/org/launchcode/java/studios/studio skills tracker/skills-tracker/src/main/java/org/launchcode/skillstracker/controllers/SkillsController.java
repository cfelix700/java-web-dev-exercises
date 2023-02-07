package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.awt.SystemColor.text;

@Controller
@ResponseBody

public class SkillsController {
    private Object fav;

    @GetMapping("/")

    public String getHomePageContent(){

        return  "<html>"+
                "<body>"+
                "<h1>Skills Tracker<h/1>" +
                "<h2>We have a few skills we would like to learn. Here's the list!</h2>"+
                "<ol>"+
                "<li>Java</li>"+
                "<li>JavaScript</li>"+
                "<li>Python</li>"+
                "</ol>"+
                "<p>Click <a href='/form'>here</a> to select your favorite/</p>"+
                "</body>"+
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form(){
        return "<html>"+
                "<body>"+
                "<form action ='/result'>"+
                "<p>Name:</p>"+
                "<input type='text' name='name' />"+
                "<label>My favorite language: </label>"+
                "<select name = 'fave1'>"+
                "<option value = 'java'>Java</option>"+
                "<option value = 'javascript'>JavaScript</option>"+
                "<option value = 'python'>Python</option>"+
                "</select>"+
                "<label>My second favorite language: </label>"+
                "<select name = 'fave2'>"+
                "<option value = 'java'>Java</option>"+
                "<option value = 'javascript'>JavaScript</option>"+
                "<option value = 'python'>Python</option>"+
                "</select>"+
                "<label>My third favorite language: </label>"+
                "<select name = 'fave3'>"+
                "<option value = 'java'>Java</option>"+
                "<option value = 'javascript'>JavaScript</option>"+
                "<option value = 'python'>Python</option>"+
                "</select>"+

                "<button type='submit'>Submit</button>"+
                "</body>"+
                "</html>";


    }

    @GetMapping("/results")
    public String skillsOutput(@RequestParam String name, String fave1, String fave2, String fave3){
        return "<html>"+
                "<body>"+
                name +
                fave1 +
                fave2 +
                fave3 +
                "</body>"+
                "<html>";

    }
}
