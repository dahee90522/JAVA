
//카드 맞추기 4*4
import java.util.*;
import java.util.Random;

class test {
	public void cls() {
		for (int i = 0; i < 80; i++)
			System.out.println("");// cls
	}
	public void explain() {
		System.out.println("~~짝 맞추기 게임~~");
			System.out.println("안녕하십니까~~");
			System.out.println("간단한 룰 설명입니다~~");
			System.out.println("숫자 두개를 (숫자 space bar 숫자) 또는 (숫자 Enter 숫자)로 입력해 주세요~~");
			System.out.println("기회는 20번 입니다~~");
			System.out.println("게임이 끝난 후 다시 시작하고 싶다면 0이 아닌 다른 숫자를 눌러주세요");
			System.out.println("1. 과일 \t2. 동물\t3. 사용자 입력단어 \n세가지 중 골라주세여(숫자 입력) >>  ");
	}
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Random rand1 = new Random();
		test t = new test();
		String finish = "1";
		while (!finish.equals("0")) {
			t.explain();
			int choose = sc.nextInt();
			System.out.println("\n---------------------------------------------------------------------------\n");
			if (choose == 1) {
				t.cls();
				float checkit = 0;
				int fruita[] = new int[16];
				for (int i = 0; i < 16; i++) {
					fruita[i] = rand1.nextInt(16) + 1;
					for (int q = 0; q < i; q++) {
						if (fruita[i] == fruita[q]) {
							i--;
						}
					}
				}
				int fruitcheck[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				String fruit[] = { "사과", "배", "귤", "오렌지", "수박", "바나나", "토마토", "파인애플", "사과", "배", "귤", "오렌지", "수박",
						"바나나", "토마토", "파인애플" };// 과일
				String fruit1[] = new String[16];// 랜덤과일
				for (int z = 0; z < 16; z++) {
					fruit1[fruita[z] - 1] = fruit[z];
				}
				int fruitcnt[] = new int[16];
				for (int i = 0; i < 16; i++) {
					fruitcnt[i] = i + 1;
				}
				int cnt = 1;
				for (int a = 0; a < 4; a++) {
					for (int b = 0; b < 4; b++) {
						System.out.print(fruitcnt[cnt - 1] + "\t");
						cnt++;
					}
					System.out.println("\n");
				} // 판 만들기
				System.out.println("-------------------------------------------------\n");

				int qwer = 20;
				while (qwer > 0) {
					String check[] = new String[16];
					System.out.println("현재 점수 : " + checkit + " 점 남은 기회 : " + qwer + " 번");
					System.out.print("숫자 2개 선택하기 : ");
					int g1 = sc.nextInt();
					int g2 = sc.nextInt();

					t.cls();
					int check1 = 0;
					int checkplace[] = new int[2];
					cnt = 0;
					for (int a = 0; a < 4; a++) {
						for (int b = 0; b < 4; b++) {
							if (fruitcnt[cnt] == g1 || fruitcnt[cnt] == g2) {
								if (fruitcheck[cnt] != 0) {
									System.out.print("*" + fruit1[cnt] + "*\t");
								} else {
									System.out.print(fruit1[cnt] + "\t");
								}
								check[check1] = fruit1[cnt];
								checkplace[check1] = cnt;
								check1++;

							} else if (fruitcheck[cnt] != 0) {
								System.out.print(fruit1[cnt] + "*\t");
							} else {
								System.out.print(fruitcnt[cnt] + "\t");
							}

							cnt++;
						}

						System.out.println("\n");
					}
					if (check[0].equals(check[1])) {
						fruitcheck[checkplace[0]] = 1;
						fruitcheck[checkplace[1]] = 1;
						checkit += 12.5;
						if (checkit == 100) {
							break;
						}
					}
					qwer--;
				} // while
				System.out.println("축하합니다///\n최종 점수 : " + checkit + " 점 입니다!! \n아무키나 + Enter를 눌러주세요");
				// System.out.println("끝내시려면 0+Enter을 눌러주세요");
				finish = sc.next();
				// } // 반복 while
			}
//=====================================================================================================
			else if (choose == 2) {
				for (int i = 0; i < 80; i++)
					System.out.println("");// cls
				float checkitn = 0;
				int animala[] = new int[16];// fruit table
				for (int i = 0; i < 16; i++) {
					animala[i] = rand1.nextInt(16) + 1;
					for (int q = 0; q < i; q++) {
						if (animala[i] == animala[q]) {
							i--;
						}
					}
				}
				int animalcheck[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				String animal[] = { "기린", "호랑이", "사자", "토끼", "말", "강아지", "고양이", "돼지", "기린", "호랑이", "사자", "토끼", "말",
						"강아지", "고양이", "돼지" };// 동물
				String animal1[] = new String[16];// 랜덤동물
				for (int z = 0; z < 16; z++) {
					animal1[animala[z] - 1] = animal[z];
				}
				int animalcnt[] = new int[16];
				for (int i = 0; i < 16; i++) {
					animalcnt[i] = i + 1;
				}
				int cnta = 1;
				for (int a = 0; a < 4; a++) {
					for (int b = 0; b < 4; b++) {
						System.out.print(animalcnt[cnta - 1] + "\t");
						cnta++;
					}
					System.out.println("\n");
				} // 판 만들기
				System.out.println("-------------------------------------------------\n");
				int qwer0 = 20;
				while (qwer0 > 0) {
					String check0[] = new String[16];
					System.out.println("현재 점수 : " + checkitn + " 점 남은 기회 : " + qwer0 + " 번");
					System.out.print("숫자 2개 선택하기 : ");
					int g11 = sc.nextInt();
					int g22 = sc.nextInt();

					t.cls();
					int check1 = 0;
					int checkplace1[] = new int[2];
					cnta = 0;
					for (int a = 0; a < 4; a++) {
						for (int b = 0; b < 4; b++) {
							if (animalcnt[cnta] == g11 || animalcnt[cnta] == g22) {
								if (animalcheck[cnta] != 0) {
									System.out.print("*" + animal1[cnta] + "*\t");
								} // if
								else {
									System.out.print(animal1[cnta] + "\t");
								} // else
									// check[check1] = cnt-1;
								check0[check1] = animal1[cnta];
								checkplace1[check1] = cnta;
								check1++;

							} //
							else if (animalcheck[cnta] != 0) {
								System.out.print(animal1[cnta] + "*\t");
							} // else if
							else {
								System.out.print(animalcnt[cnta] + "\t");
							} // else

							cnta++;
						} // for

						System.out.println("\n");
					} // for
					if (check0[0].equals(check0[1])) {
						animalcheck[checkplace1[0]] = 1;
						animalcheck[checkplace1[1]] = 1;
						checkitn += 12.5;
						if (checkitn == 100) {
							break;
						}
					} // if
					qwer0--;
				} // while
				System.out.println("-------------------------------------------------\n");
				System.out.println("축하합니다///\n최종 점수 : " + checkitn + " 점 입니다!! \n아무키나 + Enter를 눌러주세요");
				// System.out.println("끝내시려면 0+Enter을 눌러주세요");
				finish = sc.next();
			} // 반복 while
//=====================================================================================================
			else if (choose == 3) {
				t.cls();
				float checkituser = 0;
				int userlan[] = new int[16];
				for (int i = 0; i < 16; i++) {
					userlan[i] = rand1.nextInt(16) + 1;
					for (int q = 0; q < i; q++) {
						if (userlan[i] == userlan[q]) {
							i--;
						}
					}
				}
				int usercheck[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				// String fruit[] = { "사과", "배", "귤", "오렌지", "수박", "바나나", "토마토", "파인애플", "사과",
				// "배", "귤", "오렌지", "수박",
				// "바나나", "토마토", "파인애플" };// 과일
				String usercho;
				String user[] = new String[16];// 랜덤과일
				for (int z = 0; z < 16; z += 2) {
					System.out.print((z + 1) + "번째 들어갈 단어를 입력하시오 : ");
					usercho = sc.next();
					user[userlan[z] - 1] = usercho;
					System.out.print((z + 2) + "번째 들어갈 단어를 입력하시오 : ");
					usercho = sc.next();
					user[userlan[z]] = usercho;
				}
				int usercnt[] = new int[16];
				for (int i = 0; i < 16; i++) {
					usercnt[i] = i + 1;
				}
				int cntu = 1;
				for (int a = 0; a < 4; a++) {
					for (int b = 0; b < 4; b++) {
						System.out.print(usercnt[cntu - 1] + "\t");
						cntu++;
					}
					System.out.println("\n");
				} // 판 만들기
				System.out.println("-------------------------------------------------\n");

				int uqwer = 20;
				while (uqwer > 0) {
					String ucheck[] = new String[16];
					System.out.println("현재 점수 : " + checkituser + " 점 남은 기회 : " + uqwer + " 번");
					System.out.print("숫자 2개 선택하기 : ");
					int g1u = sc.nextInt();
					int g2u = sc.nextInt();

					t.cls();
					int checku = 0;
					int usercheckplace[] = new int[2];
					cntu = 0;
					for (int a = 0; a < 4; a++) {
						for (int b = 0; b < 4; b++) {
							if (usercnt[cntu] == g1u || usercnt[cntu] == g2u) {
								if (usercheck[cntu] != 0) {
									System.out.print("*" + user[cntu] + "*\t");
								} else {
									System.out.print(user[cntu] + "\t");
								}
								ucheck[checku] = user[cntu];
								usercheckplace[checku] = cntu;
								checku++;

							} else if (usercheck[cntu] != 0) {
								System.out.print(user[cntu] + "*\t");
							} else {
								System.out.print(usercnt[cntu] + "\t");
							}

							cntu++;
						}

						System.out.println("\n");
					}
					if (ucheck[0].equals(ucheck[1])) {
						usercheck[usercheckplace[0]] = 1;
						usercheck[usercheckplace[1]] = 1;
						checkituser += 12.5;
						if (checkituser == 100) {
							break;
						}
					}
					uqwer--;
				} // while
				System.out.println("축하합니다///\n최종 점수 : " + checkituser + " 점 입니다!! \n아무키나 + Enter를 눌러주세요");
				// System.out.println("끝내시려면 0+Enter을 눌러주세요");
				finish = sc.next();
			// } // 반복 while
			}
			t.cls();
		} // 동물과일 선택
	}
}
