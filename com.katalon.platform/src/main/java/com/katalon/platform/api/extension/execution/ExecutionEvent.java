package com.katalon.platform.api.extension.execution;

import com.katalon.platform.api.extension.execution.impl.TestSuiteCollectionExecutionEvent;
import com.katalon.platform.api.extension.execution.impl.TestSuiteExecutionEvent;

/**
 * 
 * @see {@link TestSuiteExecutionEvent}
 * @see {@link TestSuiteCollectionExecutionEvent}
 */
public interface ExecutionEvent {
    String KATALON_EXECUTION_EVENT_ALL_TOPIC = "KATALON_EXECUTION/*";

    String TEST_SUITE_STARTED_EVENT = "KATALON_EXECUTION/TEST_SUITE_STARTED";

    String TEST_SUITE_FINISHED_EVENT = "KATALON_EXECUTION/TEST_SUITE_FINISHED";

    String TEST_SUITE_COLLECTION_STARTED_EVENT = "KATALON_EXECUTION/TEST_SUITE_COLLECTION_STARTED";

    String TEST_SUITE_COLLECTION_FINISHED_EVENT = "KATALON_EXECUTION/TEST_SUITE_COLLECTION_FINISHED";

    /**
     *
     * @see #TEST_SUITE_STARTED_EVENT
     * @see #TEST_SUITE_COMPLETED_EVENT
     * @see #TEST_SUITE_COLLECTION_STARTED_EVENT
     * @see #TEST_SUITE_COLLECTION_FINISHED_EVENT
     */
    String getEventName();

    /**
     * @see {@link TestSuiteExecutionContext}
     * @see {@link TestSuiteCollectionExecutionContext}
     */
    TestExecutionContext getExecutionContext();
}
