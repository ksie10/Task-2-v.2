public class GameEngine {
    private static final int MAX_ATTEMPTS = 10;

    private final int min;
    private final int max;
    private int target;
    private int attempts;
    private boolean gameWon;
<<<<<<< HEAD

    private boolean gameOver;

=======
<<<<<<< HEAD
    private boolean userQuit;
=======
    private boolean hintsEnabled;
>>>>>>> e494470 (Add hint system to show proximity after 3 attempts)
>>>>>>> dev

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;
        this.attempts = 0;
        this.gameWon = false;
<<<<<<< HEAD

        this.gameOver = false;

=======
<<<<<<< HEAD
        this.userQuit = false;
=======
        this.hintsEnabled = true;
>>>>>>> e494470 (Add hint system to show proximity after 3 attempts)
>>>>>>> dev
        reset();
    }

    public GuessResult makeGuess(int guess) {
        // Check if user wants to quit (negative number)
        if (guess < 0) {
            userQuit = true;
            return new GuessResult(false, "Exiting game...", attempts);
        }

        attempts++;

        if (guess == target) {
            gameWon = true;
            return new GuessResult(true, "Correct! You guessed it in " + attempts + " attempts.", attempts);
<<<<<<< HEAD
        } else if (guess < target) {
            return new GuessResult(false, "Too low! Try a higher number.", attempts);
        } else {
            return new GuessResult(false, "Too high! Try a lower number.", attempts);
=======
<<<<<<< HEAD
        } else if (attempts >= MAX_ATTEMPTS) {
            gameOver = true;
            return new GuessResult(false, "Game Over! You've used all " + MAX_ATTEMPTS + " attempts. The number was " + target + ".", attempts);
        } else {
            int remaining = MAX_ATTEMPTS - attempts;
=======
        } else {
            String hint = getHint(guess);
>>>>>>> dev
            GuessResult result;
            if (guess < target) {
                result = new GuessResult(false, "Too low!", attempts);
            } else {
                result = new GuessResult(false, "Too high!", attempts);
            }
<<<<<<< HEAD
            result.setRemainingAttempts(remaining);
            return result;
>>>>>>> e367776 (Implement max attempts logic and game over condition)
=======
            result.setHint(hint);
            return result;
>>>>>>> e494470 (Add hint system to show proximity after 3 attempts)
>>>>>>> dev
        }
    }

    public void reset() {
        target = Utils.randomInt(min, max);
        attempts = 0;
        gameWon = false;

        gameOver = false;

    }

    public boolean isGameWon() {
        return gameWon;
    }


    public boolean hasUserQuit() {
        return userQuit;

    public boolean isGameOver() {
        return gameOver;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public boolean isHintsEnabled() {
        return hintsEnabled;
    }

    public void setHintsEnabled(boolean enabled) {
        this.hintsEnabled = enabled;
    }

    private String getHint(int guess) {
        if (!hintsEnabled) {
            return "";
        }

        int diff = Math.abs(target - guess);
        if (attempts >= 3 && diff <= 10) {
            return " HINT: You're very close!";
        } else if (attempts >= 5 && diff <= 20) {
            return " HINT: Getting warmer!";
        }
        return "";
    }

    // For testing purposes only
    protected void setTarget(int target) {
        this.target = target;
    }

    protected int getTarget() {
        return target;
    }
}
