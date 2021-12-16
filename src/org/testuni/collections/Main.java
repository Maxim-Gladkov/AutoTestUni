package org.testuni.collections;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        User user1 = new User("Alex", 15);
        User user2 = new User("Peter", 21);
        User user3 = new User("Anna", 18);
        User user4 = new User("Roma", 26);
        User user5 = new User("Alex", 18);
        User user6 = new User("Rupert", 35);
        User user7 = new User("Anna", 12);

        List<User> list1 = new ArrayList<>();
        list1.add(new User("Alex", 15));
        list1.add(new User("Maksim", 21));
        list1.add(new User("Peter", 21));


        List<User> list2 = new ArrayList<>();
        list2.add(new User("Maksim", 21));
        list2.add(new User("Alex", 15));
        list2.add(new User("Anna", 18));
        list2.add(new User("Alex", 15));
        list2.add(new User("Rupert", 35));
        list2.add(new User("Peter", 21));

        Set<User> set1 = new HashSet<>();
        set1.add(new User("Alex", 15));
        set1.add(new User("Maksim", 21));
        set1.add(new User("Peter", 21));
        set1.add(new User("Peter", 21));

        Set<User> set2 = new HashSet<>();
        set2.add(new User("Maksim", 21));
        set2.add(new User("Alex", 15));
        set2.add(new User("Anna", 18));
        set2.add(new User("Rupert", 35));
        set2.add(new User("Peter", 21));
        set2.add(new User("Anna", 18));

        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1, user2);
        userMap.put(2, user4);
        userMap.put(3, user7);
        userMap.put(4, user5);
        userMap.put(5, user3);
        userMap.put(6, user2);

        comparedLists(list1, list2);
        System.out.println();
        showIndObjList(list2);
        System.out.println();
        comparedSets(set1, set2);
        System.out.println();
        showSetObj(set1);
        System.out.println();
        mapValueIteration(userMap);
        System.out.println();
        mapKeyIteration(userMap);
        System.out.println();
        mapEntryIteration(userMap);

    }


    public static List<User> comparedLists(List<User> list1, List<User> list2) {
        List<User> sameUsers = new ArrayList<>();

        for (User user : list1) {
            for (User user2 : list2) {
                if (user.equals(user2)) {
                    sameUsers.add(user);
                    System.out.println(user);
                }
            }
        }
        return sameUsers;

    }

    public static Set<User> comparedSets(Set<User> set1, Set<User> set2) {
        Set<User> sameUsers = new HashSet<>();

        for (User user : set1) {
            for (User user2 : set2) {
                if (user.equals(user2)) {
                    sameUsers.add(user);
                    System.out.println(user);
                }
            }
        }
        return sameUsers;

    }

    public static void showIndObjList (List<User> list) {
        int i = 0;
        Iterator<User> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println("Index: " + i++ + " " + iter.next());
        }

    }

    public static void showSetObj (Set<User> set) {
        Iterator<User> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void  mapValueIteration (Map<Integer, User> map) {
        Iterator iter = map.values().iterator();
        while (iter.hasNext()) {
            User user = (User) iter.next();
            System.out.println("value: " + user);
        }
    }

    public static void  mapKeyIteration (Map<Integer, User> map) {

        for (Integer key : map.keySet()) {
            System.out.println("key: " + key + " " + "value: " + map.get(key));
        }
    }

    public static void  mapEntryIteration (Map<Integer, User> map) {
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("key: " + entry.getKey() + " " + "value: " + entry.getValue());
        }
    }


}

