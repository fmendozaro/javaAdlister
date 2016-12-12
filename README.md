# Java Adlister Project

This repo contains the java adlister project that we will work through with
students througout the latter half of the java curriculum.

This repo is intended to stay private only visible to the instructors. To
deliver the project to students we will push a series of tags to a repo that
will be visible to students, so they are not given all the solutions ahead of
time. The tags, in order, are:

```txt
servlets
servlets-solution
jsp-and-jstl
jsp-and-jstl-solution
mvc
mvc-solution
sessions-and-cookies
sessions-and-cookies-solution
jdbc
jdbc-solution
user-input
user-input-solution
passwords
passwords-solution
```

Students will checkout each tag and branch off of it to do their work on the
exercise. Note that when you checkout a tag, your repo will be in a detached
HEAD state. Thus, **it is very important to create and switch to a branch once
you have checked out a tag**. If you do not, you will still be able to add and
commit files, but since you are not on a branch, your commits will be lost
whenever you switch branches. If this happens to a student (as it inevitably
will) the work can be recovered thanks to git's awesomeness. Run

```bash
git reflog
```

and look for the last commit the student made. Note the hash of the commit, and
then check out that commit

```bash
git checkout <sha>
```

From here, create a new branch so that the work will be saved.

## Updating The Students' Repository

1. Clone this repo

1. Add the students' repo as a new remote, for example

	```bash
	git remote add mammoth git@github.com:gocodeup/mammoth-adlister.git
	```

1. Push the desired tags

	```bash
	git push mammoth servlets-solution
	```

**DO NOT** push the master branch, as this would defeat the purpose of using the
tags.
