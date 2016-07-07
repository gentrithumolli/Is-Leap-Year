import javax.swing.JOptionPane;

public class switchIsLeapYear
{

	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("Shkruani vitin per te shikuar se a eshte vit i brishte: ");
		int viti = new Integer(s).intValue();

		switch(viti%4)
		{
		case 0 : if(viti%100==0 && viti%400!=0){
			JOptionPane.showMessageDialog(null, "Viti "+viti+" nuk eshte vit i brishte.");
			break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Viti "+viti+" eshte vit i brishte.");
				break;
			} 



		default : JOptionPane.showMessageDialog(null, "Viti "+viti+" nuk eshte vit i brishte.");
		}
	}
}

