


	import java.util.Scanner;

	public class MathSequence {

		public static void main(String[] args) {
			Scanner Jeffy = new Scanner(System.in);

			// variables//
			boolean no = false;
			String ans;
			int whatKind;

			while (no == false) {

				System.out.println("What kind of process would you like to perform: ");
				System.out.println("1: Generate an arithmetic sequence. ");
				System.out.println("2: Generate a geometric sequence. ");
				System.out.println("3: Determine an arithmetic sequence. ");

				whatKind = Jeffy.nextInt();
				Jeffy.nextLine();

				if (whatKind != 1 && whatKind != 2 && whatKind != 3) {

					System.out.println("Error: task number must be 1, 2, or 3.");

				}

				if (whatKind == 1) {

					System.out.println("Enter the first term in the arithmetic sequence:");
					int first = Jeffy.nextInt();
					Jeffy.nextLine();
					System.out.println("Enter the common difference in the arithmetic sequence:");
					int common = Jeffy.nextInt();
					Jeffy.nextLine();
					System.out.println("Enter the number of terms in the arithmetic sequence:");
					int terms = Jeffy.nextInt();
					Jeffy.nextLine();

					int[] ia = new int[terms];

					int stop = common * (terms - 1);
					int j = 0;
					for (int i = first; i <= first + stop; i += common) {

						ia[j] = i;

						j++;
					}
					int sum = 0;
					System.out.print("<");
					for (int a = 0; a < terms; a++) {

						System.out.print(ia[a] + ",");

						sum += ia[a];

					}
					System.out.println(">");
					System.out.println("Sum of the arithmetic sequence: " + sum);
					System.out.println("Would you like to process another sequence? (Y/N)");
					ans = Jeffy.nextLine();
					if (ans.equals("N")) {

						no = true;
					}

				}

				if (whatKind == 2) {

					System.out.println("Enter the first term in the geometric sequence:");
					int first = Jeffy.nextInt();
					Jeffy.nextLine();
					System.out.println("Enter the common ratio in the geometric sequence:");
					int common = Jeffy.nextInt();
					Jeffy.nextLine();
					System.out.println("Enter the number of terms in the geometric sequence:");
					int terms = Jeffy.nextInt();
					Jeffy.nextLine();

					int[] ia = new int[terms];

					ia[0] = first;

					int sum = 0;
					System.out.print("<");
					System.out.print(first + ",");
					for (int a = 1; a < ia.length; a++) {
						ia[a] = ia[a - 1] * (common);

						System.out.print(ia[a] + ",");

						sum += ia[a];

					}
					int total = sum + first;
					System.out.println(">");
					System.out.println("Sum of the geometric sequence: " + total);
					System.out.println("Would you like to process another sequence? (Y/N)");
					ans = Jeffy.nextLine();
					if (ans.equals("N")) {

						no = true;
					}

				}

				if (whatKind == 3) {
					boolean arithmetic =true;
					int length = 0;
					int[] ia = new int[10];
					int counter = 0, max = 10, first;
					boolean escape = false;
					while (counter <= 10 && escape == false) {

						String ans2;
						System.out.println("enter a new number: ");
						first = Jeffy.nextInt();
						Jeffy.nextLine();

						System.out.println("You have entered " + (counter + 1) + " numbers ");
						System.out.println("you may still enter " + (max - 1) + " numbers ");
						System.out.println("would you like to enter another number? (Y/N)");
						counter += 1;
						max -= 1;
						ans2 = Jeffy.nextLine();
						ia[counter - 1] = first;
						length = counter - 1;

						// if(whatKind==3) {
						// int diff = ia[0]-ia[1];
						// for(int i=0;i<length;i++) {
						// if(ia[i]==ia[i+1]-diff) {
						// arithmetic = true;
						// }

						// }

						// }

						if (ans2.equals("N") && counter == 1) {
							System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
							System.out.println("Would you like to process another sequence? (Y/N)");
							ans2 = Jeffy.nextLine();
						}

						else if (counter == 10) {

							int diff = ia[1] - ia[0];
							for (int i = 0; i < length; i++) {
								//System.out.printf("%d %d 232\n",ia[i], ia[i + 1] - diff);
								if (ia[i] == ia[i + 1] - diff) {
									//System.out.println("hellooooo1o");
									//System.out.printf("%d %d 232\n",ia[i], ia[i + 1] - diff);
									arithmetic &= true;
								} else {
									arithmetic = false;
								}

							}

							System.out.println("You have entered the maximum number of numbers!");
							System.out.println("We will start processing your sequence right away.");

							int sum = 0;

							System.out.print("<");
							for (int a = 0; a < counter; a++) {

								System.out.print(ia[a] + ", ");

								sum += ia[a];

							}

							int total = sum + first;
							System.out.println(">");

							if (arithmetic == true) {
								System.out.println("is an arithmetic sequence with first term " + ia[0]);
								System.out.println("Sum of the arithmetic sequence: " + total);
								System.out.println("Would you like to process another sequence? (Y/N)");
								ans = Jeffy.nextLine();
								if (ans.equals("N")) {

									escape = true;
									no = true;
								}
								else {
									escape = true;
								}

							}

							else if (arithmetic == false) {

								System.out.println("is NOT arithmetic sequence with first term " + ia[0]);
								System.out.println("Sum of the arithmetic sequence: " + total);
								System.out.println("Would you like to process another sequence? (Y/N)");
								ans = Jeffy.nextLine();
								if (ans.equals("N")) {

									escape = true;
									no = true;
								} 
								else {
									escape = true;
								}

							}

						}

						else if (ans2.equals("N") && counter > 1) {
							int sum = 0;

							int diff = ia[1] - ia[0];
							System.out.println(arithmetic);
							for (int i = 0 ; i<counter-1; i++) {
								if (ia[i] == ia[i + 1] - diff) {
									//System.out.printf("%d %d\n",ia[i], ia[i + 1] - diff);
									System.out.println(i);
									System.out.println(counter);
									arithmetic &= true;
								} else {
									arithmetic = false;
								}

							}

							System.out.print("<");

							for (int i = 0; i < counter; i++) {

								System.out.print(ia[i] + ",");

								sum += ia[i];

							}
							int total = sum;
							System.out.println(">");
							if (arithmetic == true) {
								System.out.println("is an arithmetic sequence with first term " + ia[0]);
								System.out.println("Sum of the arithmetic sequence: " + total);
								System.out.println("Would you like to process another sequence? (Y/N)");
								ans = Jeffy.nextLine();
								if (ans.equals("N")) {

									escape = true;
									no = true;
								} 
								else {
									escape = true;
								}

							}

							else if (arithmetic == false) {
								System.out.println("is NOT an arithmetic sequence with first term " + ia[0]);
								System.out.println("Sum of the arithmetic sequence: " + total);
								System.out.println("Would you like to process another sequence? (Y/N)");
								ans = Jeffy.nextLine();
								if (ans.equals("N")) {

									escape = true;
									no = true;
								}
								else {
									escape =true;
								}

							}

						}

					}

				}

			}

			System.out.println("Bye! ");

		}
	}
	
	
	
	

