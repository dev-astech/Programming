package Strings;

public class ShortPath {

    public static float shortestDistance(String path, int initialX, int initialY) {
        int finalX = 0;
        int finalY = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'E') {
                finalX++;
            } else if (path.charAt(i) == 'N') {
                finalY++;
            } else if (path.charAt(i) == 'W') {
                finalX--;
            } else if (path.charAt(i) == 'S') {
                finalY--;
            }
        }
        return (float) Math.sqrt(((finalX - initialX) * (finalX - initialX)) + ((finalY - initialY) * (finalY - initialY)));
    }

    public static void main(String[] args) {
        String path = "WNEENESENN";
        System.out.println(shortestDistance(path, 0, 0));
    }
}
