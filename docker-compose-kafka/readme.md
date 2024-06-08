Above command starts kafka
    docker-compose up -d


Verifying the Kafka Cluster
    docker-compose ps

create topic

    docker-compose exec kafka kafka-topics.sh --create --topic test --partitions 1 --replication-factor 1 --bootstrap-server kafka:9093

Create consumer 

    docker-compose exec kafka kafka-console-consumer.sh --topic test  --from-beginning --bootstrap-server kafka:9093


Create producer

    docker-compose exec kafka kafka-console-producer.sh --topic test  --broker-list kafka:9093