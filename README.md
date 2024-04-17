## Reproduce No bean introspection available for type xxx error

Micronaut version: 4.3.8
Kotlin version: 1.9.23

### Steps to reproduce

Run test in `ProjectEntityRepositoryTest`, it would produce the following error:

```
io.micronaut.core.beans.exceptions.IntrospectionException: No bean introspection available for type [class com.stevenyue.ProjectEntity]. Ensure the class is annotated with io.micronaut.core.annotation.Introspected
	at io.micronaut.core.beans.BeanIntrospector.lambda$getIntrospection$3(BeanIntrospector.java:116)
	at java.base/java.util.Optional.orElseThrow(Optional.java:403)
	at io.micronaut.core.beans.BeanIntrospector.getIntrospection(BeanIntrospector.java:116)
	at io.micronaut.core.beans.BeanIntrospection.getIntrospection(BeanIntrospection.java:282)
	at io.micronaut.data.model.runtime.RuntimePersistentEntity.<init>(RuntimePersistentEntity.java:70)
	at io.micronaut.data.runtime.support.DefaultRuntimeEntityRegistry$1.<init>(DefaultRuntimeEntityRegistry.java:119)
	at io.micronaut.data.runtime.support.DefaultRuntimeEntityRegistry.newEntity(DefaultRuntimeEntityRegistry.java:119)
	at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1708)
	at io.micronaut.data.runtime.support.DefaultRuntimeEntityRegistry.getEntity(DefaultRuntimeEntityRegistry.java:113)
	at io.micronaut.data.runtime.operations.internal.sql.AbstractSqlRepositoryOperations.decorate(AbstractSqlRepositoryOperations.java:183)
	at io.micronaut.data.runtime.intercept.AbstractQueryInterceptor.findStoreQuery(AbstractQueryInterceptor.java:282)
	at io.micronaut.data.runtime.intercept.AbstractQueryInterceptor.prepareQuery(AbstractQueryInterceptor.java:260)
	at io.micronaut.data.runtime.intercept.AbstractQueryInterceptor.prepareQuery(AbstractQueryInterceptor.java:241)
	at io.micronaut.data.runtime.intercept.DefaultFindOneInterceptor.intercept(DefaultFindOneInterceptor.java:42)
	at io.micronaut.data.runtime.intercept.DataIntroductionAdvice.intercept(DataIntroductionAdvice.java:83)
	at io.micronaut.aop.chain.MethodInterceptorChain.proceed(MethodInterceptorChain.java:138)
	at com.stevenyue.ProjectEntityRepository$Intercepted.findByName(Unknown Source)
	at com.stevenyue.ProjectEntityRepositoryTest.findByName returns project entity(ProjectEntityRepositoryTest.kt:15)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.micronaut.test.extensions.junit5.MicronautJunit5Extension$2.proceed(MicronautJunit5Extension.java:142)
	at io.micronaut.test.extensions.AbstractMicronautExtension.interceptEach(AbstractMicronautExtension.java:157)
	at io.micronaut.test.extensions.AbstractMicronautExtension$3.proceed(AbstractMicronautExtension.java:169)
	at io.micronaut.test.context.TestMethodInterceptor.interceptTest(TestMethodInterceptor.java:46)
	at io.micronaut.transaction.test.DefaultTestTransactionExecutionListener.lambda$interceptTest$0(DefaultTestTransactionExecutionListener.java:93)
	at io.micronaut.transaction.support.AbstractPropagatedStatusTransactionOperations.lambda$execute$2(AbstractPropagatedStatusTransactionOperations.java:68)
	at io.micronaut.transaction.TransactionCallback.apply(TransactionCallback.java:37)
	at io.micronaut.transaction.support.AbstractTransactionOperations.executeTransactional(AbstractTransactionOperations.java:333)
	at io.micronaut.transaction.support.AbstractTransactionOperations.executeWithNewTransaction(AbstractTransactionOperations.java:318)
	at io.micronaut.transaction.support.AbstractTransactionOperations.executeNew(AbstractTransactionOperations.java:235)
	at io.micronaut.transaction.support.AbstractTransactionOperations.doExecute(AbstractTransactionOperations.java:137)
	at io.micronaut.transaction.support.AbstractTransactionOperations.lambda$doExecute$0(AbstractTransactionOperations.java:122)
	at io.micronaut.data.connection.support.AbstractConnectionOperations.executeWithNewConnection(AbstractConnectionOperations.java:143)
	at io.micronaut.data.connection.support.AbstractConnectionOperations.execute(AbstractConnectionOperations.java:90)
	at io.micronaut.transaction.support.AbstractTransactionOperations.doExecute(AbstractTransactionOperations.java:120)
	at io.micronaut.transaction.support.AbstractPropagatedStatusTransactionOperations.execute(AbstractPropagatedStatusTransactionOperations.java:65)
	at io.micronaut.transaction.test.DefaultTestTransactionExecutionListener.interceptTest(DefaultTestTransactionExecutionListener.java:91)
	at io.micronaut.test.extensions.AbstractMicronautExtension.interceptEach(AbstractMicronautExtension.java:161)
	at io.micronaut.test.extensions.AbstractMicronautExtension.interceptTest(AbstractMicronautExtension.java:114)
	at io.micronaut.test.extensions.junit5.MicronautJunit5Extension.interceptTestMethod(MicronautJunit5Extension.java:129)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
```