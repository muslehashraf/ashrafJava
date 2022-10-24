package notes_soft_skills;

public class _10_11_2022_Git02RecapBranchingAndMerging {
    /*
            10/11/2022 - Git-2 Recap, Branching, and Merging

        1. We need to check if the Git is installed on our machine $ git version. If not install it

        2. We have created a project on the git.

        3. using commands
        $ git config --global user.name "your username"
        $ git config --global user.email "your email"

        we let git on our machine knows my GitLab account

        4. ssh key

           having git on my machines know the gitlab is not sufficient to exchange the data between my local and remote. So, we need shh set on our machine and GitLab


        5. Create your local project and make it git repo with $ git init command

        git add .
        git commit -m "your message"

        use this comment to let your local to know your remote project
        $ git remote add origin git@gitlab.com:techglobal.school/b5_recap.git

        $ git push -u origin master push your project to remote

        BRANCHING

        You need to create your own branch before you start writing you test script.

        You should not create or switch any branch before committing your changes on the current branch.

        After you switch to your your branch you can write your test script.

        Then, commit all the changes

        And use $ git push command (Intellij is giving you a required command. Just copy the text)

        On the gitlab switch the branch to your branch

        And create your Merge request and make sure it is from your branch into the master branch

        Put your meaningful title and create your MR

        Merge your MR

        Then go to your local, switch from your branch to master branch. (Make sure there is nothing to commit)

        When you are on the master branch on your local
        Then use $ git pull command




//        techglobal@Techs-iMac ~ % ls
//Applications	Documents	IdeaProjects	Movies		Pictures
//Desktop		Downloads	Library		Music		Public
//techglobal@Techs-iMac ~ % cd IdeaProjects
//techglobal@Techs-iMac IdeaProjects % ls
//b5_recap		git_first_project	git_second_project	java_intro_5
//techglobal@Techs-iMac IdeaProjects % cd b5_recap
//techglobal@Techs-iMac b5_recap % git status
//On branch master
//Your branch is up to date with 'origin/master'.
//
//Changes not staged for commit:
//  (use "git add <file>..." to update what will be committed)
//  (use "git restore <file>..." to discard changes in working directory)
//	modified:   src/Recap.java
//
//no changes added to commit (use "git add" and/or "git commit -a")
//techglobal@Techs-iMac b5_recap % git add .
//techglobal@Techs-iMac b5_recap % git status
//On branch master
//Your branch is up to date with 'origin/master'.
//
//Changes to be committed:
//  (use "git restore --staged <file>..." to unstage)
//	modified:   src/Recap.java
//
//techglobal@Techs-iMac b5_recap % git commit -m "added line to show how to commit changes on the Terminal"
//[master d806c46] added line to show how to commit changes on the Terminal
// 1 file changed, 1 insertion(+)
//techglobal@Techs-iMac b5_recap % git push
//Enumerating objects: 7, done.
//Counting objects: 100% (7/7), done.
//Delta compression using up to 4 threads
//Compressing objects: 100% (3/3), done.
//Writing objects: 100% (4/4), 430 bytes | 430.00 KiB/s, done.
//Total 4 (delta 1), reused 0 (delta 0), pack-reused 0
//To gitlab.com:techglobal.school/b5_recap.git
//   e97ee70..d806c46  master -> master
//techglobal@Techs-iMac b5_recap %
     */
}
