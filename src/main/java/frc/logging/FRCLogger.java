package frc.logging;

/**
 * 
 * FRC Logger interface
 * 
 * @author Michael M.
 */
public interface FRCLogger {
    /**
     * Sets up the logger
     * 
     * e.g. creates any neccessary files
     */
    void setup();

    /**
     * Logs a formatted string.
     * 
     * @see String.format(String, Object...)
     * 
     * @param s The format string
     * @param objects Objects
     */
    void info(String s, Object... objects);

    /**
     * Logs a formatted string as a warning
     * 
     * @see String.format(String, Object...)
     * 
     * @param s The format string
     * @param objects Objects
     */
    void warn(String s, Object... objects);

    /**
     * Logs a formatted string as an error
     * 
     * @see String.format(String, Object...)
     * 
     * 
     * @param s The format string
     * @param objects Objects
     */
    void error(String s, Object... objects);

    /**
     * Logs an exception
     * 
     * @param t The error
     */
    void error(Throwable error);
}
