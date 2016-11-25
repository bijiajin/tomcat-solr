solr与ikAnalyzer中文分词器整合
此处以solr-6.2.1为例

1、把ik-analyzer-solr5-5.x.jar 放到 solr-6.2.1\server\solr-webapp\webapp\WEB-INF\lib 中。

2、把ik的配置文件IKAnalyzer.cfg.xml，mydict.dic,stopword.dic 也放置到：solr-6.2.1\server\solr-webapp\webapp\WEB-INF\classes中。没有classes文件夹，创建一个。

3、在schema.xml或managed-schema文件中：
<fieldType name="text_ik" class="solr.TextField">
	<analyzer type="index" isMaxWordLength="false" class="org.wltea.analyzer.lucene.IKAnalyzer"/>
	<analyzer type="query" isMaxWordLength="true" class="org.wltea.analyzer.lucene.IKAnalyzer"/>
</fieldType>
<field name="content"  type="text_ik"  indexed = "true" stored="true" required="true"  />   

4、通过analysis，并选择content字段进行索引的分析。