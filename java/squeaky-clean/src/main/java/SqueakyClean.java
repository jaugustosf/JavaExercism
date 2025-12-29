class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            if (Character.isSpaceChar(ch)) {
                sb.append("_");
            } else if (ch == '-') {
                if (i + 1 < identifier.length()) {
                     char nextChar = identifier.charAt(i + 1);
                     if (Character.isLetter(nextChar)) {
                         sb.append(Character.toUpperCase(nextChar));
                         i++;
                     }
                }
            } else if (Character.isDigit(ch)) {
                switch (ch) {
                    case '4':
                        sb.append('a');
                        break;
                    case '3':
                        sb.append('e');
                        break;
                    case '0':
                        sb.append('o');
                        break;
                    case '1':
                        sb.append('l');
                        break;
                    case '7':
                        sb.append('t');
                        break;
                    default:
                        break;
                }
            } else if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
