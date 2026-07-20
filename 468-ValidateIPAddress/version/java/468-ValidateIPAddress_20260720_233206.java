// Last updated: 20/07/2026, 23:32:06
1class Solution {
2
3    public String validIPAddress(String queryIP) {
4
5        if (queryIP.indexOf('.') >= 0) {
6
7            return isIPv4(queryIP) ? "IPv4" : "Neither";
8
9        }
10
11        if (queryIP.indexOf(':') >= 0) {
12
13            return isIPv6(queryIP) ? "IPv6" : "Neither";
14
15        }
16
17        return "Neither";
18    }
19
20    private boolean isIPv4(String ip) {
21
22        String[] parts = ip.split("\\.", -1);
23
24        if (parts.length != 4)
25            return false;
26
27        for (String part : parts) {
28
29            if (part.length() == 0 || part.length() > 3)
30                return false;
31
32            if (part.length() > 1 && part.charAt(0) == '0')
33                return false;
34
35            for (char c : part.toCharArray()) {
36
37                if (!Character.isDigit(c))
38                    return false;
39            }
40
41            int value = Integer.parseInt(part);
42
43            if (value > 255)
44                return false;
45        }
46
47        return true;
48    }
49
50    private boolean isIPv6(String ip) {
51
52        String[] parts = ip.split(":", -1);
53
54        if (parts.length != 8)
55            return false;
56
57        for (String part : parts) {
58
59            if (part.length() == 0 || part.length() > 4)
60                return false;
61
62            for (char c : part.toCharArray()) {
63
64                if (!Character.isDigit(c)
65                        && !(c >= 'a' && c <= 'f')
66                        && !(c >= 'A' && c <= 'F'))
67                    return false;
68            }
69        }
70
71        return true;
72    }
73}