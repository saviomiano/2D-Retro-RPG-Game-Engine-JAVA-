public class DungeonMap{

	boolean valid = false;
	String[][] map = new String[3][3];

	//start of the dungeon
	public DungeonMap(){
		map[0][0] = "[ ]";
		map[0][1] = "[X]";
		map[0][2] = "[ ]";
		map[1][0] = "[E]";
		map[1][1] = "[ ]";
		map[1][2] = "[ ]";
		map[2][0] = "[ ]";
		map[2][1] = "[ ]";
		map[2][2] = "[B]";
	}

	//direction map loop
	public void Update(Player player, DungeonMap dungeon){
		while(!valid){
			//up
			if(player.decision.equals("w")){
				if(player.Row >= 0){
					dungeon.map[player.Row][player.Col] = "[ ]"; //clear area
					player.Row -= 1;
					dungeon.map[player.Row][player.Col] = "[X]"; //add new area
					dungeon.PrintMap();
				}else{
					System.out.println("Can't go that way");
				}
			//left
			}else if(player.decision.equals("a")){
				if(player.Col >= 0){
					dungeon.map[player.Row][player.Col] = "[ ]";
					player.Col -= 1;
					dungeon.map[player.Row][player.Col] = "[X]";
					dungeon.PrintMap();
				}else{
					System.out.println("Can't go that way");
				}
			//down
			}else if(player.decision.equals("s")){
				if(player.Row < 3){
					dungeon.map[player.Row][player.Col] = "[ ]";
					player.Row += 1;
					dungeon.map[player.Row][player.Col] = "[X]";
					dungeon.PrintMap();
				}else{
					System.out.println("Can't go that way");
				}
			//right
			}else if(player.decision.equals("d")){
				if(player.Col < 3){
					dungeon.map[player.Row][player.Col] = "[ ]";
					player.Col += 1;
					dungeon.map[player.Row][player.Col] = "[X]";
					dungeon.PrintMap();
				}else{
					System.out.println("Can't go that way");
				}
			}else{
				System.out.println("Try again");System.out.println("");
			}
			//decision loop
			player.Direction();
		}
	}

	//print the map
	public void	PrintMap(){

	for(int row = 0; row < 3; row++){
		for(int col = 0; col < 3; col++){
			System.out.print(map[row][col]);
		}
		System.out.println();
		}
	}
}