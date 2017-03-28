
public class FileWriterClient {
	public static void main(String args[]) {
		FileWriterCareTaker caretaker = new FileWriterCareTaker();
		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter+"\n\n");

		caretaker.save(fileWriter);
		fileWriter.write("Second Set of Data");

		System.out.println(fileWriter+"\n\n");
		caretaker.undo(fileWriter);
		System.out.println(fileWriter+"\n\n");
	}
}
