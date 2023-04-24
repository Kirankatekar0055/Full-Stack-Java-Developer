
class Player
{
	private String name,teamname;

public Player()
{
	name=null;
	teamname=null;
}
public Player(String name,String teamname)
{
	this.name=name;
	this.teamname=teamname;
}
public String toString()
{
	return "\nName="+name
			          +"\nTeamname="+teamname;			
}
}
class Batsman extends Player
{
	private int runs;
	
public Batsman()
{
	super();
	runs=0;
}

public Batsman(String name,String teamname,int runs)
{
    
	super(name,teamname);
	this.runs=runs;	
}
public String toString()
{
	return super.toString()+"\nRuns="+runs;
			
}
}
class Bowler extends Player
{
	private int wickets;
	
public Bowler()
{
	super();
	wickets=0;
}
public Bowler(String name,String teamname,int wickets)
{
	super(name,teamname);
	this.wickets=wickets;
	
}
public String toString()
{
	return super.toString()+"\nWickets="+wickets;
}
	
}
class InheriPlayer
{
	public static void main(String []args)
	{
		Batsman b=new Batsman("Rohit","India",100);
		Bowler b1=new Bowler("Trent","Newzelends",40);
		
		System.out.println("Type of obj:"+b.getClass());
		System.out.println(b);
		
		System.out.println("Type of obj:"+b1.getClass());
		System.out.println(b1);
	}
}


