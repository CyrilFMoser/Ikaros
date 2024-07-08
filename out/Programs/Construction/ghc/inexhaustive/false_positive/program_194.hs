module Program_10 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B (B_B B_A ((Bool,Int))) B_A | C_C B_A | C_D (B_B B_A ((Char,Bool)))
data B_B a b = C_E B_A Bool | C_F B_A (B_B a a) | C_G B_A | C_H ((Int,B_A))

v_a :: B_B Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_F (C_A _) (C_E _ _) -> 1 
  C_F (C_A _) (C_F _ _) -> 2 
  C_F (C_A _) (C_G (C_A _)) -> 3 
  C_F (C_A _) (C_G (C_B _ _)) -> 4 
  C_F (C_A _) (C_G (C_C _)) -> 5 
  C_F (C_A _) (C_G (C_D _)) -> 6 
  C_F (C_A _) (C_H _) -> 7 
  C_F (C_B (C_E _ _) (C_A _)) (C_E _ _) -> 8 
  C_F (C_B (C_E _ _) (C_A _)) (C_F _ _) -> 9 
  C_F (C_B (C_E _ _) (C_A _)) (C_G (C_A _)) -> 10 
  C_F (C_B (C_E _ _) (C_A _)) (C_G (C_B _ _)) -> 11 
  C_F (C_B (C_E _ _) (C_A _)) (C_G (C_C _)) -> 12 
  C_F (C_B (C_E _ _) (C_A _)) (C_G (C_D _)) -> 13 
  C_F (C_B (C_E _ _) (C_A _)) (C_H _) -> 14 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_E _ _) -> 15 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_F _ _) -> 16 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_G (C_A _)) -> 17 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_G (C_B _ _)) -> 18 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_G (C_C _)) -> 19 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_G (C_D _)) -> 20 
  C_F (C_B (C_E _ _) (C_B _ _)) (C_H _) -> 21 
  C_F (C_B (C_E _ _) (C_C _)) (C_E _ _) -> 22 
  C_F (C_B (C_E _ _) (C_C _)) (C_F _ _) -> 23 
  C_F (C_B (C_E _ _) (C_C _)) (C_G (C_A _)) -> 24 
  C_F (C_B (C_E _ _) (C_C _)) (C_G (C_B _ _)) -> 25 
  C_F (C_B (C_E _ _) (C_C _)) (C_G (C_C _)) -> 26 
  C_F (C_B (C_E _ _) (C_C _)) (C_G (C_D _)) -> 27 
  C_F (C_B (C_E _ _) (C_C _)) (C_H _) -> 28 
  C_F (C_B (C_E _ _) (C_D _)) (C_E _ _) -> 29 
  C_F (C_B (C_E _ _) (C_D _)) (C_F _ _) -> 30 
  C_F (C_B (C_E _ _) (C_D _)) (C_G (C_A _)) -> 31 
  C_F (C_B (C_E _ _) (C_D _)) (C_G (C_B _ _)) -> 32 
  C_F (C_B (C_E _ _) (C_D _)) (C_G (C_C _)) -> 33 
  C_F (C_B (C_E _ _) (C_D _)) (C_G (C_D _)) -> 34 
  C_F (C_B (C_E _ _) (C_D _)) (C_H _) -> 35 
  C_F (C_B (C_F _ _) (C_A _)) (C_E _ _) -> 36 
  C_F (C_B (C_F _ _) (C_A _)) (C_F _ _) -> 37 
  C_F (C_B (C_F _ _) (C_A _)) (C_G (C_A _)) -> 38 
  C_F (C_B (C_F _ _) (C_A _)) (C_G (C_B _ _)) -> 39 
  C_F (C_B (C_F _ _) (C_A _)) (C_G (C_C _)) -> 40 
  C_F (C_B (C_F _ _) (C_A _)) (C_G (C_D _)) -> 41 
  C_F (C_B (C_F _ _) (C_A _)) (C_H _) -> 42 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_E _ _) -> 43 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_F _ _) -> 44 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_G (C_A _)) -> 45 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_G (C_B _ _)) -> 46 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_G (C_C _)) -> 47 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_G (C_D _)) -> 48 
  C_F (C_B (C_F _ _) (C_B _ _)) (C_H _) -> 49 
  C_F (C_B (C_F _ _) (C_C _)) (C_E _ _) -> 50 
  C_F (C_B (C_F _ _) (C_C _)) (C_F _ _) -> 51 
  C_F (C_B (C_F _ _) (C_C _)) (C_G (C_A _)) -> 52 
  C_F (C_B (C_F _ _) (C_C _)) (C_G (C_B _ _)) -> 53 
  C_F (C_B (C_F _ _) (C_C _)) (C_G (C_C _)) -> 54 
  C_F (C_B (C_F _ _) (C_C _)) (C_G (C_D _)) -> 55 
  C_F (C_B (C_F _ _) (C_C _)) (C_H _) -> 56 
  C_F (C_B (C_F _ _) (C_D _)) (C_E _ _) -> 57 
  C_F (C_B (C_F _ _) (C_D _)) (C_F _ _) -> 58 
  C_F (C_B (C_F _ _) (C_D _)) (C_G (C_A _)) -> 59 
  C_F (C_B (C_F _ _) (C_D _)) (C_G (C_B _ _)) -> 60 
  C_F (C_B (C_F _ _) (C_D _)) (C_G (C_C _)) -> 61 
  C_F (C_B (C_F _ _) (C_D _)) (C_G (C_D _)) -> 62 
  C_F (C_B (C_F _ _) (C_D _)) (C_H _) -> 63 
  C_F (C_B (C_G _) (C_A _)) (C_E _ _) -> 64 
  C_F (C_B (C_G _) (C_A _)) (C_F _ _) -> 65 
  C_F (C_B (C_G _) (C_A _)) (C_G (C_A _)) -> 66 
  C_F (C_B (C_G _) (C_A _)) (C_G (C_B _ _)) -> 67 
  C_F (C_B (C_G _) (C_A _)) (C_G (C_C _)) -> 68 
  C_F (C_B (C_G _) (C_A _)) (C_G (C_D _)) -> 69 
  C_F (C_B (C_G _) (C_A _)) (C_H _) -> 70 
  C_F (C_B (C_G _) (C_B _ _)) (C_E _ _) -> 71 
  C_F (C_B (C_G _) (C_B _ _)) (C_F _ _) -> 72 
  C_F (C_B (C_G _) (C_B _ _)) (C_G (C_A _)) -> 73 
  C_F (C_B (C_G _) (C_B _ _)) (C_G (C_B _ _)) -> 74 
  C_F (C_B (C_G _) (C_B _ _)) (C_G (C_C _)) -> 75 
  C_F (C_B (C_G _) (C_B _ _)) (C_G (C_D _)) -> 76 
  C_F (C_B (C_G _) (C_B _ _)) (C_H _) -> 77 
  C_F (C_B (C_G _) (C_C _)) (C_E _ _) -> 78 
  C_F (C_B (C_G _) (C_C _)) (C_F _ _) -> 79 
  C_F (C_B (C_G _) (C_C _)) (C_G (C_A _)) -> 80 
  C_F (C_B (C_G _) (C_C _)) (C_G (C_B _ _)) -> 81 
  C_F (C_B (C_G _) (C_C _)) (C_G (C_C _)) -> 82 
  C_F (C_B (C_G _) (C_C _)) (C_G (C_D _)) -> 83 
  C_F (C_B (C_G _) (C_C _)) (C_H _) -> 84 
  C_F (C_B (C_G _) (C_D _)) (C_E _ _) -> 85 
  C_F (C_B (C_G _) (C_D _)) (C_F _ _) -> 86 
  C_F (C_B (C_G _) (C_D _)) (C_G (C_A _)) -> 87 
  C_F (C_B (C_G _) (C_D _)) (C_G (C_B _ _)) -> 88 
  C_F (C_B (C_G _) (C_D _)) (C_G (C_C _)) -> 89 
  C_F (C_B (C_G _) (C_D _)) (C_G (C_D _)) -> 90 
  C_F (C_B (C_G _) (C_D _)) (C_H _) -> 91 
  C_F (C_B (C_H _) (C_A _)) (C_E _ _) -> 92 
  C_F (C_B (C_H _) (C_A _)) (C_F _ _) -> 93 
  C_F (C_B (C_H _) (C_A _)) (C_G (C_A _)) -> 94 
  C_F (C_B (C_H _) (C_A _)) (C_G (C_B _ _)) -> 95 
  C_F (C_B (C_H _) (C_A _)) (C_G (C_C _)) -> 96 
  C_F (C_B (C_H _) (C_A _)) (C_G (C_D _)) -> 97 
  C_F (C_B (C_H _) (C_A _)) (C_H _) -> 98 
  C_F (C_B (C_H _) (C_B _ _)) (C_E _ _) -> 99 
  C_F (C_B (C_H _) (C_B _ _)) (C_F _ _) -> 100 
  C_F (C_B (C_H _) (C_B _ _)) (C_G (C_A _)) -> 101 
  C_F (C_B (C_H _) (C_B _ _)) (C_G (C_B _ _)) -> 102 
  C_F (C_B (C_H _) (C_B _ _)) (C_G (C_C _)) -> 103 
  C_F (C_B (C_H _) (C_B _ _)) (C_G (C_D _)) -> 104 
  C_F (C_B (C_H _) (C_B _ _)) (C_H _) -> 105 
  C_F (C_B (C_H _) (C_C _)) (C_E _ _) -> 106 
  C_F (C_B (C_H _) (C_C _)) (C_F _ _) -> 107 
  C_F (C_B (C_H _) (C_C _)) (C_G (C_A _)) -> 108 
  C_F (C_B (C_H _) (C_C _)) (C_G (C_C _)) -> 109 
  C_F (C_B (C_H _) (C_C _)) (C_G (C_D _)) -> 110 
  C_F (C_B (C_H _) (C_C _)) (C_H _) -> 111 
  C_F (C_B (C_H _) (C_D _)) (C_E _ _) -> 112 
  C_F (C_B (C_H _) (C_D _)) (C_F _ _) -> 113 
  C_F (C_B (C_H _) (C_D _)) (C_G (C_A _)) -> 114 
  C_F (C_B (C_H _) (C_D _)) (C_G (C_B _ _)) -> 115 
  C_F (C_B (C_H _) (C_D _)) (C_G (C_C _)) -> 116 
  C_F (C_B (C_H _) (C_D _)) (C_G (C_D _)) -> 117 
  C_F (C_B (C_H _) (C_D _)) (C_H _) -> 118 
  C_F (C_C _) (C_E _ _) -> 119 
  C_F (C_C _) (C_F _ _) -> 120 
  C_F (C_C _) (C_G (C_A _)) -> 121 
  C_F (C_C _) (C_G (C_B _ _)) -> 122 
  C_F (C_C _) (C_G (C_C _)) -> 123 
  C_F (C_C _) (C_G (C_D _)) -> 124 
  C_F (C_C _) (C_H _) -> 125 
  C_F (C_D _) (C_E _ _) -> 126 
  C_F (C_D _) (C_F _ _) -> 127 
  C_F (C_D _) (C_G (C_A _)) -> 128 
  C_F (C_D _) (C_G (C_B _ _)) -> 129 
  C_F (C_D _) (C_G (C_C _)) -> 130 
  C_F (C_D _) (C_G (C_D _)) -> 131 
  C_F (C_D _) (C_H _) -> 132 
  C_G _ -> 133 
  C_H ((_,C_A _)) -> 134 
  C_H ((_,C_B _ _)) -> 135 
  C_H ((_,C_C _)) -> 136 
  C_H ((_,C_D _)) -> 137 
