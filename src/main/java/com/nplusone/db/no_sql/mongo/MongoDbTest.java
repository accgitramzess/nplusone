package com.nplusone.db.no_sql.mongo;

/*


Cool tutorial
    - https://www.mongodb.com/docs/manual/core/data-modeling-introduction/
    - https://www.tutorialspoint.com/mongodb/mongodb_covered_queries.htm

MongoDB -> Database -> Collections -> Documents - Fields
Combining the objects into one document, if we have to use them jointly, or else, separate them.

MongoDB - cross-platform, document-oriented database, works on the concept of Collection and Document.

1). advantages of MongoDB
        Support primary and secondary index on any fields
        Uses a dynamic database schema
        Very easy to scale up or down
        Has inbuilt support for data partitioning (Sharding)

2). What is a Document in MongoDB? - is an ordered set of keys with associated values

3). What is a Collection in MongoDB? -  is a group of documents.
        If a document is the MongoDB analog of a row in a relational database,
        then a collection can be thought of as the analog to a table.

4). What are Databases in MongoDB? - Set of Collections

5). What are some features of MongoDB?
        Indexing:
            It supports generic secondary indexes and provides unique, compound, geospatial, and full-text indexing capabilities as well.

        Aggregation:
            It provides an aggregation framework based on the concept of data processing pipelines.

        Special collection and index types:
            It supports time-to-live (TTL) collections for data that should expire at a certain time

        File storage:
            It supports an easy-to-use protocol for storing large files and file metadata.

        Sharding:
            Sharding is the process of splitting data up across machines.

6). When to use MongoDB?


7). Sharding


8). Explain Capped Collection?
        In MongoDB, the Capped collection is a special kind of collection.
        This indicates that in this collection, we can restrict the collection size.
        Syntax of Capped Collection is as follows:



9). What does ObjectId contain?
        ObjectId contains the following:

        Client machine ID
        Client process ID
        Byte incremented counter
        Timestamp

10). Explain MongoDB Projection
        In MongoDB, we use Projection for selecting only the required data.
        It will not select the complete data of a document.


11). What do you know about NoSQL databases?
        What are the various types of NoSQL databases?
        NoSQL refers to “Not Only SQL”.
        NoSQL is a kind of database that handles and sorts all kinds of structured, massive, and difficult data.
        It is a new method to think about databases.

        Kinds of NoSQL databases:

        Key-Value
        Graph
        Column Oriented
        Document Oriented

When should we normalize the data in MongoDB?



12). What is the purpose of the save() method?
        We use the save() method for replacing the existing documents with new documents.


13). How does MongoDB provides concurrency?
        MongoDB utilizes the reader-writer locks,
        enabling concurrent readers to access any supply such as collection or database
        though it provides private access to individual writers.


14). Explain Primary and Secondary Replica Sets?

15).  What is a replica set?
        We can specify the replica as a set of the mongo instances which host a similar data set.
        In the replica set, one node will be primary, and another one will be secondary.
        We replicate all the data from the primary to the secondary nodes.


16). Explain the significance of the covered query?

*/
public class MongoDbTest {
}
