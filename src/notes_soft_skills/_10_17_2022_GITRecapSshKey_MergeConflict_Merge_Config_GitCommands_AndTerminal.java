package notes_soft_skills;

public class _10_17_2022_GITRecapSshKey_MergeConflict_Merge_Config_GitCommands_AndTerminal {
    /*
    2 types of Version Control

        Centralized: Files, or data stored in one place, negative side to this would be unable to restore quickly if there was a disaster.

        Distributed: Storing files or data into different buildings that have servers. This would allow to retrieve the data if one building went down.

        Platforms for GIT (Gitlab, Github, Bitbucket)
        We are storing tracked info on our codes.

        1. We created an account through Gitlab / Github / Bitbucket
        2. We generated SSH-keygen
        3. Took the .ssh pub key and stored into our preferences ssh and gave expiration.
        4. Once you have created a repo, make sure you check
        your terminal
            -git config --global user.name
            -git config --global user.email
        5. We need to initialize our new project in IntelliJ
            -git init
        6. .gitignore - Will not track changes and this will not add to your repo.
        7. Follow these commands to add to repo.
            -git add .
            -git commit -m "initial push"
            -git push (new branch there will be a 4th step)
            -git push -u origin master or main depending on your computer.
        8. git branch branchName (to create a branch)
        9. git checkout branchName (switch to that branch)
            -Now you will be able to make changes
            -git add .
            -git commit -m "added new change"
            -git push
            -git push -u origin master
        10. git merge conflict (Happens when someone is cloning and working on the same line)
            -To resolve manual through UI, accepting the request.
            -git pull and create a new branch and work off that.
            -git update project (blue down arrow on the top right-hand)
                -git merge incoming changes
            OR
            -git merge newbranchName (you must be on master)

        Terminal
     */
}
