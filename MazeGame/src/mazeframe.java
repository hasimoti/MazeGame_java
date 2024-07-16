import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class mazeframe extends MyFrame implements KeyListener
{   
	Random rand =new Random();
	int n;
	boolean aaa=true;
	public void run() 
	{
		runw();
		addKeyListener(this);
	}
	
	
		public void keyTyped(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override
		
		public void keyPressed(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("e");
			if(e.getKeyCode()==KeyEvent.VK_SPACE) 
			{
				System.out.println("もう一回");
				runw();
				aaa=false;
			}
		}
	
		@Override
		public void keyReleased(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
			
		}
	
	int[][] block;
	public void runw() 
	{
		clear();
		block=new int [25][];
		for(int k=0;k<25;k++)
		{
			block[k]=new int[25];
		}
		
		for(int i=0;i<block.length;i++)
		{
			for(int j=0;j<block.length;j++)
			{
				if(i==0||i==24)
				{
					block[i][j]=1;
				}
				else if(i>=1&&i<=23) 
				{
					block[i][0]=1;
					block[i][24]=1;
				}
				else 
				{
					block[i][j]=0;
				}
				if(block[i][j]==1)
				{
					
					setColor(0,0,0);
					fillRect(50+i*10,50+j*10,10,10);
					sleep(0);
				}
				
				
			}
			
		}
		
		for(int l=2;l<24;l+=2)
		{
			for(int m=2;m<24;m+=2) 
			{
				block[l][m]=1;
				
				if(block[l][m]==1)
				{
					setColor(0,0,0);
					fillRect(l*10+50,m*10+50,10,10);
					sleep(0);
				}
			}
		}
		for(int l=2;l<24;l+=2)
		{
			for(int m=2;m<24;m+=2) 
			{
				swi(l,m);
				
			}
		}
		boolean a=false,b=false;
		while(b==false) 
		{
			int x,y,j=0,k;
			x=rand.nextInt(25);
			y=rand.nextInt(25);
			if(x%2==1&&y%2==1&&block[x][y]!=1&&a==false&&x!=0&&y!=0) 
			{
				j=x;
				k=y;
				
				setColor(0,0,255);
				fillRect(50+j*10,50+k*10,10,10);
				sleep(0);
				a=true;
			}
			int t;
			t=j-x;
			
			if(t<=0) 
			{
				t=t*-1;
			}
			
			if(a==true&&t>=15&&block[x][y]!=1&&x!=0&&y!=0)
			{
				System.out.println("dd");
				setColor(255,29,0);
				fillRect(50+x*10,50+y*10,10,10);
				sleep(0);
				b=true;
				
			}
		}
		
	}
	
	public void swi(int i,int j)
	{
		
		boolean set=false;
		
		while(set==false) 
		{
			if(i==2) {n =rand.nextInt(4);}
			else     {n =rand.nextInt(3);}
			
			System.out.println(n);
			switch(n) 
			{
				case 0:
				j++;//下に伸ばす
				break;
				
				case 1://右に伸ばす
				i++;
				break;
				
				case 2://上に伸ばす
				j--;
				break;
				
				case 3://左に伸ばす
				i--;
				break;
			}
		
			if(block[i][j]==0) 
			{
				block[i][j]=1;
				if(block[i][j]==1)
				{
					
					setColor(0,0,0);
					fillRect(i*10+50,j*10+50,10,10);
					sleep(0.);
				}
				set=true;
			}
			
				switch(n) 
				{
					case 0:
					j++;
					break;
					
					case 1:
					i++;
					break;
					
					case 2:
					j--;
					break;
					
					case 3:
					i--;
					break;
				
			     }
				
		}
		
	}

	
	
	
}
