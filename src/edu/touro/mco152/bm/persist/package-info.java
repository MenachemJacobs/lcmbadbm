/**
 * Provides classes that get, store, delete, and manage data obtained through the benchmark in a database.
 * <p>
 * relies heavily on jakarta.&nbsp;persistence for the database
 * <p>
 * {@link edu.touro.mco152.bm.persist.DiskRun DiskRun} Provides an entity for the storage benchmark and methods for adding, removing, querying, and changing data on jakarta.&nbsp;persistence's database.
 * {@link edu.touro.mco152.bm.persist.EM EM} Provides an EntityManager that to manage to help track and manage changes to the aforementioned database.
 */
package edu.touro.mco152.bm.persist;