# Initial Number Guessing Game

## Branch Structure: This project uses 6 branches to to organize the development of the game.

### main
Contains the initial stable production of the game

### feature1
Adds UX improvements like ability to quit game with negative number input, play-again loop functionality, improved user feedback messages for guesses

### dev
Adds encouraging messages for players

### feature2
Adds maxAttempts logic to limit number of guesses and game over condition when attempts are exceeded

### feature3
Implements the hint system, fixed some issues with it and finalized the hint feature

### hotfix
Critical bug fixes


# Learning Summary

## Merge
Combines two branches. Preserves complete history. Creates a merge commit with two parents.

## Rebase
Moves commits to the tip of another branch, rewrites history. New hash created.

## Squash
Combines multiple commits into one. 

## Cherry-pick
Copies a specific commit from one branch to another. 


## Overall patterns

### feature3 = Clean (squashed, 1 commit)

### feature2 = Detailed (multiple commits preserved)

### Merge conflicts resolved: "Merge issues fix", "Manual fix of merge conflict for dev and feature1"

### Hotfix applied: randomInt bug fix from separate branch

### Main merged into dev: Top commit shows integration

#### The difference shows two approaches: feature3 with clean squashed history vs feature2 with detailed commit-by-commit history.



## When to use each strategy?

### Merge
- when working with feature branches because it preserves who did what and when
- multiple developers are working together
- public branches and release branches

### Rebase
- to clean up branch before reviewing
- get the latest main withoutmerge commits
- private branches only
- makes reading history easier

### Squash
- during merge time
- clean work in progress commits
- before main merge, to keep main branch history clean with one commit per feature
- before sharing the branch

### Cherry-pick
- when applying critical bug fixes to multiple release branches
- copy a good commit after a bad rebase
- grabbing specific commits from another team's branch