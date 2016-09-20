package defaut;

import java.util.ArrayList;
import java.util.List;

public class Entity extends NamedElement{
	private Package p;
	
	private List<Attribute> listeAttribute = new ArrayList<>();
	private List<Role> listeRole = new ArrayList<>();
	
	public Entity(String name, Package p, List<Attribute> listeAttribute,
			List<Role> listeRole) {
		super(name);
		this.p = p;
		this.listeAttribute = listeAttribute;
		this.listeRole = listeRole;
	}
	
	public Entity(Package p){
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


	/*fonction qui renvoit tous les entity relié avec cet entity*/
	public List<Entity> entityAssocié(){
		for(Role r : listeRole){
		
		}
		return new ArrayList<>();
	}
}
