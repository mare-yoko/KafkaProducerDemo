# KafkaProducerDemo

# 前提
- 下記がインストール済み、および各種アカウント登録等も設定済みであること
    - Docker Desktop
    - git
    - (Intellij)
    - Java 20

# 動かし方
- 下記リポジトリをcloneする
    - https://github.com/mare-yoko/KafkaProducerDemo 
    - https://github.com/mare-yoko/KafkaConsumerDemo
- KafkaProducerDemoのディレクトリに入り、下記コマンドを実行

```
$ docker-compose up -d
$ docker container exec -it {kafkaのコンテナ} bash
# トピック作成
$ kafka-topics.sh --create --topic topic2 --bootstrap-server localhost:9092
```

- Consumer、Producer両方起動し `localhost:8080` にアクセスする
    - Producer が `localhost:8080` 、Consumerが `localhost:8081` で起動しています。
- 入力欄に文字を入力して送信する
- Consumerのコンソールに送信した文字列が表示されていること
