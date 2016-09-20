package defaut;

public class Attribute extends NamedElement{
	Type t;

	public Attribute(String name, Type t) {
		super(name);
		this.t = t;
	}

	public Type getT() {
		return t;
	}

	public void setT(Type t) {
		this.t = t;
	}
	
}
