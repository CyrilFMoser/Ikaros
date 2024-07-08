module Program_31 () where 

 main = print $ show v_b
data B_A = C_A Char B_A | C_B (B_B B_A) | C_C B_A B_A
data B_B a = C_D | C_E (B_B a) B_A | C_F Int (B_B ((Bool,Char))) | C_G

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E (C_D) (C_A _ (C_A _ _)) -> 1 
  C_E (C_D) (C_A _ (C_B _)) -> 2 
  C_E (C_D) (C_A _ (C_C _ _)) -> 3 
  C_E (C_D) (C_B (C_D)) -> 4 
  C_E (C_D) (C_B (C_E _ _)) -> 5 
  C_E (C_D) (C_B (C_F _ _)) -> 6 
  C_E (C_D) (C_B (C_G)) -> 7 
  C_E (C_D) (C_C _ _) -> 8 
  C_E (C_E (C_D) (C_A _ _)) (C_A _ (C_A _ _)) -> 9 
  C_E (C_E (C_D) (C_A _ _)) (C_A _ (C_B _)) -> 10 
  C_E (C_E (C_D) (C_A _ _)) (C_A _ (C_C _ _)) -> 11 
  C_E (C_E (C_D) (C_A _ _)) (C_B (C_D)) -> 12 
  C_E (C_E (C_D) (C_A _ _)) (C_B (C_E _ _)) -> 13 
  C_E (C_E (C_D) (C_A _ _)) (C_B (C_F _ _)) -> 14 
  C_E (C_E (C_D) (C_A _ _)) (C_B (C_G)) -> 15 
  C_E (C_E (C_D) (C_A _ _)) (C_C _ _) -> 16 
  C_E (C_E (C_D) (C_B _)) (C_A _ (C_A _ _)) -> 17 
  C_E (C_E (C_D) (C_B _)) (C_A _ (C_B _)) -> 18 
  C_E (C_E (C_D) (C_B _)) (C_A _ (C_C _ _)) -> 19 
  C_E (C_E (C_D) (C_B _)) (C_B (C_D)) -> 20 
  C_E (C_E (C_D) (C_B _)) (C_B (C_E _ _)) -> 21 
  C_E (C_E (C_D) (C_B _)) (C_B (C_F _ _)) -> 22 
  C_E (C_E (C_D) (C_B _)) (C_B (C_G)) -> 23 
  C_E (C_E (C_D) (C_B _)) (C_C _ _) -> 24 
  C_E (C_E (C_D) (C_C _ _)) (C_A _ (C_A _ _)) -> 25 
  C_E (C_E (C_D) (C_C _ _)) (C_A _ (C_B _)) -> 26 
  C_E (C_E (C_D) (C_C _ _)) (C_A _ (C_C _ _)) -> 27 
  C_E (C_E (C_D) (C_C _ _)) (C_B (C_D)) -> 28 
  C_E (C_E (C_D) (C_C _ _)) (C_B (C_E _ _)) -> 29 
  C_E (C_E (C_D) (C_C _ _)) (C_B (C_F _ _)) -> 30 
  C_E (C_E (C_D) (C_C _ _)) (C_B (C_G)) -> 31 
  C_E (C_E (C_D) (C_C _ _)) (C_C _ _) -> 32 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 33 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_A _ (C_B _)) -> 34 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 35 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_B (C_D)) -> 36 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_B (C_E _ _)) -> 37 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_B (C_F _ _)) -> 38 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_B (C_G)) -> 39 
  C_E (C_E (C_E _ _) (C_A _ _)) (C_C _ _) -> 40 
  C_E (C_E (C_E _ _) (C_B _)) (C_A _ (C_A _ _)) -> 41 
  C_E (C_E (C_E _ _) (C_B _)) (C_A _ (C_B _)) -> 42 
  C_E (C_E (C_E _ _) (C_B _)) (C_A _ (C_C _ _)) -> 43 
  C_E (C_E (C_E _ _) (C_B _)) (C_B (C_D)) -> 44 
  C_E (C_E (C_E _ _) (C_B _)) (C_B (C_E _ _)) -> 45 
  C_E (C_E (C_E _ _) (C_B _)) (C_B (C_F _ _)) -> 46 
  C_E (C_E (C_E _ _) (C_B _)) (C_B (C_G)) -> 47 
  C_E (C_E (C_E _ _) (C_B _)) (C_C _ _) -> 48 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_A _ (C_A _ _)) -> 49 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_A _ (C_B _)) -> 50 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 51 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_B (C_D)) -> 52 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_B (C_E _ _)) -> 53 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_B (C_F _ _)) -> 54 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_B (C_G)) -> 55 
  C_E (C_E (C_E _ _) (C_C _ _)) (C_C _ _) -> 56 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_A _ (C_A _ _)) -> 57 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_A _ (C_B _)) -> 58 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_A _ (C_C _ _)) -> 59 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_B (C_D)) -> 60 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_B (C_E _ _)) -> 61 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_B (C_F _ _)) -> 62 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_B (C_G)) -> 63 
  C_E (C_E (C_F _ _) (C_A _ _)) (C_C _ _) -> 64 
  C_E (C_E (C_F _ _) (C_B _)) (C_A _ (C_A _ _)) -> 65 
  C_E (C_E (C_F _ _) (C_B _)) (C_A _ (C_B _)) -> 66 
  C_E (C_E (C_F _ _) (C_B _)) (C_A _ (C_C _ _)) -> 67 
  C_E (C_E (C_F _ _) (C_B _)) (C_B (C_D)) -> 68 
  C_E (C_E (C_F _ _) (C_B _)) (C_B (C_E _ _)) -> 69 
  C_E (C_E (C_F _ _) (C_B _)) (C_B (C_F _ _)) -> 70 
  C_E (C_E (C_F _ _) (C_B _)) (C_B (C_G)) -> 71 
  C_E (C_E (C_F _ _) (C_B _)) (C_C _ _) -> 72 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_A _ (C_A _ _)) -> 73 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_A _ (C_B _)) -> 74 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_A _ (C_C _ _)) -> 75 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_B (C_D)) -> 76 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_B (C_E _ _)) -> 77 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_B (C_F _ _)) -> 78 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_B (C_G)) -> 79 
  C_E (C_E (C_F _ _) (C_C _ _)) (C_C _ _) -> 80 
  C_E (C_E (C_G) (C_A _ _)) (C_A _ (C_A _ _)) -> 81 
  C_E (C_E (C_G) (C_A _ _)) (C_A _ (C_B _)) -> 82 
  C_E (C_E (C_G) (C_A _ _)) (C_A _ (C_C _ _)) -> 83 
  C_E (C_E (C_G) (C_A _ _)) (C_B (C_D)) -> 84 
  C_E (C_E (C_G) (C_A _ _)) (C_B (C_E _ _)) -> 85 
  C_E (C_E (C_G) (C_A _ _)) (C_B (C_F _ _)) -> 86 
  C_E (C_E (C_G) (C_A _ _)) (C_B (C_G)) -> 87 
  C_E (C_E (C_G) (C_A _ _)) (C_C _ _) -> 88 
  C_E (C_E (C_G) (C_B _)) (C_A _ (C_A _ _)) -> 89 
  C_E (C_E (C_G) (C_B _)) (C_A _ (C_B _)) -> 90 
  C_E (C_E (C_G) (C_B _)) (C_A _ (C_C _ _)) -> 91 
  C_E (C_E (C_G) (C_B _)) (C_B (C_D)) -> 92 
  C_E (C_E (C_G) (C_B _)) (C_B (C_E _ _)) -> 93 
  C_E (C_E (C_G) (C_B _)) (C_B (C_F _ _)) -> 94 
  C_E (C_E (C_G) (C_B _)) (C_B (C_G)) -> 95 
  C_E (C_E (C_G) (C_B _)) (C_C _ _) -> 96 
  C_E (C_E (C_G) (C_C _ _)) (C_A _ (C_A _ _)) -> 97 
  C_E (C_E (C_G) (C_C _ _)) (C_A _ (C_B _)) -> 98 
  C_E (C_E (C_G) (C_C _ _)) (C_A _ (C_C _ _)) -> 99 
  C_E (C_E (C_G) (C_C _ _)) (C_B (C_D)) -> 100 
  C_E (C_E (C_G) (C_C _ _)) (C_B (C_E _ _)) -> 101 
  C_E (C_E (C_G) (C_C _ _)) (C_B (C_F _ _)) -> 102 
  C_E (C_E (C_G) (C_C _ _)) (C_B (C_G)) -> 103 
  C_E (C_E (C_G) (C_C _ _)) (C_C _ _) -> 104 
  C_E (C_F _ _) (C_A _ (C_A _ _)) -> 105 
  C_E (C_F _ _) (C_A _ (C_B _)) -> 106 
  C_E (C_F _ _) (C_A _ (C_C _ _)) -> 107 
  C_E (C_F _ _) (C_B (C_D)) -> 108 
  C_E (C_F _ _) (C_B (C_E _ _)) -> 109 
  C_E (C_F _ _) (C_B (C_F _ _)) -> 110 
  C_E (C_F _ _) (C_B (C_G)) -> 111 
  C_E (C_F _ _) (C_C _ _) -> 112 
  C_E (C_G) (C_A _ (C_A _ _)) -> 113 
  C_E (C_G) (C_A _ (C_B _)) -> 114 
  C_E (C_G) (C_A _ (C_C _ _)) -> 115 
  C_E (C_G) (C_B (C_D)) -> 116 
  C_E (C_G) (C_B (C_E _ _)) -> 117 
  C_E (C_G) (C_B (C_F _ _)) -> 118 
  C_E (C_G) (C_C _ _) -> 119 
  C_F _ _ -> 120 
  C_G -> 121 
