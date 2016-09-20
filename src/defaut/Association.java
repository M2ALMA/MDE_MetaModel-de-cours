package defaut;

import java.util.ArrayList;
import java.util.List;

public class Association extends NamedElement {
	public Package p;
	
	private List<Attribute> listeAttribute = new ArrayList<>();
	private List<Role> listeRole = new ArrayList<>();
	
	public Association(String name, Package p, List<Attribute> listeAttribute,
			List<Role> listeRole) {
		super(name);
		this.p = p;
		this.listeAttribute = listeAttribute;
		this.listeRole = listeRole;
	}

	//créer une association en indiquant son package
	public Association(Package p){
		this.p = p;
	}

	public Package getP() {
		return p;
	}

	public void setP(Package p) {
		this.p = p;
	}

	public List<Attribute> getListeAttribute() {
		return listeAttribute;
	}

	public void setListeAttribute(List<Attribute> listeAttribute) {
		this.listeAttribute = listeAttribute;
	}

	public List<Role> getListeRole() {
		return listeRole;
	}

	public void setListeRole(List<Role> listeRole) {
		this.listeRole = listeRole;
	}
	
	
}
