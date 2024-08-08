1: import java.awt.Graphics;
2: import java.awt.Font;
3: import java.util.Date;
4:
5: public class DigitalClock extends java.applet.Applet {
6:
7: Font theFont = new Font(“TimesRoman”,Font.BOLD,24);
8: Date theDate;
9:
10: public void start() {
11: while (true) {
12: theDate = new Date();
13: repaint();
14: try { Thread.sleep(1000); }
15: catch (InterruptedException e) { }
16: }
17: }
18:
19: public void paint(Graphics g) {
20: g.setFont(theFont);
21: g.drawString(theDate.toString(),10,50);
22: }
23: }
