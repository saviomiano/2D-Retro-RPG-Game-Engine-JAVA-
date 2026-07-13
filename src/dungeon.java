// Dungeon Map
// author: Sam
// 10/05/26

//E stands for Enemy
//B stands for Boss
//simple map

public class Dungeon{

	static DungeonMap dungeon = new DungeonMap();
	static Player player = new Player();

	public static void main(String args[]){
		dungeon.PrintMap();
		player.Direction();
		dungeon.Update(player,dungeon);
	}
}