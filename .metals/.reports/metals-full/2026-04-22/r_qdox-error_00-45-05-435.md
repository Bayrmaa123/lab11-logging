error id: file:///C:/java_labs/lab11-logging/src/test/java/com/lab11/AppTest.java
file:///C:/java_labs/lab11-logging/src/test/java/com/lab11/AppTest.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[35,1]

error in qdox parser
file content:
```java
offset: 1037
uri: file:///C:/java_labs/lab11-logging/src/test/java/com/lab11/AppTest.java
text:
```scala
package com.lab11;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        // Хүлээгдэж буй үр дүн 1500.0 байх ёстой
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(1000.0);
        account.withdraw(400.0);
        // Хүлээгдэж буй үр дүн 600.0 байх ёстой
        assertEquals(600.0, account.getBalance(), 0.001);
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(500.0); // Үлдэгдэл хүрэхгүй үе
        // Үлдэгдэл хэвээрээ (100.0) үлдэх ёстой
        assertEquals(100.0, account.getBalance(), 0.001);
    }
    // App.java дотор нэмж бичнэ
Customer buggyCustomer = new Customer("Bold", null);
try {
    buggyCustomer.getDomain();
}@@ catch (Exception e) {
    System.out.println("Алдаа гарлаа, app.log-оос шалтгааныг нь харна уу.");
}
}
```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:49)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:99)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:560)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:691)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:688)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:630)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:628)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1313)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:688)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:940)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:842)
```
#### Short summary: 

QDox parse error in file:///C:/java_labs/lab11-logging/src/test/java/com/lab11/AppTest.java