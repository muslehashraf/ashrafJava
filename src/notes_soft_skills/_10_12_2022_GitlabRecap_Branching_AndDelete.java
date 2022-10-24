package notes_soft_skills;

public class _10_12_2022_GitlabRecap_Branching_AndDelete {
    /*
            Centralized - Storing all the files into one place
        Distributed - Storing files into different areas / sectors to be able to recover the files.
        SSH Key - Secured Shell (Authentication Credentials)
            *public key (.pub)- used inside the github / gitlab / bitbucket.
            *private key - used on your local machine.
            terminal ssh-keygen

        Terminal Intellij
            -git init (initialize)
            -git remote add (repo url)
                ex)git remote add origin git@gitlab.com:techglobal.school/recapsessionwithabe.git
            -git add . (add the new file changes)
            -git commit -m "meaningful message"
            -git push (push the code to the repo)
            -git push -u origin main or copy the new git command in terminal and paste that inside. (Only when this is a new branch or first time push)

            Once you have created a brand new project and you performed the actions above (line 12 in sublime) then you will only need to perform the actions below:

            -git add .
            -git commit -m "message"
            -git push

            Git branch (unique and tied to the author coder)

            -git branch <meaningfulTiedToUSandName> (not working on master / main)
            -git checkout <meaningfulTiedToUSandName> (now you are working on a new branch)
                -make the changes to the new branch
                -repeat the 4 step process (last one meaning git push -u origin master / main)

            Receive confirmation before you delete your branch

            After merging successful on gitlab / github / bitbucket for master and your branch
            must be on the master / main then perform this action)
                -Delete the previous branch
                -git branch -d <branchname>
     */
}
