2015/12/22 リーダブルコードワークショップ課題    Wataru Fukushima

# 実行に必要な環境
* Java SE 8 がインストールされている環境
  http://www.oracle.com/technetwork/java/javase/downloads/index.html
* GitHubへのアクセス

# 実行方法
以下のようにして実行可能。
1. ソースコード一式を取得する
   例)Windows PCでコマンドプロンプトで以下を実行する

git clone https://github.com/jswaf/jswaf-rcw.git .\jswaf-rcw


2. コンパイルする
   例)Windows PCでコマンドプロンプトで以下を実行する

cd .\jswaf-rcw
mkdir classes
cd src
javac -d ..\classes -encoding UTF-8 *.java


3. 実行する
   例)Windows PCでコマンドプロンプトで以下を実行する

java -cp ..\classes TaskExample

