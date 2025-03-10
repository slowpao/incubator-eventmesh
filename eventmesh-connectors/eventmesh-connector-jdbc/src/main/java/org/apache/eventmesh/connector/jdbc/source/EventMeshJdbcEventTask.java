/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.connector.jdbc.source;

import org.apache.eventmesh.connector.jdbc.event.Event;
import org.apache.eventmesh.connector.jdbc.event.EventHandler;

/**
 * The EventMeshJdbcTask interface represents a task that interacts with the EventMesh through a JDBC connection. It extends the AutoCloseable
 * interface, allowing the task to be managed efficiently.
 */
public interface EventMeshJdbcEventTask<E extends Event> extends EventMeshJdbcTask {

    /**
     * Puts an event into the task for processing.
     *
     * @param event The event to be processed.
     * @throws InterruptedException If the operation is interrupted while waiting to put the event.
     */
    void put(E event) throws InterruptedException;

    /**
     * Registers a snapshot event handler to be executed when snapshot events occur.
     *
     * @param handler The SnapshotEventHandler to be registered.
     */
    void registerEventHandler(EventHandler handler);

}

