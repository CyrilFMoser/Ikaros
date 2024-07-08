module Program_23 () where 

 main = print $ show v_b
data B_B = C_D | C_E ((B_B,B_B)) | C_F (B_A Bool B_B)
data B_A a b = C_A | C_B B_B | C_C (B_A b b) b

v_a :: B_A Char B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_E ((C_F _,C_F _))) -> 1 
  C_B (C_E ((C_D,C_F _))) -> 2 
  C_B (C_E ((C_F _,C_D))) -> 3 
  C_B (C_F (C_B _)) -> 4 
  C_B (C_E ((C_E _,C_D))) -> 5 
  C_B (C_E _) -> 6 
  C_C (C_A) (C_F (C_B _)) -> 7 
  C_C (C_C (C_C _ _) (C_F _)) (C_E _) -> 8 
  C_C (C_A) (C_E ((C_D,C_E _))) -> 9 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_F _,C_E _))) -> 10 
  C_C (C_B (C_E _)) (C_F (C_B _)) -> 11 
  C_C (C_B (C_F _)) (C_F (C_A)) -> 12 
  C_C _ (C_E _) -> 13 
  C_C (C_C _ (C_F _)) (C_F (C_A)) -> 14 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_F _,C_D))) -> 15 
  C_C (C_B C_D) _ -> 16 
  C_C _ (C_E ((C_F _,C_D))) -> 17 
  C_C (C_C _ C_D) (C_E ((C_F _,C_E _))) -> 18 
  C_C (C_C (C_C _ _) C_D) (C_E _) -> 19 
  C_C (C_C (C_A) (C_E _)) (C_F (C_C _ _)) -> 20 
  C_C (C_C _ _) (C_F (C_B _)) -> 21 
  C_C (C_C _ C_D) (C_E ((C_E _,C_D))) -> 22 
  C_C (C_B (C_E _)) (C_F (C_A)) -> 23 
  C_C (C_B (C_F _)) (C_F (C_B _)) -> 24 
  C_C (C_C _ _) (C_F (C_A)) -> 25 
  C_C (C_C (C_C _ _) _) (C_E ((C_D,C_F _))) -> 26 
  C_C (C_C (C_A) C_D) (C_E ((C_F _,C_E _))) -> 27 
  C_C (C_C _ _) (C_F (C_C _ _)) -> 28 
  C_C (C_C (C_A) (C_F _)) C_D -> 29 
  C_C (C_B _) _ -> 30 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_E _,C_D))) -> 31 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_E _,C_F _))) -> 32 
  C_C (C_C (C_B _) (C_F _)) (C_F _) -> 33 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_E _,C_D))) -> 34 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_D,C_D))) -> 35 
  C_C (C_B (C_F _)) _ -> 36 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_D,C_F _))) -> 37 
  C_C _ C_D -> 38 
  C_C (C_C (C_B _) C_D) (C_E ((C_D,C_F _))) -> 39 
  C_C (C_C (C_C _ _) (C_F _)) (C_F (C_B _)) -> 40 
  C_C (C_C (C_C _ _) (C_F _)) (C_F _) -> 41 
  C_C (C_C _ (C_F _)) (C_E ((C_D,C_E _))) -> 42 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_F _,C_E _))) -> 43 
  C_C (C_B (C_E _)) (C_E ((C_E _,C_F _))) -> 44 
  C_C (C_C (C_C _ _) _) (C_F (C_C _ _)) -> 45 
  C_C (C_C _ (C_F _)) (C_F _) -> 46 
  C_C (C_B (C_F _)) (C_F _) -> 47 
  C_C (C_B (C_E _)) (C_E ((C_F _,C_D))) -> 48 
  C_C (C_C (C_A) (C_F _)) (C_E _) -> 49 
  C_C (C_C (C_A) _) (C_F _) -> 50 
  C_C (C_C _ (C_E _)) (C_E ((C_D,C_E _))) -> 51 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_F _,C_E _))) -> 52 
  C_C (C_B (C_E _)) _ -> 53 
  C_C (C_B (C_F _)) (C_E ((C_D,C_D))) -> 54 
  C_C (C_C (C_B _) C_D) (C_E ((C_E _,C_D))) -> 55 
  C_C (C_C (C_A) C_D) (C_E _) -> 56 
  C_C (C_B (C_E _)) (C_E ((C_F _,C_F _))) -> 57 
  C_C (C_B _) (C_E ((C_F _,C_F _))) -> 58 
  C_C (C_C (C_C _ _) _) _ -> 59 
  C_C (C_C (C_B _) (C_F _)) (C_E _) -> 60 
  C_C (C_C _ C_D) (C_F (C_A)) -> 61 
  C_C (C_C (C_A) _) (C_E _) -> 62 
  C_C (C_B _) (C_E _) -> 63 
  C_C (C_C _ C_D) (C_E ((C_D,C_D))) -> 64 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_D,C_D))) -> 65 
  C_C (C_C (C_B _) _) (C_E ((C_F _,C_F _))) -> 66 
  C_C (C_C (C_C _ _) (C_E _)) (C_F _) -> 67 
  C_C (C_C (C_B _) C_D) (C_E ((C_E _,C_F _))) -> 68 
  C_C (C_B (C_F _)) (C_E ((C_D,C_F _))) -> 69 
  C_C _ (C_E ((C_D,C_F _))) -> 70 
  C_C (C_C (C_B _) C_D) C_D -> 71 
  C_C (C_C _ (C_F _)) (C_E ((C_E _,C_E _))) -> 72 
  C_C (C_C _ _) (C_E ((C_D,C_E _))) -> 73 
  C_C (C_A) (C_F (C_C _ _)) -> 74 
  C_C (C_C (C_A) _) (C_E ((C_D,C_E _))) -> 75 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_D,C_F _))) -> 76 
  C_C (C_C (C_C _ _) (C_E _)) _ -> 77 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_E _,C_E _))) -> 78 
  C_C (C_C _ _) (C_E ((C_E _,C_E _))) -> 79 
  C_C (C_C (C_A) C_D) (C_E ((C_E _,C_D))) -> 80 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_D,C_D))) -> 81 
  C_C (C_C (C_B _) (C_F _)) _ -> 82 
  C_C (C_C (C_B _) C_D) (C_E _) -> 83 
  C_C (C_C (C_A) _) (C_E ((C_F _,C_D))) -> 84 
  C_C (C_C (C_B _) C_D) (C_F (C_B _)) -> 85 
  C_C (C_C (C_B _) _) (C_E ((C_F _,C_D))) -> 86 
  C_C (C_B (C_E _)) (C_E _) -> 87 
  C_C (C_C (C_A) _) (C_E ((C_D,C_D))) -> 88 
  C_C (C_C _ _) (C_F _) -> 89 
  C_C (C_C _ (C_E _)) (C_F (C_B _)) -> 90 
  C_C (C_B _) (C_F _) -> 91 
  C_C (C_C (C_B _) (C_F _)) (C_F (C_C _ _)) -> 92 
  C_C (C_C (C_A) C_D) C_D -> 93 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_F _,C_F _))) -> 94 
  C_C (C_C (C_A) (C_F _)) (C_F _) -> 95 
  C_C (C_C (C_A) _) (C_E ((C_E _,C_E _))) -> 96 
  C_C (C_C (C_B _) _) (C_F _) -> 97 
  C_C (C_C (C_C _ _) _) (C_E ((C_E _,C_F _))) -> 98 
  C_C (C_C (C_A) C_D) (C_E ((C_F _,C_F _))) -> 99 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_F _,C_F _))) -> 100 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_D,C_D))) -> 101 
  C_C (C_A) (C_F (C_A)) -> 102 
  C_C (C_C (C_B _) _) (C_E ((C_D,C_F _))) -> 103 
  C_C (C_A) (C_E ((C_D,C_F _))) -> 104 
  C_C (C_C (C_A) (C_E _)) C_D -> 105 
  C_C (C_A) (C_E ((C_E _,C_E _))) -> 106 
  C_C (C_C _ (C_F _)) _ -> 107 
  C_C (C_C (C_C _ _) (C_F _)) (C_F (C_A)) -> 108 
  C_C (C_B (C_F _)) (C_E ((C_F _,C_D))) -> 109 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_F _,C_E _))) -> 110 
  C_C _ (C_F _) -> 111 
  C_C (C_B C_D) (C_E ((C_D,C_E _))) -> 112 
  C_C (C_B _) (C_E ((C_F _,C_E _))) -> 113 
  C_C (C_C _ (C_E _)) (C_E ((C_E _,C_F _))) -> 114 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_E _,C_F _))) -> 115 
  C_C (C_C _ _) (C_E ((C_E _,C_F _))) -> 116 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_F _,C_D))) -> 117 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_F _,C_D))) -> 118 
  C_C (C_C _ (C_F _)) (C_E ((C_F _,C_E _))) -> 119 
  C_C (C_C _ (C_E _)) (C_F (C_C _ _)) -> 120 
  C_C (C_C _ (C_E _)) (C_E ((C_F _,C_E _))) -> 121 
  C_C (C_C (C_A) _) (C_E ((C_E _,C_F _))) -> 122 
  C_C (C_A) (C_E ((C_D,C_D))) -> 123 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_D,C_F _))) -> 124 
  C_C _ _ -> 125 
  C_C (C_C (C_B _) _) (C_E ((C_E _,C_F _))) -> 126 
  C_C (C_B (C_F _)) (C_E ((C_F _,C_F _))) -> 127 
