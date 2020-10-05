package Level2;

public class SkillTree {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = { "CXF", "ASF", "BDF", "CEFD" };
		int answer = 0;
		// 다른게뜰경우-2 아예안뜰경우-1 표시?

		char[] array = skill.toCharArray();
		int index = 0;
		int ary = 0;
		int save = 0;

		while (index < skill_trees.length) {
			save = -1;
			ary = 0;
			for (int i = 0; i < skill_trees[index].length(); i++) {
				for (int j = 0; j < array.length; j++) {
					if (skill_trees[index].charAt(i) == array[j]) {
						if (j == ary) {
							ary++;
							break;
						} else {
							save = -2;
						}
					}
				}
			}
			
			if(save != -2) {
				answer++;
			}
			index++;
		}

		System.out.println(answer);
	}
}
