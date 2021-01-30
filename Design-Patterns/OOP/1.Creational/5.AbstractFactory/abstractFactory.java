public interface abstractFactory<T>{
	T produce(String type);
	T getFactoryName(String name);
}
