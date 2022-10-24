package notes_soft_skills;

public class _10_03_2022_TestCaseRecap {
    /*
            User story has a template:

        As a type of user, I want to perform some action, so that I reach some goal.

        As a user, I want to recover access to my account in case I forget my password.

        As a user, I want to save posts I liked, so I can easily find them again.

        As a user, I want to share my screen with teammates, so I can give a presentation.

        As a user, I want to save posts I liked, so I can find them again

        As a user, I should be allowed to save favorite items and be stored into collections.


        As a user, I should be able to comment, so the other person can read the comment I left behind.

        Requirements:

        How should we solve this?
        What should we expect to happen.


        User story - US-1 Favorite button

        AC:

        1. The favorite button should be easily accessible to the user.

        2. The user should be able to choose the folder for the item.

        3. The user should be able to create a new favorite folder.


        We are not coming up with users stories, it is the responsibilities of the PO.

        Gherkin Language:

            It's a set of special keywords to give structure and meaning to the specifications.

            *Given, When, And, Then.

            These keywords are Given, When, And, Then. They are based on scenarios of what's to come.

        Going back to the favorite button using the Gherkin format.
            (Instagram)

            *Given (Pre-condition)
            Given that the user is on the homepage and they're logged in.

            Test data: Email or phone number.
            Ex) email: techglobal@gmail.com pw: Techglobal123!

            *When
            When a user clicks on the bookmark button.

            *Then
            Then "Save to Collections" will appear.

            *And
            And if user choose "Save to collections", application will allow user to save into their existing collection or new collection.

            We created one test case for this particular user story (Bookmark Button). This is one acceptance criteria.

            TEST CASE TC-1: Validate that user can contact us when filling out the information.

            Test Steps:
            1. User clicks on "Contact Us".
            2. User fills out the necessary information.
            3. User clicks on "Submit" button.
            4. User should be presented with a confirmation message. "Thank you your information has been submitted."

            Test Data:
            2. First name = Abraham, Last name Kim, Email .., Phone, etc.

            Expected Output:
            1. System should redirect us to Contact Form.
            2. System should display all information entered by user.
            3. System redirect or new message to appear.
            4. System should display "Thank you your information has been submitted."


//                    techglobal@Techs-iMac ~ % ls
//        Applications	Documents	IdeaProjects	Movies		Pictures
//        Desktop		Downloads	Library		Music		Public
//        techglobal@Techs-iMac ~ % cd IdeaProjects
//        techglobal@Techs-iMac IdeaProjects % ls
//        b5_recap		git_first_project	git_second_project	java_intro_5
//        techglobal@Techs-iMac IdeaProjects % cd b5_recap
//        techglobal@Techs-iMac b5_recap % git status
//        On branch master
//        Your branch is up to date with 'origin/master'.
//
//        Changes not staged for commit:
//          (use "git add <file>..." to update what will be committed)
//          (use "git restore <file>..." to discard changes in working directory)
//            modified:   src/Recap.java
//
//        no changes added to commit (use "git add" and/or "git commit -a")
//        techglobal@Techs-iMac b5_recap % git add .
//        techglobal@Techs-iMac b5_recap % git status
//        On branch master
//        Your branch is up to date with 'origin/master'.
//
//        Changes to be committed:
//          (use "git restore --staged <file>..." to unstage)
//            modified:   src/Recap.java
//
//        techglobal@Techs-iMac b5_recap % git commit -m "added line to show how to commit changes on the Terminal"
//        [master d806c46] added line to show how to commit changes on the Terminal
//         1 file changed, 1 insertion(+)
//        techglobal@Techs-iMac b5_recap % git push
//        Enumerating objects: 7, done.
//        Counting objects: 100% (7/7), done.
//        Delta compression using up to 4 threads
//        Compressing objects: 100% (3/3), done.
//        Writing objects: 100% (4/4), 430 bytes | 430.00 KiB/s, done.
//        Total 4 (delta 1), reused 0 (delta 0), pack-reused 0
//        To gitlab.com:techglobal.school/b5_recap.git
//           e97ee70..d806c46  master -> master
//        techglobal@Techs-iMac b5_recap %
     */
}
