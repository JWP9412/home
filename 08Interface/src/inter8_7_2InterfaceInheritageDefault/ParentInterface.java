package inter8_7_2InterfaceInheritageDefault;

public interface ParentInterface {
	public void method1();
	public default void method2() {System.out.println("Parent met2");}
}
