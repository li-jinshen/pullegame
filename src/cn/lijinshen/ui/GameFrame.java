package cn.lijinshen.ui;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {

        initFrame();

        setMenuBar();

        this.setVisible(true);
    }
    // 设置菜单
    private void setMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");

        JMenuItem replayGame = new JMenuItem("重新游戏");
        JMenuItem replayLogin = new JMenuItem("重新登录");
        JMenuItem cloneGame = new JMenuItem("关闭游戏");

        JMenuItem wx = new JMenuItem("公众号");

        functionMenu.add(replayGame);
        functionMenu.add(replayLogin);
        functionMenu.add(cloneGame);

        aboutMenu.add(wx);

        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);

        this.setJMenuBar(menuBar);
    }
    // 窗口设置
    private void initFrame() {
        // 设置窗口大小
        this.setSize(600, 800);
        // 设置窗口位置
        this.setLocationRelativeTo(null);
        // 设置标题
        this.setTitle("单机版拼图游戏 V1.0");
        // 设置是否总是处于窗口顶部
        this.setAlwaysOnTop(true);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
