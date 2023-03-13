package unit11.collections.day43.sortinglistComperable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        List<Member>memberList
                = new ArrayList<>(List.of(new Member("zJohn"),new Member("Kim"),new Member("Umut")));

        System.out.println("Memberlist in insertion order");
        System.out.println(memberList);
        System.out.println("Member list sorted by members name");
        memberList.sort(Comparator.naturalOrder());
        System.out.println(memberList );
    }
}
