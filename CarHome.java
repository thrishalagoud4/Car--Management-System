package com.miniproject_car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CarHome extends JFrame implements ActionListener {

    private JLabel totalCars;
    private JLabel totalBookings;
    private JLabel totalUsers;

    private JButton viewCars;
    private JButton addCar;
    private JButton bookings;
    private JButton refresh;
    private JButton logout;

    private static final Color BG =
            new Color(10, 13, 20);

    private static final Color CARD =
            new Color(22, 27, 38);

    private static final Color CARD2 =
            new Color(28, 34, 47);

    private static final Color GOLD =
            new Color(255, 193, 7);

    private static final Color TEXT =
            new Color(225, 229, 236);

    private static final Color MUTED =
            new Color(155, 164, 180);

    public CarHome() {

        setTitle("THRISHA CARZONE - Premium Dashboard");

        setSize(1100, 720);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(false);

        DashboardPanel main =
                new DashboardPanel();

        main.setLayout(null);

        setContentPane(main);

        // ================= HEADER =================

        JLabel logo =
                new JLabel("TC");

        logo.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        18));

        logo.setForeground(BG);

        logo.setBackground(GOLD);

        logo.setOpaque(true);

        logo.setHorizontalAlignment(
                SwingConstants.CENTER);

        logo.setBounds(
                35, 28, 52, 52);

        main.add(logo);

        JLabel title =
                new JLabel(
                        "THRISHA CARZONE");

        title.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        30));

        title.setForeground(GOLD);

        title.setBounds(
                105, 25, 400, 40);

        main.add(title);

        JLabel subtitle =
                new JLabel(
                        "CAR MANAGEMENT SYSTEM");

        subtitle.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        13));

        subtitle.setForeground(MUTED);

        subtitle.setBounds(
                107, 58, 400, 25);

        main.add(subtitle);

        JLabel status =
                new JLabel(
                        "● SYSTEM ONLINE");

        status.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        12));

        status.setForeground(
                new Color(
                        55, 210, 125));

        status.setBounds(
                850, 42, 180, 25);

        main.add(status);

        // ================= WELCOME =================

        JLabel welcome =
                new JLabel(
                        "Welcome to your premium car management dashboard");

        welcome.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        15));

        welcome.setForeground(TEXT);

        welcome.setBounds(
                35, 105, 600, 30);

        main.add(welcome);

        // ================= STAT CARDS =================

        JPanel carCard =
                createStatCard(
                        "TOTAL CARS",
                        "0",
                        "Available vehicles",
                        35);

        JPanel bookingCard =
                createStatCard(
                        "TOTAL BOOKINGS",
                        "0",
                        "Customer bookings",
                        355);

        JPanel userCard =
                createStatCard(
                        "TOTAL USERS",
                        "0",
                        "Registered users",
                        675);

        main.add(carCard);

        main.add(bookingCard);

        main.add(userCard);

        totalCars =
                (JLabel)
                        carCard.getClientProperty(
                                "value");

        totalBookings =
                (JLabel)
                        bookingCard.getClientProperty(
                                "value");

        totalUsers =
                (JLabel)
                        userCard.getClientProperty(
                                "value");

        // ================= SECTION =================

        JLabel section =
                new JLabel(
                        "QUICK ACTIONS");

        section.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        18));

        section.setForeground(
                Color.WHITE);

        section.setBounds(
                35, 235, 300, 30);

        main.add(section);

        JLabel sectionLine =
                new JLabel(
                        "Manage your showroom");

        sectionLine.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        12));

        sectionLine.setForeground(MUTED);

        sectionLine.setBounds(
                35, 260, 300, 25);

        main.add(sectionLine);

        // ================= VIEW CARS =================

        viewCars =
                premiumButton(
                        "VIEW & SEARCH CARS",
                        "Browse showroom inventory",
                        new Color(
                                35, 105, 190));

        viewCars.setBounds(
                35, 300, 325, 85);

        main.add(viewCars);

        // ================= ADD CAR =================

        addCar =
                premiumButton(
                        "ADD NEW CAR",
                        "Add vehicle to inventory",
                        new Color(
                                25, 145, 90));

        addCar.setBounds(
                385, 300, 325, 85);

        main.add(addCar);

        // ================= BOOKINGS =================

        bookings =
                premiumButton(
                        "VIEW BOOKINGS",
                        "Customer booking history",
                        new Color(
                                190, 135, 20));

        bookings.setBounds(
                735, 300, 325, 85);

        main.add(bookings);

        // ================= REFRESH =================

        refresh =
                premiumButton(
                        "REFRESH DASHBOARD",
                        "Update live statistics",
                        new Color(
                                85, 75, 145));

        refresh.setBounds(
                35, 405, 500, 80);

        main.add(refresh);

        // ================= LOGOUT =================

        logout =
                premiumButton(
                        "LOGOUT",
                        "Exit THRISHA CARZONE",
                        new Color(
                                150, 45, 60));

        logout.setBounds(
                560, 405, 500, 80);

        main.add(logout);

        // ================= BOTTOM INFO =================

        JPanel infoPanel =
                new JPanel(null);

        infoPanel.setBackground(
                new Color(
                        18, 22, 31));

        infoPanel.setBorder(
                BorderFactory.createLineBorder(
                        new Color(
                                50, 57, 72)));

        infoPanel.setBounds(
                35, 520, 1025, 80);

        main.add(infoPanel);

        JLabel infoTitle =
                new JLabel(
                        "THRISHA CARZONE");

        infoTitle.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        15));

        infoTitle.setForeground(GOLD);

        infoTitle.setBounds(
                20, 15, 220, 25);

        infoPanel.add(infoTitle);

        JLabel infoText =
                new JLabel(
                        "SMART  •  SIMPLE  •  PREMIUM");

        infoText.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        12));

        infoText.setForeground(MUTED);

        infoText.setBounds(
                20, 40, 300, 20);

        infoPanel.add(infoText);

        JLabel features =
                new JLabel(
                        "Inventory  |  Bookings  |  Customers  |  Management");

        features.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        12));

        features.setForeground(TEXT);

        features.setHorizontalAlignment(
                SwingConstants.RIGHT);

        features.setBounds(
                450, 25, 550, 30);

        infoPanel.add(features);

        // ================= FOOTER =================

        JLabel footer =
                new JLabel(
                        "© 2026 THRISHA CARZONE");

        footer.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        11));

        footer.setForeground(
                new Color(
                        100, 108, 123));

        footer.setHorizontalAlignment(
                SwingConstants.CENTER);

        footer.setBounds(
                350, 630, 400, 20);

        main.add(footer);

        // ================= EVENTS =================

        viewCars.addActionListener(this);

        addCar.addActionListener(this);

        bookings.addActionListener(this);

        refresh.addActionListener(this);

        logout.addActionListener(this);

        // ================= LOAD =================

        loadStats();

        setVisible(true);
    }

    // =====================================================
    // STAT CARD
    // =====================================================

    private JPanel createStatCard(
            String title,
            String value,
            String description,
            int x) {

        JPanel card =
                new JPanel(null);

        card.setBackground(CARD);

        card.setBorder(
                BorderFactory.createLineBorder(
                        new Color(
                                52, 60, 76),
                        1));

        card.setBounds(
                x, 145, 290, 70);

        JLabel titleLabel =
                new JLabel(title);

        titleLabel.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        11));

        titleLabel.setForeground(MUTED);

        titleLabel.setBounds(
                18, 10, 180, 20);

        card.add(titleLabel);

        JLabel valueLabel =
                new JLabel(value);

        valueLabel.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        25));

        valueLabel.setForeground(GOLD);

        valueLabel.setBounds(
                18, 28, 120, 32);

        card.add(valueLabel);

        JLabel desc =
                new JLabel(description);

        desc.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        10));

        desc.setForeground(
                new Color(
                        125, 134, 151));

        desc.setHorizontalAlignment(
                SwingConstants.RIGHT);

        desc.setBounds(
                130, 34, 140, 25);

        card.add(desc);

        card.putClientProperty(
                "value",
                valueLabel);

        return card;
    }

    // =====================================================
    // PREMIUM BUTTON
    // =====================================================

    private JButton premiumButton(
            String title,
            String description,
            Color color) {

        JButton button =
                new JButton();

        button.setLayout(null);

        button.setBackground(color);

        button.setForeground(Color.WHITE);

        button.setFocusPainted(false);

        button.setBorderPainted(false);

        button.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR));

        JLabel titleLabel =
                new JLabel(title);

        titleLabel.setFont(
                new Font(
                        "SansSerif",
                        Font.BOLD,
                        15));

        titleLabel.setForeground(
                Color.WHITE);

        titleLabel.setBounds(
                20, 15, 285, 25);

        button.add(titleLabel);

        JLabel descLabel =
                new JLabel(description);

        descLabel.setFont(
                new Font(
                        "SansSerif",
                        Font.PLAIN,
                        11));

        descLabel.setForeground(
                new Color(
                        225, 230, 238));

        descLabel.setBounds(
                20, 43, 285, 20);

        button.add(descLabel);

        button.addMouseListener(
                new MouseAdapter() {

                    @Override
                    public void mouseEntered(
                            MouseEvent e) {

                        button.setBackground(
                                color.brighter());
                    }

                    @Override
                    public void mouseExited(
                            MouseEvent e) {

                        button.setBackground(
                                color);
                    }
                });

        return button;
    }

    // =====================================================
    // DATABASE CONNECTION
    // =====================================================

    private Connection getConnection()
            throws Exception {

        Class.forName(
                "com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/car_project",
                "root",
                "thrisha");
    }

    // =====================================================
    // LOAD DASHBOARD STATISTICS
    // =====================================================

    private void loadStats() {

        try {

            try (
                    Connection con =
                            getConnection()
            ) {

                totalCars.setText(
                        count(
                                con,
                                "SELECT COUNT(*) FROM cars"));

                totalBookings.setText(
                        count(
                                con,
                                "SELECT COUNT(*) FROM bookings"));

                totalUsers.setText(
                        count(
                                con,
                                "SELECT COUNT(*) FROM users"));
            }

        } catch (Exception e) {

            totalCars.setText("?");

            totalBookings.setText("?");

            totalUsers.setText("?");

            JOptionPane.showMessageDialog(
                    this,
                    "Unable to load dashboard statistics.\n\n"
                            + e.getMessage(),
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // =====================================================
    // COUNT
    // =====================================================

    private String count(
            Connection con,
            String sql)
            throws SQLException {

        try (
                PreparedStatement pst =
                        con.prepareStatement(sql);

                ResultSet rs =
                        pst.executeQuery()
        ) {

            if (rs.next()) {

                return String.valueOf(
                        rs.getInt(1));
            }
        }

        return "0";
    }

    // =====================================================
    // BUTTON ACTIONS
    // =====================================================

    @Override
    public void actionPerformed(
            ActionEvent e) {

        if (e.getSource() ==
                viewCars) {

            new CarDetails();

            dispose();
        }

        else if (e.getSource() ==
                addCar) {

            new Addcar();

            dispose();
        }

        else if (e.getSource() ==
                bookings) {

            new BookingDetails();

            dispose();
        }

        else if (e.getSource() ==
                refresh) {

            loadStats();

            JOptionPane.showMessageDialog(
                    this,
                    "Dashboard updated successfully!",
                    "THRISHA CARZONE",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if (e.getSource() ==
                logout) {

            int choice =
                    JOptionPane.showConfirmDialog(
                            this,
                            "Are you sure you want to logout?",
                            "Logout",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);

            if (choice ==
                    JOptionPane.YES_OPTION) {

                new Login();

                dispose();
            }
        }
    }

    // =====================================================
    // PREMIUM DASHBOARD BACKGROUND
    // =====================================================

    static class DashboardPanel
            extends JPanel {

        @Override
        protected void paintComponent(
                Graphics g) {

            super.paintComponent(g);

            Graphics2D g2 =
                    (Graphics2D)
                            g.create();

            // MAIN BACKGROUND

            g2.setColor(BG);

            g2.fillRect(
                    0,
                    0,
                    getWidth(),
                    getHeight());

            // TOP GLOW

            g2.setColor(
                    new Color(
                            255,
                            193,
                            7,
                            20));

            g2.fillOval(
                    720,
                    -250,
                    500,
                    500);

            // GOLD TOP LINE

            g2.setColor(GOLD);

            g2.fillRect(
                    0,
                    0,
                    getWidth(),
                    3);

            // HEADER LINE

            g2.setColor(
                    new Color(
                            40, 46, 60));

            g2.fillRect(
                    35,
                    92,
                    1025,
                    1);

            g2.dispose();
        }
    }

    // =====================================================
    // MAIN
    // =====================================================

    public static void main(
            String[] args) {

        SwingUtilities.invokeLater(
                CarHome::new);
    }
}





