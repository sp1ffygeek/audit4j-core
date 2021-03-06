package org.audit4j.core.schedule;


/**
 * The Class CronTask.
 *
 * @author <a href="mailto:janith3000@gmail.com">Janith Bandara</a>
 */
public class CronTask extends TriggerTask {

    /** The expression. */
    private final String expression;

    /**
     * Create a new {@code CronTask}.
     * 
     * @param runnable
     *            the underlying task to execute
     * @param expression
     *            cron expression defining when the task should be executed
     */
    public CronTask(Runnable runnable, String expression) {
        this(runnable, new CronTrigger(expression));
    }

    /**
     * Create a new {@code CronTask}.
     * 
     * @param runnable
     *            the underlying task to execute
     * @param cronTrigger
     *            the cron trigger defining when the task should be executed
     */
    public CronTask(Runnable runnable, CronTrigger cronTrigger) {
        super(runnable, cronTrigger);
        this.expression = cronTrigger.getExpression();
    }

    /**
     * Gets the expression.
     *
     * @return the expression
     */
    public String getExpression() {
        return this.expression;
    }
}
