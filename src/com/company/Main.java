package com.company;
import java.util.Scanner;
public class Main {



    public static double pickcard(){
        double x = (Math.random() * ((13 - 1)+1))+1;
        return x;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deal
        int card1 = (int) pickcard();
        int card2 = (int) pickcard();
        int card3 = (int) pickcard();
        int card4 = (int) pickcard();
        int card5 = (int) pickcard();
        int card6 = (int) pickcard();
        int card7 = (int) pickcard();
        int card8 = (int) pickcard();
        int card9 = (int) pickcard();
        int card10 = (int) pickcard();

        while (card1 == card2) {
            card2 = (int) pickcard();
        }
        while (card1 == card3 || card2 == card3) {
            card3 = (int) pickcard();
        }
        while (card1 == card4 || card2 == card4 || card3 == card4) {
            card4 = (int) pickcard();
        }
        while (card1 == card5 || card2 == card5 || card3 == card5 || card4 == card5) {
            card5 = (int) pickcard();
        }
        while (card1 == card6 || card2 == card6 || card3 == card6 || card4 == card6 || card5 == card6) {
            card6 = (int) pickcard();
        }
        while (card1 == card7 || card2 == card7 || card3 == card7 || card4 == card7 || card5 == card7 || card6 == card7) {
            card7 = (int) pickcard();
        }
        while (card1 == card8 || card2 == card8 || card3 == card8 || card4 == card8 || card5 == card8 || card6 == card8 || card7 == card8) {
            card8 = (int) pickcard();
        }
        while (card1 == card9 || card2 == card9 || card3 == card9 || card4 == card9 || card5 == card9 || card6 == card9 || card7 == card9 || card8 == card9) {
            card9 = (int) pickcard();
        }
        while (card1 == card10 || card2 == card10 || card3 == card10 || card4 == card10 || card5 == card10 || card6 == card10 || card7 == card10 || card8 == card10 || card9 == card10) {
            card10 = (int) pickcard();
        }


        int firstplay = 0;
        int totalpoints = 0;
        int player1points = 0;
        int player2points = 0;
        int uselessvariable = 1;

        int player1card = 0;
        int player2card = 0;

        while (totalpoints < 5) {

            //if player 2 won last round

            if (firstplay == 0) {
                //dont print cards already played

                //player1

                //round1

                if (totalpoints == 0) {
                    System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card7 + ", " + card9);
                }

                //round 2

                if (totalpoints == 1) {
                    if (card1 == 0) {
                        System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card7 + ", " + card9);
                    }
                    if (card3 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card5 + ", " + card7 + ", " + card9);
                    }
                    if (card5 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card7 + ", " + card9);
                    }
                    if (card7 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card9);
                    }
                    if (card9 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card7);
                    }
                }

                //round3

                if (totalpoints == 2) {
                    if (card1 == 0) {
                        if (card3 == 0) {
                            System.out.println("Player 1: " + card5 + ", " + card7 + ", " + card9);
                        }
                        if (card5 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card7 + ", " + card9);
                        }
                        if (card7 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card9);
                        }
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card7);
                        }
                    }

                    if (card3 == 0) {
                        if (card5 == 0) {
                            System.out.println("Player 1: " + card1 + ", " + card7 + ", " + card9);
                        }
                        if (card7 == 0) {
                            System.out.println("Player 1: " + card1 + ", " + card5 + ", " + card9);
                        }
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card1 + ", " + card5 + ", " + card7);
                        }
                    }

                    if (card5 == 0) {
                        if (card7 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card1 + ", " + card9);
                        }
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card1 + ", " + card7);
                        }
                    }

                    if (card7 == 0) {
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card1);
                        }
                    }
                }

                //round 4

                if (totalpoints == 3) {
                    if (card1 == 0) {
                        if (card3 == 0) {
                            if (card5 == 0) {
                                System.out.println("Player 1: " + card7 + ", " + card9);
                            }
                            if (card7 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card9);
                            }
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card7);
                            }
                        }
                        if (card5 == 0) {
                            if (card7 == 0) {
                                System.out.println("Player 1: " + card3 + ", " + card9);
                            }
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card3 + ", " + card7);
                            }
                        }
                        if (card7 == 0) {
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card3);
                            }
                        }
                    }

                    if (card3 == 0) {
                        if (card5 == 0) {
                            if (card7 == 0) {
                                System.out.println("Player 1: " + card1 + ", " + card9);
                            }
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card1 + ", " + card7);
                            }
                        }
                        if (card7 == 0) {
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card1);
                            }
                        }
                    }

                    if (card5 == 0) {
                        if (card7 == 0) {
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card1 + ", " + card3);
                            }
                        }
                    }
                }

                //round 5

                if (totalpoints == 4) {

                    if (card1 != 0) {
                        System.out.println("Player 1: " + card1);
                    }

                    if (card3 != 0) {
                        System.out.println("Player 1: " + card3);
                    }

                    if (card5 != 0) {
                        System.out.println("Player 1: " + card5);
                    }

                    if (card7 != 0) {
                        System.out.println("Player 1: " + card7);
                    }

                    if (card9 != 0) {
                        System.out.println("Player 1: " + card9);
                    }
                }

                //ask which card player 1 wants to play
                System.out.println("player 1 what card do you want to play: ");
                int cardPlayed = sc.nextInt();
                if (cardPlayed != card1 && cardPlayed != card3 && cardPlayed != card5 && cardPlayed != card7 && cardPlayed != card9) {
                    while (cardPlayed != card1 && cardPlayed != card3 && cardPlayed != card5 && cardPlayed != card7 && cardPlayed != card9) {
                        System.out.println("player 1 you do not have that card what card do you want to play: ");
                        cardPlayed = sc.nextInt();
                    }
                } else {
                    if (cardPlayed == card1) {
                        player1card = card1;
                        card1 = 0;
                    } else if (cardPlayed == card3) {
                        player1card = card3;
                        card3 = 0;
                    } else if (cardPlayed == card5) {
                        player1card = card5;
                        card5 = 0;
                    } else if (cardPlayed == card7) {
                        player1card = card7;
                        card7 = 0;
                    } else if (cardPlayed == card9) {
                        player1card = card9;
                        card9 = 0;
                    }
                }

                //dont show player1's cards cards

                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                System.out.println("player 2 are you ready? (type any number)");
                uselessvariable = sc.nextInt();

                System.out.println("player 1 played a " + player1card);
                System.out.println("");


                //player2


                //round1

                if (totalpoints == 0) {
                    System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card8 + ", " + card10);
                }

                //round 2

                if (totalpoints == 1) {
                    if (card2 == 0) {
                        System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card8 + ", " + card10);
                    }
                    if (card4 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card6 + ", " + card8 + ", " + card10);
                    }
                    if (card6 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card8 + ", " + card10);
                    }
                    if (card8 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card10);
                    }
                    if (card10 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card8);
                    }
                }

                //round3

                if (totalpoints == 2) {
                    if (card2 == 0) {
                        if (card4 == 0) {
                            System.out.println("Player 2: " + card6 + ", " + card8 + ", " + card10);
                        }
                        if (card6 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card8 + ", " + card10);
                        }
                        if (card8 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card10);
                        }
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card8);
                        }
                    }

                    if (card4 == 0) {
                        if (card6 == 0) {
                            System.out.println("Player 2: " + card2 + ", " + card8 + ", " + card10);
                        }
                        if (card8 == 0) {
                            System.out.println("Player 2: " + card2 + ", " + card6 + ", " + card10);
                        }
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card2 + ", " + card6 + ", " + card8);
                        }
                    }

                    if (card6 == 0) {
                        if (card8 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card2 + ", " + card10);
                        }
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card2 + ", " + card8);
                        }
                    }

                    if (card8 == 0) {
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card2);
                        }
                    }
                }

                //round 4

                if (totalpoints == 3) {
                    if (card2 == 0) {
                        if (card4 == 0) {
                            if (card6 == 0) {
                                System.out.println("Player 2: " + card8 + ", " + card10);
                            }
                            if (card8 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card10);
                            }
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card8);
                            }
                        }
                        if (card6 == 0) {
                            if (card8 == 0) {
                                System.out.println("Player 2: " + card4 + ", " + card10);
                            }
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card4 + ", " + card8);
                            }
                        }
                        if (card8 == 0) {
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card4);
                            }
                        }
                    }

                    if (card4 == 0) {
                        if (card6 == 0) {
                            if (card8 == 0) {
                                System.out.println("Player 2: " + card2 + ", " + card10);
                            }
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card2 + ", " + card8);
                            }
                        }
                        if (card8 == 0) {
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card2);
                            }
                        }
                    }

                    if (card6 == 0) {
                        if (card8 == 0) {
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card2 + ", " + card4);
                            }
                        }
                    }
                }

                //round 5

                if (totalpoints == 4) {
                    //declare last round
                    firstplay = 2;

                    if (card2 != 0) {
                        System.out.println("Player 2: " + card2);
                    }

                    if (card4 != 0) {
                        System.out.println("Player 2: " + card4);
                    }

                    if (card6 != 0) {
                        System.out.println("Player 2: " + card6);
                    }

                    if (card8 != 0) {
                        System.out.println("Player 2: " + card8);
                    }

                    if (card10 != 0) {
                        System.out.println("Player 2: " + card10);
                    }
                }

                //ask which card player 2 wants to play
                System.out.println("player 2 what card do you want to play: ");
                cardPlayed = sc.nextInt();
                if (cardPlayed != card2 && cardPlayed != card4 && cardPlayed != card6 && cardPlayed != card8 && cardPlayed != card10) {
                    while (cardPlayed != card2 && cardPlayed != card4 && cardPlayed != card6 && cardPlayed != card8 && cardPlayed != card10) {
                        System.out.println("player 2 you do not have that card what card do you want to play: ");
                        cardPlayed = sc.nextInt();
                    }
                } else {
                    if (cardPlayed == card2) {
                        player2card = card2;
                        card2 = 0;
                    } else if (cardPlayed == card4) {
                        player2card = card4;
                        card4 = 0;
                    } else if (cardPlayed == card6) {
                        player2card = card6;
                        card6 = 0;
                    } else if (cardPlayed == card8) {
                        player2card = card8;
                        card8 = 0;
                    } else if (cardPlayed == card10) {
                        player2card = card10;
                        card10 = 0;
                    }
                }
            }










            //if player 2 won last round

            else if (totalpoints == 1){
                //dont print cards already played

                //player2


                //round1

                if (totalpoints == 0) {
                    System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card8 + ", " + card10);
                }

                //round 2

                if (totalpoints == 1) {
                    if (card2 == 0) {
                        System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card8 + ", " + card10);
                    }
                    if (card4 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card6 + ", " + card8 + ", " + card10);
                    }
                    if (card6 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card8 + ", " + card10);
                    }
                    if (card8 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card10);
                    }
                    if (card10 == 0) {
                        System.out.println("Player 2: " + card2 + ", " + card4 + ", " + card6 + ", " + card8);
                    }
                }

                //round3

                if (totalpoints == 2) {
                    if (card2 == 0) {
                        if (card4 == 0) {
                            System.out.println("Player 2: " + card6 + ", " + card8 + ", " + card10);
                        }
                        if (card6 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card8 + ", " + card10);
                        }
                        if (card8 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card10);
                        }
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card8);
                        }
                    }

                    if (card4 == 0) {
                        if (card6 == 0) {
                            System.out.println("Player 2: " + card2 + ", " + card8 + ", " + card10);
                        }
                        if (card8 == 0) {
                            System.out.println("Player 2: " + card2 + ", " + card6 + ", " + card10);
                        }
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card2 + ", " + card6 + ", " + card8);
                        }
                    }

                    if (card6 == 0) {
                        if (card8 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card2 + ", " + card10);
                        }
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card2 + ", " + card8);
                        }
                    }

                    if (card8 == 0) {
                        if (card10 == 0) {
                            System.out.println("Player 2: " + card4 + ", " + card6 + ", " + card2);
                        }
                    }
                }

                //round 4

                if (totalpoints == 3) {
                    if (card2 == 0) {
                        if (card4 == 0) {
                            if (card6 == 0) {
                                System.out.println("Player 2: " + card8 + ", " + card10);
                            }
                            if (card8 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card10);
                            }
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card8);
                            }
                        }
                        if (card6 == 0) {
                            if (card8 == 0) {
                                System.out.println("Player 2: " + card4 + ", " + card10);
                            }
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card4 + ", " + card8);
                            }
                        }
                        if (card8 == 0) {
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card4);
                            }
                        }
                    }

                    if (card4 == 0) {
                        if (card6 == 0) {
                            if (card8 == 0) {
                                System.out.println("Player 2: " + card2 + ", " + card10);
                            }
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card2 + ", " + card8);
                            }
                        }
                        if (card8 == 0) {
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card6 + ", " + card2);
                            }
                        }
                    }

                    if (card6 == 0) {
                        if (card8 == 0) {
                            if (card10 == 0) {
                                System.out.println("Player 2: " + card2 + ", " + card4);
                            }
                        }
                    }
                }

                //round 5

                if (totalpoints == 4) {

                    if (card2 != 0) {
                        System.out.println("Player 2: " + card2);
                    }

                    if (card4 != 0) {
                        System.out.println("Player 2: " + card4);
                    }

                    if (card6 != 0) {
                        System.out.println("Player 2: " + card6);
                    }

                    if (card8 != 0) {
                        System.out.println("Player 2: " + card8);
                    }

                    if (card10 != 0) {
                        System.out.println("Player 2: " + card10);
                    }
                }

                //ask which card player 2 wants to play
                System.out.println("player 2 what card do you want to play: ");
                int cardPlayed = sc.nextInt();
                if (cardPlayed != card2 && cardPlayed != card4 && cardPlayed != card6 && cardPlayed != card8 && cardPlayed != card10) {
                    while (cardPlayed != card2 && cardPlayed != card4 && cardPlayed != card6 && cardPlayed != card8 && cardPlayed != card10) {
                        System.out.println("player 2 you do not have that card what card do you want to play: ");
                        cardPlayed = sc.nextInt();
                    }
                } else {
                    if (cardPlayed == card2) {
                        player2card = card2;
                        card2 = 0;
                    } else if (cardPlayed == card4) {
                        player2card = card4;
                        card4 = 0;
                    } else if (cardPlayed == card6) {
                        player2card = card6;
                        card6 = 0;
                    } else if (cardPlayed == card8) {
                        player2card = card8;
                        card8 = 0;
                    } else if (cardPlayed == card10) {
                        player2card = card10;
                        card10 = 0;
                    }
                }

                //dont show player1's cards cards

                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                System.out.println("player 1 are you ready? (type any number)");
                uselessvariable = sc.nextInt();

                System.out.println("player 2 played a " + player2card);
                System.out.println("");



                //player1

                //round1

                if (totalpoints == 0) {
                    System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card7 + ", " + card9);
                }

                //round 2

                if (totalpoints == 1) {
                    if (card1 == 0) {
                        System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card7 + ", " + card9);
                    }
                    if (card3 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card5 + ", " + card7 + ", " + card9);
                    }
                    if (card5 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card7 + ", " + card9);
                    }
                    if (card7 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card9);
                    }
                    if (card9 == 0) {
                        System.out.println("Player 1: " + card1 + ", " + card3 + ", " + card5 + ", " + card7);
                    }
                }

                //round3

                if (totalpoints == 2) {
                    if (card1 == 0) {
                        if (card3 == 0) {
                            System.out.println("Player 1: " + card5 + ", " + card7 + ", " + card9);
                        }
                        if (card5 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card7 + ", " + card9);
                        }
                        if (card7 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card9);
                        }
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card7);
                        }
                    }

                    if (card3 == 0) {
                        if (card5 == 0) {
                            System.out.println("Player 1: " + card1 + ", " + card7 + ", " + card9);
                        }
                        if (card7 == 0) {
                            System.out.println("Player 1: " + card1 + ", " + card5 + ", " + card9);
                        }
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card1 + ", " + card5 + ", " + card7);
                        }
                    }

                    if (card5 == 0) {
                        if (card7 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card1 + ", " + card9);
                        }
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card1 + ", " + card7);
                        }
                    }

                    if (card7 == 0) {
                        if (card9 == 0) {
                            System.out.println("Player 1: " + card3 + ", " + card5 + ", " + card1);
                        }
                    }
                }

                //round 4

                if (totalpoints == 3) {
                    if (card1 == 0) {
                        if (card3 == 0) {
                            if (card5 == 0) {
                                System.out.println("Player 1: " + card7 + ", " + card9);
                            }
                            if (card7 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card9);
                            }
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card7);
                            }
                        }
                        if (card5 == 0) {
                            if (card7 == 0) {
                                System.out.println("Player 1: " + card3 + ", " + card9);
                            }
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card3 + ", " + card7);
                            }
                        }
                        if (card7 == 0) {
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card3);
                            }
                        }
                    }

                    if (card3 == 0) {
                        if (card5 == 0) {
                            if (card7 == 0) {
                                System.out.println("Player 1: " + card1 + ", " + card9);
                            }
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card1 + ", " + card7);
                            }
                        }
                        if (card7 == 0) {
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card5 + ", " + card1);
                            }
                        }
                    }

                    if (card5 == 0) {
                        if (card7 == 0) {
                            if (card9 == 0) {
                                System.out.println("Player 1: " + card1 + ", " + card3);
                            }
                        }
                    }
                }

                //round 5

                if (totalpoints == 4) {
                    //declare last round
                    firstplay = 2;

                    if (card1 != 0) {
                        System.out.println("Player 1: " + card1);
                    }

                    if (card3 != 0) {
                        System.out.println("Player 1: " + card3);
                    }

                    if (card5 != 0) {
                        System.out.println("Player 1: " + card5);
                    }

                    if (card7 != 0) {
                        System.out.println("Player 1: " + card7);
                    }

                    if (card9 != 0) {
                        System.out.println("Player 1: " + card9);
                    }
                }

                //ask which card player 1 wants to play
                System.out.println("player 1 what card do you want to play: ");
                cardPlayed = sc.nextInt();
                if (cardPlayed != card1 && cardPlayed != card3 && cardPlayed != card5 && cardPlayed != card7 && cardPlayed != card9) {
                    while (cardPlayed != card1 && cardPlayed != card3 && cardPlayed != card5 && cardPlayed != card7 && cardPlayed != card9) {
                        System.out.println("player 1 you do not have that card what card do you want to play: ");
                        cardPlayed = sc.nextInt();
                    }
                } else {
                    if (cardPlayed == card1) {
                        player1card = card1;
                        card1 = 0;
                    } else if (cardPlayed == card3) {
                        player1card = card3;
                        card3 = 0;
                    } else if (cardPlayed == card5) {
                        player1card = card5;
                        card5 = 0;
                    } else if (cardPlayed == card7) {
                        player1card = card7;
                        card7 = 0;
                    } else if (cardPlayed == card9) {
                        player1card = card9;
                        card9 = 0;
                    }
                }
            }


            //decide who wins

            //player 1 wins
            if (player1card > player2card) {

                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                System.out.println("player 1 wins round " + (totalpoints + 1));
                player1points = player1points + 1;
                firstplay = 0;
            }

            //player 2 wins
            else if (player1card < player2card) {

                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                System.out.println("player 2 wins round " + (totalpoints + 1));
                player2points = player2points + 1;
                firstplay = 1;
            }

            // print score
            totalpoints = totalpoints + 1;
            System.out.println("score");
            System.out.println("player1: " + player1points);
            System.out.println("player2: " + player2points);
            System.out.println("");

            if (firstplay == 0) {
                System.out.println("player1's turn (type a number to continue)");
                uselessvariable = sc.nextInt();
            }
            else if (firstplay == 1){
                System.out.println("player2's turn (type a number to continue)");
                uselessvariable = sc.nextInt();
            }
            else{
                if (player1points > player2points){
                    System.out.println("Congrats Player 1 you win");
                }
                if (player2points > player1points){
                    System.out.println("Congrats Player 2 you win");
                }
            }
        }
    }
}