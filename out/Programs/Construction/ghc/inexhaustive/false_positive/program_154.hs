module Program_4 () where 

 main = print $ show v_b
data B_C c d = C_F
data B_A a = C_A ((B_D,B_D))
data B_B b = C_B (B_C b b) | C_C Char | C_D (B_A b) | C_E (B_B b) B_D
data B_D = C_G | C_H B_D | C_I (B_B B_D) B_D

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H C_G -> 1 
  C_H (C_H _) -> 2 
  C_H (C_I (C_B _) C_G) -> 3 
  C_H (C_I (C_C _) C_G) -> 4 
  C_H (C_I (C_D _) C_G) -> 5 
  C_H (C_I (C_E _ _) C_G) -> 6 
  C_H (C_I (C_B _) (C_H _)) -> 7 
  C_H (C_I (C_C _) (C_H _)) -> 8 
  C_H (C_I (C_D _) (C_H _)) -> 9 
  C_H (C_I (C_E _ _) (C_H _)) -> 10 
  C_H (C_I (C_B _) (C_I _ _)) -> 11 
  C_H (C_I (C_C _) (C_I _ _)) -> 12 
  C_H (C_I (C_D _) (C_I _ _)) -> 13 
  C_H (C_I (C_E _ _) (C_I _ _)) -> 14 
  C_I (C_B (C_F)) C_G -> 15 
  C_I (C_C _) C_G -> 16 
  C_I (C_D _) C_G -> 17 
  C_I (C_E (C_B _) _) C_G -> 18 
  C_I (C_E (C_C _) _) C_G -> 19 
  C_I (C_E (C_D _) _) C_G -> 20 
  C_I (C_E (C_E _ _) _) C_G -> 21 
  C_I (C_B (C_F)) (C_H C_G) -> 22 
  C_I (C_C _) (C_H C_G) -> 23 
  C_I (C_D _) (C_H C_G) -> 24 
  C_I (C_E (C_B _) _) (C_H C_G) -> 25 
  C_I (C_E (C_C _) _) (C_H C_G) -> 26 
  C_I (C_E (C_D _) _) (C_H C_G) -> 27 
  C_I (C_E (C_E _ _) _) (C_H C_G) -> 28 
  C_I (C_B (C_F)) (C_H (C_H _)) -> 29 
  C_I (C_C _) (C_H (C_H _)) -> 30 
  C_I (C_D _) (C_H (C_H _)) -> 31 
  C_I (C_E (C_B _) _) (C_H (C_H _)) -> 32 
  C_I (C_E (C_C _) _) (C_H (C_H _)) -> 33 
  C_I (C_E (C_D _) _) (C_H (C_H _)) -> 34 
  C_I (C_E (C_E _ _) _) (C_H (C_H _)) -> 35 
  C_I (C_B (C_F)) (C_H (C_I _ _)) -> 36 
  C_I (C_C _) (C_H (C_I _ _)) -> 37 
  C_I (C_D _) (C_H (C_I _ _)) -> 38 
  C_I (C_E (C_B _) _) (C_H (C_I _ _)) -> 39 
  C_I (C_E (C_C _) _) (C_H (C_I _ _)) -> 40 
  C_I (C_E (C_D _) _) (C_H (C_I _ _)) -> 41 
  C_I (C_E (C_E _ _) _) (C_H (C_I _ _)) -> 42 
  C_I (C_B (C_F)) (C_I (C_B _) C_G) -> 43 
  C_I (C_C _) (C_I (C_B _) C_G) -> 44 
  C_I (C_D _) (C_I (C_B _) C_G) -> 45 
  C_I (C_E (C_B _) _) (C_I (C_B _) C_G) -> 46 
  C_I (C_E (C_C _) _) (C_I (C_B _) C_G) -> 47 
  C_I (C_E (C_D _) _) (C_I (C_B _) C_G) -> 48 
  C_I (C_E (C_E _ _) _) (C_I (C_B _) C_G) -> 49 
  C_I (C_B (C_F)) (C_I (C_B _) (C_H _)) -> 50 
  C_I (C_C _) (C_I (C_B _) (C_H _)) -> 51 
  C_I (C_D _) (C_I (C_B _) (C_H _)) -> 52 
  C_I (C_E (C_B _) _) (C_I (C_B _) (C_H _)) -> 53 
  C_I (C_E (C_C _) _) (C_I (C_B _) (C_H _)) -> 54 
  C_I (C_E (C_D _) _) (C_I (C_B _) (C_H _)) -> 55 
  C_I (C_E (C_E _ _) _) (C_I (C_B _) (C_H _)) -> 56 
  C_I (C_B (C_F)) (C_I (C_B _) (C_I _ _)) -> 57 
  C_I (C_C _) (C_I (C_B _) (C_I _ _)) -> 58 
  C_I (C_D _) (C_I (C_B _) (C_I _ _)) -> 59 
  C_I (C_E (C_B _) _) (C_I (C_B _) (C_I _ _)) -> 60 
  C_I (C_E (C_C _) _) (C_I (C_B _) (C_I _ _)) -> 61 
  C_I (C_E (C_D _) _) (C_I (C_B _) (C_I _ _)) -> 62 
  C_I (C_E (C_E _ _) _) (C_I (C_B _) (C_I _ _)) -> 63 
  C_I (C_B (C_F)) (C_I (C_C _) C_G) -> 64 
  C_I (C_C _) (C_I (C_C _) C_G) -> 65 
  C_I (C_D _) (C_I (C_C _) C_G) -> 66 
  C_I (C_E (C_B _) _) (C_I (C_C _) C_G) -> 67 
  C_I (C_E (C_C _) _) (C_I (C_C _) C_G) -> 68 
  C_I (C_E (C_D _) _) (C_I (C_C _) C_G) -> 69 
  C_I (C_E (C_E _ _) _) (C_I (C_C _) C_G) -> 70 
  C_I (C_B (C_F)) (C_I (C_C _) (C_H _)) -> 71 
  C_I (C_C _) (C_I (C_C _) (C_H _)) -> 72 
  C_I (C_D _) (C_I (C_C _) (C_H _)) -> 73 
  C_I (C_E (C_B _) _) (C_I (C_C _) (C_H _)) -> 74 
  C_I (C_E (C_C _) _) (C_I (C_C _) (C_H _)) -> 75 
  C_I (C_E (C_D _) _) (C_I (C_C _) (C_H _)) -> 76 
  C_I (C_E (C_E _ _) _) (C_I (C_C _) (C_H _)) -> 77 
  C_I (C_B (C_F)) (C_I (C_C _) (C_I _ _)) -> 78 
  C_I (C_C _) (C_I (C_C _) (C_I _ _)) -> 79 
  C_I (C_D _) (C_I (C_C _) (C_I _ _)) -> 80 
  C_I (C_E (C_B _) _) (C_I (C_C _) (C_I _ _)) -> 81 
  C_I (C_E (C_C _) _) (C_I (C_C _) (C_I _ _)) -> 82 
  C_I (C_E (C_D _) _) (C_I (C_C _) (C_I _ _)) -> 83 
  C_I (C_E (C_E _ _) _) (C_I (C_C _) (C_I _ _)) -> 84 
  C_I (C_B (C_F)) (C_I (C_D _) C_G) -> 85 
  C_I (C_C _) (C_I (C_D _) C_G) -> 86 
  C_I (C_D _) (C_I (C_D _) C_G) -> 87 
  C_I (C_E (C_B _) _) (C_I (C_D _) C_G) -> 88 
  C_I (C_E (C_C _) _) (C_I (C_D _) C_G) -> 89 
  C_I (C_E (C_D _) _) (C_I (C_D _) C_G) -> 90 
  C_I (C_E (C_E _ _) _) (C_I (C_D _) C_G) -> 91 
  C_I (C_B (C_F)) (C_I (C_D _) (C_H _)) -> 92 
  C_I (C_C _) (C_I (C_D _) (C_H _)) -> 93 
  C_I (C_D _) (C_I (C_D _) (C_H _)) -> 94 
  C_I (C_E (C_B _) _) (C_I (C_D _) (C_H _)) -> 95 
  C_I (C_E (C_C _) _) (C_I (C_D _) (C_H _)) -> 96 
  C_I (C_E (C_D _) _) (C_I (C_D _) (C_H _)) -> 97 
  C_I (C_E (C_E _ _) _) (C_I (C_D _) (C_H _)) -> 98 
  C_I (C_B (C_F)) (C_I (C_D _) (C_I _ _)) -> 99 
  C_I (C_C _) (C_I (C_D _) (C_I _ _)) -> 100 
  C_I (C_D _) (C_I (C_D _) (C_I _ _)) -> 101 
  C_I (C_E (C_B _) _) (C_I (C_D _) (C_I _ _)) -> 102 
  C_I (C_E (C_C _) _) (C_I (C_D _) (C_I _ _)) -> 103 
  C_I (C_E (C_D _) _) (C_I (C_D _) (C_I _ _)) -> 104 
  C_I (C_E (C_E _ _) _) (C_I (C_D _) (C_I _ _)) -> 105 
  C_I (C_B (C_F)) (C_I (C_E _ _) C_G) -> 106 
  C_I (C_C _) (C_I (C_E _ _) C_G) -> 107 
  C_I (C_D _) (C_I (C_E _ _) C_G) -> 108 
  C_I (C_E (C_B _) _) (C_I (C_E _ _) C_G) -> 109 
  C_I (C_E (C_C _) _) (C_I (C_E _ _) C_G) -> 110 
  C_I (C_E (C_D _) _) (C_I (C_E _ _) C_G) -> 111 
  C_I (C_E (C_E _ _) _) (C_I (C_E _ _) C_G) -> 112 
  C_I (C_B (C_F)) (C_I (C_E _ _) (C_H _)) -> 113 
  C_I (C_C _) (C_I (C_E _ _) (C_H _)) -> 114 
  C_I (C_D _) (C_I (C_E _ _) (C_H _)) -> 115 
  C_I (C_E (C_B _) _) (C_I (C_E _ _) (C_H _)) -> 116 
  C_I (C_E (C_C _) _) (C_I (C_E _ _) (C_H _)) -> 117 
  C_I (C_E (C_D _) _) (C_I (C_E _ _) (C_H _)) -> 118 
  C_I (C_E (C_E _ _) _) (C_I (C_E _ _) (C_H _)) -> 119 
  C_I (C_B (C_F)) (C_I (C_E _ _) (C_I _ _)) -> 120 
  C_I (C_C _) (C_I (C_E _ _) (C_I _ _)) -> 121 
  C_I (C_D _) (C_I (C_E _ _) (C_I _ _)) -> 122 
  C_I (C_E (C_C _) _) (C_I (C_E _ _) (C_I _ _)) -> 123 
  C_I (C_E (C_D _) _) (C_I (C_E _ _) (C_I _ _)) -> 124 
  C_I (C_E (C_E _ _) _) (C_I (C_E _ _) (C_I _ _)) -> 125 
