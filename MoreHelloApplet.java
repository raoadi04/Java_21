1: import java.awt.Graphics;
2: import java.awt.Font;
3: import java.awt.Color;
4:
5: public class MoreHelloApplet extends java.applet.Applet {
6:
7: Font f = new Font(“TimesRoman”,Font.BOLD,36);
8: String name;
9:
10: public void init() {
11: this.name = getParameter(“name”);
12: if (this.name == null)
13: this.name = “Laura”;
14:
15: this.name = “Hello “ + this.name + “!”;
16: }
17:
18: public void paint(Graphics g) {
19: g.setFont(f);
20: g.setColor(Color.red);
21: g.drawString(this.name, 5, 50);
22: }
23: }
