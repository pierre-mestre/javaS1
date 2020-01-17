package ga;

public class Personne implements java.io.Serializable{
	private static final long serialVersionUID = -3161608338366064818L;
	private String nom;
	private String prenom;
	private int age;
	private String numss;

	// constructeur par defaut
	public Personne()
	{
		nom="";
		prenom="";
		age=0;
		numss="";
	}

	public Personne(String n, String p, int a)
	{
		nom=n;
		prenom=p;
		age=a;
		numss="";
	}

	public Personne(String n, String p, int a, String nss)
	{
		nom=n;
		prenom=p;
		age=a;
		numss=nss;
	}

	public Personne(Personne p)
	{
		nom=p.nom;
		prenom=p.prenom;
		age=p.age;
		numss=p.numss;
	}

	public void setNom(String n)
	{
		nom=n;
	}

	public void setPrenom(String p)
	{
		prenom=p;
	}

	public void setAge(int a)
	{
        		age=a;
	}

	public void setNumss(String numss)
	{
		this.numss=numss;
	}


	public String getNom()
	{
		return nom;
	}

	public String getPrenom()
	{
		return prenom;
	}

	public int getAge()
	{
		return age;
	}

	public String getNumss()
	{
		return numss;
	}

	public void print()
	{
		System.out.println("\nnom    : " + nom);
		System.out.println("prenom : " + prenom);
		System.out.println("age    : " + age);
	}

	public String toString()
	{
		return "Nom    : " + nom+" Prenom : " +
				prenom+" Age: " + age+'\n';
	}


} // fin de classe

