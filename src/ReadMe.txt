solr��ikAnalyzer���ķִ�������
�˴���solr-6.2.1Ϊ��

1����ik-analyzer-solr5-5.x.jar �ŵ� solr-6.2.1\server\solr-webapp\webapp\WEB-INF\lib �С�

2����ik�������ļ�IKAnalyzer.cfg.xml��mydict.dic,stopword.dic Ҳ���õ���solr-6.2.1\server\solr-webapp\webapp\WEB-INF\classes�С�û��classes�ļ��У�����һ����

3����schema.xml��managed-schema�ļ��У�
<fieldType name="text_ik" class="solr.TextField">
	<analyzer type="index" isMaxWordLength="false" class="org.wltea.analyzer.lucene.IKAnalyzer"/>
	<analyzer type="query" isMaxWordLength="true" class="org.wltea.analyzer.lucene.IKAnalyzer"/>
</fieldType>
<field name="content"  type="text_ik"  indexed = "true" stored="true" required="true"  />   

4��ͨ��analysis����ѡ��content�ֶν��������ķ�����