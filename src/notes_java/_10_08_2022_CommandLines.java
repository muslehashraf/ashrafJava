package notes_java;

public class _10_08_2022_CommandLines {
    /*
            MAC OS - Don't need to download

         GUI - Graphical User Interface
         CLI - Command Line Prompt Interface.

         Windows - Type cd change directory
         Mac OS - Type pwd print working directory

         Shortcuts
         Windows - cd %homedrive%%homepath% -> System goes directly into the user's home path
         Mac OS - Command + shift + h -> System goes directly into the user's home path

        Directory listing folders or applications.
        Windows - dir -> see directory what's available
        Mac - ls -> see directory what's available

        Showing hidden files
        Windows - cd 			-> Show hidden files automatically
        Mac - cmd + shift + . 	-> Show hidden windows on folder
            - ls -a 			-> Show hidden files on terminal

        Forward and backwards
        Windows - cd directoryName -> Go to the directory
        Mac - cd directoryName -> Go to the directory

        Clear history
        Windows - cls - Clear inside cmd
        Mac - clear - Clear

        History
        Windows - doskey history / F7
        Mac - history

        Option to run previous code with history
        Windows -
        Mac - !# (No spaces just enter line #)

        Option to run previous code
        Windows / Mac - up arrow

        Editing long line of code in terminal
        Windows - ctrl arrowkeys left + right
        Mac - option arrowkeys left + right

        How to edit beginning line of code
        Windows - press home button
        Mac - ctrl + a (beginning)

        How to edit last line of code
        Windows - press end button
        Mac - ctrl + e (end)

        How to rename a folder
        Windows - ren folderName aNewFolderName
        Mac - mv folderName aNewFolderName

        gitbash - windows (this will now be following the terminal such as MAC OS)

            -You can perform the actions just like mac os shortcuts

        Jump between characters
            Windows
            Mac ctrl + f / b (f = forward, b = backwards)

        Killing lines, words
            Windows - ctrl + home (move cursor to the beginning of the line) / ctrl + end (move cursor to the end of the line).
            Mac OS - ctrl + k (middle to end of the cursor) / ctrl + u (your cursor to the front)

        Create a file
            Windows type NUL > fileName.txt (create empty file)
            MAC OS echo I am writing a message here	>> fileName
            -	ex) echo Hi my name is x, I am x years old.>>aboutMyself.txt

        Delete file
            Windows del fileName.txt
            MAC OS rm filename

        Removing subfolder containing file or another folder
        Windows - rmdir foldername /s /q (/s = silently, /q = quietly)
        Mac OS - rm -r folderName

        Part 1
        1. Make a directory called first
        2. Change directory to the first folder
        3. Create a file called person.txt
        4. Change the name of person.txt to another.txt
        5. remove the another.txt file
        6. delete the first folder


        Part 1 (Windows answers)
        1. mkdir first
        2. cd first
        3. type nul > person.txt
        4. ren person.txt another.txt
        5. remove another.txt
        6. rmdir first /s /q

        Part 1 (MAC OS answers)
        1. mkdir first
        2. cd first
        3. touch person.txt or echo person.txt
        4. mv person.txt another.txt
        5. rm another.txt
        6. rm -r first
     */
}
