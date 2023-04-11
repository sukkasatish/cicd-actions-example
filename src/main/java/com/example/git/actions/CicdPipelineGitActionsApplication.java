package com.example.git.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelineGitActionsApplication {

    @GetMapping("/users")
    public String getUserDetails(){
        return "Satish Sukka";
    }
    //commands to move code to created repository
    /*echo "# cicd-actions-example" >> README.md
    git init
    git add README.md
    git commit -m "gitfirst commit"
    git branch -M main
    git remote add origin git@github.com:sukkasatish/cicd-actions-example.git
    git push -u origin main*/
    public static void main(String[] args) {
        SpringApplication.run(CicdPipelineGitActionsApplication.class, args);
    }

}
