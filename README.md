# CIST:CaT

CIST:ComfortAble Toolkit(仮称) は、CIST生の学生生活をより便利にするためのアプリケーションです。
![mock](https://user-images.githubusercontent.com/41831807/219938781-83d66e09-8fad-45c1-936a-d9281116d446.png)

# このリポジトリについて
ここでは、anndroid端末でのフロントエンドの構築を行います。
バックエンドの開発は別のレポジトリで行います。

# 推奨開発環境
動作確認を含む開発は、[Android Studio](https://developer.android.com/studio?gclid=Cj0KCQiA3eGfBhCeARIsACpJNU-sGtOLFSI087ShZ_mygDp2e76nBRxhxVAspMJhwZcPzftDLaQV5jMaAo7SEALw_wcB&gclsrc=aw.ds)などのIDEの利用を推奨しています。ネイティブAndroidの開発が初めてのメンバーは、[こちら](https://developer.android.com/studio/install?gclid=Cj0KCQiA3eGfBhCeARIsACpJNU8G6U9CA7CfaoX5BdRdP5vrPkxYq3f_9KynYL4GsON0r-w1wcijWPAaAsJZEALw_wcB&gclsrc=aw.ds&hl=ja) を参考にインストールをしてください。

# 役割分担
流動的にタスクを配分するため、以下のような方法を採用します。


1. **担当するissueを決める**  
[githubでissuesを確認](https://github.com/ItisNoMatter/cist-cat/issues)し、まだ誰もアサインされていないissueを探しましょう。issue毎についているLabelsを見て判断するのもお勧めです。担当したいissueを見つけたら、assign yourselfをクリックします。
![assign-example](https://user-images.githubusercontent.com/41831807/219937092-98369e9c-5dba-42bc-91bb-7c28c4c4919c.png)

2. **ブランチを切って開発する**  
開発環境に戻って、devlopから「feature/(issue番号)」という名前のブランチを切って作業を始めます。issue番号は、githubでissueタイトルの傍に＃1のように表示されています。

3. **devlopへプルリクエストを送る**  
issueの要件を実装し終えたら、プルリクエストを送りましょう。問題ないと判断されたら、devlopにマージされます。基本的に、この時点でissueはcloseされます。
4. **[1.]に戻る**  
　魅力的なタスクがない場合は、自分で新しくissueを立てても良いです。

# 基本のgitルール
gitを使った開発が初めてのメンバーの参加も想定しています。  
以下は、gitを利用して共同開発を行うときに気を付けるとよいとされているルールです。  
これを守って開発することで、チーム開発における混乱を最小限に留めることができます。
1. **必ずブランチを切る**  
開発作業は、issue毎に必ず新しいブランチを切って行ってください。誤ってdevlopブランチやmasterブランチへコミットしないように気を付けましょう。
2. **こまめにコミットする**  
作業をしたときは、コミットメッセージと共にこまめなコミットを行うのが良いです。コミットメッセージを簡潔にまとめるのが難しい場合、そのコミットは変更が大きすぎる可能性があります（複数のコミットに分けたほうがいいかもしれません）。
3. **定期的にpullをする**  
他の開発メンバーのpushによる変更を取り入れるために、定期的にgit pullをしましょう。特に、devlopブランチのpullは大切です。ブランチを新しく切る前には、devlopブランチのpullを忘れないようにしましょう。

Gitには多くのコマンドが存在するため、必要に応じて詳細を調べてください。また、コマンドを実行する前には必ず、コマンドの意味や効果を理解してから実行してください。
