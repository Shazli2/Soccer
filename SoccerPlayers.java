public class SoccerPlayers {
  private String name;
  private int age;
  private String team;
  private int scoredGoals;
  public SoccerPlayers(String name,int age,String team, int scoredGoals){
    this.name = name;
    this.age = age;
    this.team = team;
    this.scoredGoals = scoredGoals;
  }
  public SoccerPlayers(String name, int age, int scoredGoals){
    this.name = name;
    this.age = age;
    this.scoredGoals = scoredGoals;
    this.team="unknown";
  }
  public SoccerPlayers(String name, int age, String team){
    this.name = name;
    this.age = age;
    this.team = team;
    this.scoredGoals = 0;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getTeam(){
    return team;
  }
  public void setTeam(String team){
    this.team = team;
  }
  public int getScoredGoals(){
    return scoredGoals;
  }
  public void setScoredGoals(int scoredGoals){
    this.scoredGoals = scoredGoals;
  }

  @Override
  public String toString() {
    return "SoccerPlayer{name='" + name + "', age=" + age +
            ", team='" + team + "', scoredGoals=" + scoredGoals + "}";
  }
  public boolean equals(Object obj){
    if (this==obj) return true;
    if (obj==null || getClass() != obj.getClass()) return false;
    SoccerPlayers that = (SoccerPlayers) obj;
    return scoredGoals == that.scoredGoals && team.equals(that.team);
  }

  public static void main(String[] args) {
    SoccerPlayers player1 = new SoccerPlayers("Lionel Nessi",36,"Inter Miami",700);
    SoccerPlayers player2 = new SoccerPlayers("Cristiano Ronaldo", 38, "Al-Nassr", 15);
    SoccerPlayers player3 = new SoccerPlayers("Robert Lewandowski", 35, "Barcelona", 25);
    SoccerPlayers player4 = new SoccerPlayers("Neymar", 32, 20);
    SoccerPlayers player5 = new SoccerPlayers("Kylian Mbappe", 24, 30);
    System.out.println(player1);
    System.out.println(player2);
    System.out.println(player3);
    System.out.println(player4);
    System.out.println(player5);
    System.out.println(player1.equals(player2));
    System.out.println(player3.equals(player4));
    System.out.println(player5.equals(player1));
  }
}
/* Create SoccerPlayer class
Task:
a. Create SoccerPlayers class which will have name, age, team, scoredGoals.
b. Create 3 Constructor (name, age, team, scoredGoals)
 (name, age, scoredGoals) (name, age, team)
c. Create getter and setter for all variables.
d. Override toString function
e. Override equals function to compare scoredGoals and team (just two of them)
f. Create main function and in the main function create 5-6 players. Then Test all of them.
g. Create github repo for this project from your github and publish your codes in your github,
 then send the link to me.
 */