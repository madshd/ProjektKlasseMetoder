package Ex2Anders;

public class MultipleChoiceTest {

    private static char[] korrekteSvar;

    public MultipleChoiceTest() {
        this.korrekteSvar = new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
    }

    public static char[] getKorrekteSvar() {
        return korrekteSvar;
    }

    public static char[] MultipleChoiceTest(Student student) {

        char[] svarMC = student.getSvarMC();

        for (int i = 0; i < 10; i++) {

            int rand = (int) (Math.random() * 4) + 1;

            switch (rand) {
                case 1 -> {
                    svarMC = student.getSvarMC();
                    svarMC[i] = 'A';
                    student.setSvarMC(svarMC);
                }
                case 2 -> {
                    svarMC = student.getSvarMC();
                    svarMC[i] = 'B';
                    student.setSvarMC(svarMC);
                }

                case 3 -> {
                    svarMC = student.getSvarMC();
                    svarMC[i] = 'C';
                    student.setSvarMC(svarMC);
                }
                case 4 -> {
                    svarMC = student.getSvarMC();
                    svarMC[i] = 'D';
                    student.setSvarMC(svarMC);
                }
            }
        }
            return student.getSvarMC();
    }
}

