# OreGen.json
This documentation is for a more in-depth analysis of what each field does in OreGen.json. 

#### Name
Name is what the code looks for when looking for information stored in the json file. It's loaded with a for loop, in: 
>[com.gmail.rohzek.world.WorldGenerators](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/WorldGenerators.java)

which looks something like:
```Sudo code:
for each block that should be spawned
  for each entry in the json file
    if json.name is equal to block.name
      load data
```
It shouldn't be changed, or the mod won't be able to load that ore, and will throw a NullPointerException and crash.
#### Spawn Block
Spawn Block, is as the name suggests, the block that the ore should be spawned in side/should replace. It uses the
>sourceid:registryName

format, such as:
>minecraft:stone

for smooth stone from Minecraft. Note, this defaults to metadata 0, which is regular stone as opposed to andesite, granite etc.
It gets consumed by the code in:
>[com.gmail.rohzek.world.SGWorldGenMineable](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGenMineable.java)
>[com.gmail.rohzek.world.SGWorldGenMineableEmerald](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGenMineableEmerald.java)

where it's used in the constructor to set the block.
```Java
public SGWorldGenMineable(IBlockState state, int blockCount, OreData data)
{
    this(state, blockCount,BlockMatcher.forBlock(Block.getBlockFromName(data.spawnBlock)), data);
}
```
#### Mining Level
Mining level sets the level of pickaxe that is needed to mine the block. It only effects SimpleOreGeneration blocks, as other mod's blocks, and vanilla blocks, can't be (easily) overwritten.
Here are the valid levels, and what they do:
| JSON Entry | Vanilla Blocks Mined | Level |
| ------ | ------ | ------ | 
| WOOD | Coal, Nether Quartz, Stone | 0 |
| WOODEN | Same as WOOD | 0 |
| GOLD | Same as WOOD | 0 |
| GOLDEN | Same as WOOD | 0 |
| STONE | Iron, Lapis Lazuli | 1 |
| IRON | Diamond, Emerald, Gold, Redstone | 2 |
| DIAMOND | Everything | 3 |
| CUSTOM | Not used in vanilla, only in some mods. | 4 |
If a word not in the table above is used, it defaults to mining level 2 (Iron)

It's set in code, in:
>[com.gmail.rohzek.blocks.MiningLevels](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/blocks/MiningLevels.java)

where each block is read in with a for loop, and the mining level parsed from text to the game's int level with:

```Java
public static int getMiningLevel(String level)
{
		if(level.equalsIgnoreCase("wooden") || level.equalsIgnoreCase("wood") || level.equalsIgnoreCase("gold") || level.equalsIgnoreCase("golden"))
	{
		return 0;
	}
	
	else if(level.equalsIgnoreCase("stone"))
	{
		return 1;
	}
	
	else if(level.equalsIgnoreCase("iron") || level.equalsIgnoreCase("modded"))
	{
		return 2;
	}
	
	else if(level.equalsIgnoreCase("diamond"))
	{
		return 3;
	}
	
	else if(level.equalsIgnoreCase("custom"))
	{
		return 4;
	}
	
	return 2;
}
```
#### Min Y
Min Y is the lowest Y level (or height) that the block will appear on.
###### Overworld:
By default levels 0 through 256 are valid. Servers can set the world height to a higher value, and thus can increase this 256, but not sure if it's possible in singleplayer.
###### Nether:
Levels 0 through 128 are valid for ore. Unsure if this height can be changed, even on servers. (Though mushrooms can be generated above bedrock, no netherrack is generated above it, so ores will not appear)
###### End:
Generally levels 10 through 60 are usable, though I'm not sure if these are *actual* min and max values. Keep in mind, The End has no bedrock floor, so if you mine too low on a particular island, you fall into the void.

Min Y is used in code, in:
>[com.gmail.rohzek.world.SGWorldGen](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGen.java)

where it's passed into the runGenerator function:
```Java
runGenerator (... int minHeight, int maxHeight)
```
and is used to determine the random Y level:
```Java
int heightDiff = maxHeight - minHeight + 1;
...
int y = minHeight + rand.nextInt(heightDiff);
```
And is then combined, with other values to make a BlockPos to be replaced with ore:
```Java
BlockPos pos = new BlockPos(x, y, z);
```
#### Max Y
Max Y is the highest Y level (or height) that the block will appear on.
###### Overworld:
By default levels 0 through 256 are valid. Servers can set the world height to a higher value, and thus can increase this 256, but not sure if it's possible in singleplayer.
###### Nether:
Levels 0 through 128 are valid for ore. Unsure if this height can be changed, even on servers. (Though mushrooms can be generated above bedrock, no netherrack is generated above it, so ores will not appear)
###### End:
Generally levels 10 through 60 are usable, though I'm not sure if these are *actual* min and max values. Keep in mind, The End has no bedrock floor, so if you mine too low on a particular island, you fall into the void.

Max Y is used in code, in:
>[com.gmail.rohzek.world.SGWorldGen](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGen.java)

where it's passed into the runGenerator function:
```Java
runGenerator (... int minHeight, int maxHeight)
```
and is used to determine the random Y level:
```Java
int heightDiff = maxHeight - minHeight + 1;
...
int y = minHeight + rand.nextInt(heightDiff);
```
And is then combined, with other values to make a BlockPos to be replaced with ore:
#### Vein Minimum
Vein Minimum is the minimum number of veins that can be spawned in a chunk.
- To remove the variance in number of veins, set this to the number of veins you want to appear, and Vein Maximum to 0.

Is used in code in:
>[com.gmail.rohzek.world.SGWorldGen](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGen.java)

Where it's used with a random number generator, to generate a unique number of veins per chunk:
```Java
// Randomly choose how many veins can be in a chunk
int veinCount(int min, int max)
{
	// Since min is added at the end,
	max = max - min; // Subtract it from max here, so we can never have more than the max
	return min + (int) (Math.random() * max);
}
```
Where it's then passed to the runGenerator method, and used to spawn veins.
```Java
runGenerator (SGWorldGenMineable generator, World world, Random rand, int chunkX, int chunkZ, int veinsPerChunk, int minHeight, int maxHeight)
{
    ...
    for (int i = 0; i < veinsPerChunk; i++)
    {
        // Generate vein
    }
}
```
#### Vein Maximum
Vein Maximum is the maximum number of veins that can be spawned in a chunk.
- To remove the variance in number of veins, set this to 0, and Vein Minimum to the number of veins you want to spawn.

Is used in code in:
>[com.gmail.rohzek.world.SGWorldGen](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGen.java)

Where it's used with a random number generator, to generate a unique number of veins per chunk:
```Java
// Randomly choose how many veins can be in a chunk
int veinCount(int min, int max)
{
	// Since min is added at the end,
	max = max - min; // Subtract it from max here, so we can never have more than the max
	return min + (int) (Math.random() * max);
}
```
Where it's then passed to the runGenerator method, and used to spawn veins.
```Java
runGenerator (SGWorldGenMineable generator, World world, Random rand, int chunkX, int chunkZ, int veinsPerChunk, int minHeight, int maxHeight)
{
    ...
    for (int i = 0; i < veinsPerChunk; i++)
    {
        // Generate vein
    }
}
```
#### Count Minimum
The minimum number of ores to spawn in a single vein.
- To remove variance from the amount, set this to the number of ores you want per vein, and Count Maximum to 0.

Is used in code in:
>[com.gmail.rohzek.world.WorldGenerators](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/WorldGenerators.java)

where it's ran through a random number generator to determine the amount of ores to spawn per vein:
```Java
// Randomly choose how many blocks can be in a vein
int oreCount(int min, int max)
{
	// Since min is added at the end,
	max = max - min; // Subtract it from max here, so we can never have more than the max
	return min + (int) (Math.random() * max);
}
```
Which is then stored in the WorldGenMineable, to be used to determine the vein size:
```Java
boolean generate(World worldIn, Random rand, BlockPos position)
{
    ...
    double d0 = (double)((float)(position.getX() + 8) + MathHelper.sin(f) * (float)this.numberOfBlocks/8.0F);
    double d1 = (double)((float)(position.getX() + 8) - MathHelper.sin(f) * (float)this.numberOfBlocks/8.0F);
    double d2 = (double)((float)(position.getZ() + 8) + MathHelper.cos(f) * (float)this.numberOfBlocks/8.0F);
    double d3 = (double)((float)(position.getZ() + 8) - MathHelper.cos(f) * (float)this.numberOfBlocks/8.0F);
    ...
    for (int i = 0; i < this.numberOfBlocks; ++i)
    {
        // Spawn a block in this vein
    }
}
```
#### Count Maximum
The maximum number of ores to spawn in a single vein.
- To remove variance from the amount, set this to 0, and Count Minimum to the amount of ores you want in each vein.

Is used in code in:
>[com.gmail.rohzek.world.WorldGenerators](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/WorldGenerators.java)

where it's ran through a random number generator to determine the amount of ores to spawn per vein:
```Java
// Randomly choose how many blocks can be in a vein
int oreCount(int min, int max)
{
	// Since min is added at the end,
	max = max - min; // Subtract it from max here, so we can never have more than the max
	return min + (int) (Math.random() * max);
}
```
Which is then stored in the WorldGenMineable, to be used to determine the vein size:
```Java
boolean generate(World worldIn, Random rand, BlockPos position)
{
    ...
    double d0 = (double)((float)(position.getX() + 8) + MathHelper.sin(f) * (float)this.numberOfBlocks/8.0F);
    double d1 = (double)((float)(position.getX() + 8) - MathHelper.sin(f) * (float)this.numberOfBlocks/8.0F);
    double d2 = (double)((float)(position.getZ() + 8) + MathHelper.cos(f) * (float)this.numberOfBlocks/8.0F);
    double d3 = (double)((float)(position.getZ() + 8) - MathHelper.cos(f) * (float)this.numberOfBlocks/8.0F);
    ...
    for (int i = 0; i < this.numberOfBlocks; ++i)
    {
        // Spawn a block in this vein
    }
}
```
#### Disable Ore
Disable Ore is used to toggle whether or not all other checks should be ignored, and an ore not spawned.
Is used in code in:
>[com.gmail.rohzek.world.SGWorldGen](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGen.java)

where it checks to see if an ore should be disabled, before even running the spawn code:
```Java
if(!mineable.data.disableOre)
{
 // Then runGenerator()
}
```
#### Biome List
Biome List is a list (actually, an array) of biomes that a particular ore should be spawned in.
- If "easyEmeralds" is disabled in the configs, then this list of biomes is ignored for surface Emerald ore and only Extreme Hills biomes are checked for.
- Hell and Sky will be ignored if added to the wrong ore, as Hell is the nether and Sky is the end, and doesn't appear in other dimenions.

Is used in code in:
>[com.gmail.rohzek.world.SGWorldGen](https://github.com/Rohzek/SimpleOreGeneration/blob/master/main/java/com/gmail/rohzek/world/SGWorldGen.java)

where the name of the registered biomes is loaded, and when the ores are being iterated through, the list of biomes is iterated through, and the ore only spawned if the biome being checked is on the list.
```Java
String biomeName = world.getBiome(pos).getRegistryName().getResourcePath().toString();
...
for(String biom : generator.data.biomeList)
{
	if(biomeName.equals(biom))
	{
		generator.generate(world, rand, pos);
	}
}
```