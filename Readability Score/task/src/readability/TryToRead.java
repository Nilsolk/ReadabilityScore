package readability;


import java.util.Scanner;

public class TryToRead {

    public void reading(String line) {
        System.out.println(line);
        ListArr arrayList = new ListArr();
        System.out.println("Words: " + arrayList.words(arrayList.sentences(line)));
        System.out.println("Sentences: " + arrayList.sentences(line).length);
        String len = line.replaceAll(" ", "");
        System.out.println("Characters: " + len.length());
        //System.out.println("The score is: " + arrayList.score(len.length(), arrayList.words(arrayList.sentences(line)), arrayList.sentences(line).length));
        //System.out.println("This text should be understood by " + arrayList.switchAge(arrayList.score(len.length(), arrayList.words(arrayList.sentences(line)), arrayList.sentences(line).length)) + "-year-olds.");
        System.out.println("Syllables: " + arrayList.getNumSyllables(line)[0]);
        System.out.println("Polysyllables: " + arrayList.getNumSyllables(line)[1]);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
        String chose = sc.nextLine();
        switch (chose) {
            case "ARI":
                ARI ari = new ARI(len.length());
                System.out.println("Automated Readability Index:" +
                        ari.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(ari.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                break;
            case "FK":
                FleshKincaid fleshKincaid = new FleshKincaid(arrayList.getNumSyllables(line)[0]);
                System.out.println("Flesch–Kincaid readability tests:" +
                        fleshKincaid.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(fleshKincaid.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                break;
            case "SMOG":
                SMOG smog = new SMOG(arrayList.getNumSyllables(line)[1]);
                System.out.println("Simple Measure of Gobbledygook:" +
                        smog.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(smog.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                break;
            case "CL":
                CL cl = new CL(len.length());
                System.out.println("Coleman–Liau index:" +
                        cl.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(cl.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                break;
            case "all":
                ARI ari1 = new ARI(len.length());
                System.out.println("Automated Readability Index:" +
                        ari1.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(ari1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                FleshKincaid fleshKincaid1 = new FleshKincaid(arrayList.getNumSyllables(line)[0]);
                System.out.println("Flesch–Kincaid readability tests:" +
                        fleshKincaid1.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(fleshKincaid1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                SMOG smog1 = new SMOG(arrayList.getNumSyllables(line)[1]);
                System.out.println("Simple Measure of Gobbledygook:" +
                        smog1.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(smog1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                CL cl1 = new CL(len.length());
                System.out.println("Coleman–Liau index:" +
                        cl1.score(arrayList.words(arrayList.sentences(line)),
                                arrayList.sentences(line).length)
                        + " (about " + arrayList.switchAge(cl1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length))
                        + "-year-olds).");
                System.out.println(" ");
                double zxc = cl1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length) + ari1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length) + fleshKincaid1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length) + smog1.score(arrayList.words(arrayList.sentences(line)),
                        arrayList.sentences(line).length);
                System.out.println("This text should be understood in average by "+arrayList.switchAge(zxc/4)+"-year-olds.");
                break;
            default:
                System.out.println("Error");


        }

    }
}



