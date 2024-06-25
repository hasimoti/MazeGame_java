
public class mazeframe extends MyFrame
{
	public void run() 
	{
		int[][] block;
		block=new int [5][];
		block[0]=new int[5];
		block[1]=new int[5];
		block[2]=new int[5];
		block[3]=new int[5];
		block[4]=new int[5];
		
		
		for(int i=0;i<block.length;i++)
		{
			for(int j=0;j<block.length;j++)
			{
				if(i==0||i==4)
				{
					block[i][j]=1;
				}
				else if(i>=1&&i<=3) 
				{
					block[i][0]=1;
					block[i][4]=1;
				}
				else 
				{
					block[i][j]=0;
				}
				
			}
			
		}
		
		for(int k=0;k<block.length;k++)
		{
			for(int h=0;h<block.length;h++)
			{
				System.out.print(block[k][h]);
			}
			System.out.println();
		}
		draw(this);
	}
	
	public void draw(MyFrame f) 
	{
		/*for(int i=0;i<5;i++)
		{
			System.out.println(block[][]);
		}
		*/
		//f.setColor(0,0,0);
		//fillRect();
	}
}
