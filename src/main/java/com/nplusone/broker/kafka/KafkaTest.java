package com.nplusone.broker.kafka;

/**
 *      Topics
 *                         0          1         2         3        4         5        < - Offset
 *      Partition 0 -> | record  | record  | record  | record  | record  | record  |
 *      Partition 1 -> | record  | record  | record  | record  | record  | record  |
 *      Partition 2 -> | record  | record  | record  | record  | record  | record  |
 *      Partition 3 -> | record  | record  | record  | record  | record  | record  |
 *      Partition 4 -> | record  | record  | record  | record  | record  | record  |
 *
 *      Record within a partition are ordered, messages across a topic are not guaranteed to be ordered.
 *
 * Writing records to partitions
 *      How does a producer decide to which partition a record should go?
 *      There are three ways a producer can rule on that.
 *      1). Using a partition key to specify the partition ->
 *                  A producer can use a partition key to direct messages to a specific partition
 *      2). Allowing Kafka to decide the partition - >
 *                  If a producer doesn’t specify a partition key when producing a record, Kafka will use a round-robin partition assignment.
 *
 *      3). Writing a custom partitioner
 *
 *
 * Reading records from partitions.
 *      Сonsumer is crash and up after some time. So now how it knows that it needs to read from offset 4?
 *      The consumer offset in general are stored in the internal topic __consumer_offsets.
 * The consumer has three options to read messages from the Topic:
 *      --from-beginning — reading all the messages from the beginning.
 *      --latest — will read only those messages that will come after the consumer spun up.
 *      --offset — will read from a particular position and particular offset. This option can be done only programmatically.
 *      --offset 6 reads the message in a topic by passing a specific value from the consumer.
 *
 *
 * How to choose the number of topics/partitions in a Kafka cluster?????
 *
 *
 * Two consumer groups for the same topic
 *    1. Offset for every consumer has his own offset per partition
 *    2. Every consumer start up red partition from the begin - Every consumer start up assign a new consumer group
 *
 *
 * Note : - > : There could be only one consumer thread in a consumer.
 *              However, we could spawn multiple application threads for processing those received records.
 *
 *
 */
public class KafkaTest { }
