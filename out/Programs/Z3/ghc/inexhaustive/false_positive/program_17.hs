module Program_24 () where 

 main = print $ show v_b
data B_B = C_D | C_E ((B_B,B_B)) | C_F (B_A Bool B_B)
data B_A a b = C_A | C_B B_B | C_C (B_A b b) b

v_a :: B_A Char B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B C_D -> 0 
  C_C (C_B _) (C_E ((C_E _,C_E _))) -> 1 
  C_C (C_C _ (C_F _)) (C_E ((C_F _,C_F _))) -> 2 
  C_C (C_B C_D) (C_E ((C_D,C_D))) -> 3 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_E _,C_D))) -> 4 
  C_C (C_C (C_C _ _) C_D) (C_E ((C_E _,C_F _))) -> 5 
  C_C (C_C _ (C_F _)) (C_F (C_B _)) -> 6 
  C_C (C_C (C_A) C_D) (C_E ((C_D,C_D))) -> 7 
  C_C (C_C (C_A) (C_E _)) _ -> 8 
  C_C (C_C (C_A) _) C_D -> 9 
  C_C (C_C (C_A) C_D) (C_E ((C_D,C_E _))) -> 10 
  C_C (C_C (C_B _) C_D) (C_F _) -> 11 
  C_C (C_B (C_E _)) (C_E ((C_E _,C_E _))) -> 12 
  C_C (C_A) (C_E ((C_F _,C_F _))) -> 13 
  C_C (C_C (C_C _ _) C_D) _ -> 14 
  C_C (C_C _ C_D) (C_E ((C_F _,C_D))) -> 15 
  C_C (C_C (C_C _ _) _) (C_F (C_B _)) -> 16 
  C_C (C_A) (C_F _) -> 17 
  C_C (C_C _ C_D) (C_E ((C_E _,C_E _))) -> 18 
  C_C (C_C _ (C_F _)) C_D -> 19 
  C_C (C_C _ _) _ -> 20 
  C_C (C_C (C_B _) _) (C_E ((C_D,C_E _))) -> 21 
  C_C _ (C_E ((C_D,C_D))) -> 22 
  C_C (C_C (C_C _ _) C_D) (C_F _) -> 23 
  C_C (C_C (C_B _) C_D) _ -> 24 
  C_C _ (C_E ((C_E _,C_F _))) -> 25 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_D,C_E _))) -> 26 
  C_C (C_C (C_B _) (C_F _)) (C_F (C_B _)) -> 27 
  C_C (C_C _ (C_E _)) (C_E ((C_D,C_F _))) -> 28 
  C_C (C_C (C_C _ _) _) (C_E _) -> 29 
  C_C (C_C (C_A) (C_F _)) (C_F (C_A)) -> 30 
  C_C (C_C _ (C_E _)) (C_E ((C_E _,C_E _))) -> 31 
  C_C (C_C (C_A) (C_E _)) (C_E _) -> 32 
  C_C (C_B C_D) C_D -> 33 
  C_C (C_C _ C_D) (C_E ((C_D,C_F _))) -> 34 
  C_C (C_C (C_C _ _) C_D) (C_F (C_C _ _)) -> 35 
  C_C (C_B C_D) (C_E ((C_E _,C_E _))) -> 36 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_F _,C_F _))) -> 37 
  C_C (C_C (C_C _ _) _) (C_E ((C_F _,C_E _))) -> 38 
  C_C (C_C (C_B _) (C_E _)) (C_F (C_B _)) -> 39 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_F _,C_D))) -> 40 
  C_C (C_A) (C_E ((C_E _,C_F _))) -> 41 
  C_C (C_C (C_C _ _) (C_F _)) _ -> 42 
  C_C (C_C (C_C _ _) (C_F _)) C_D -> 43 
  C_C (C_C _ _) (C_E ((C_E _,C_D))) -> 44 
  C_C (C_B (C_F _)) (C_E _) -> 45 
  C_C (C_C (C_C _ _) _) (C_F _) -> 46 
  C_C (C_C (C_B _) (C_E _)) (C_E _) -> 47 
  C_C (C_C (C_B _) C_D) (C_F (C_C _ _)) -> 48 
  C_C (C_C (C_A) C_D) (C_E ((C_F _,C_D))) -> 49 
  C_C _ (C_E ((C_D,C_E _))) -> 50 
  C_C (C_B C_D) (C_E ((C_F _,C_F _))) -> 51 
  C_C (C_C _ (C_E _)) C_D -> 52 
  C_C (C_C (C_B _) C_D) (C_E ((C_D,C_E _))) -> 53 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_D,C_E _))) -> 54 
  C_C (C_C (C_C _ _) C_D) (C_F (C_B _)) -> 55 
  C_C (C_C _ (C_E _)) (C_E ((C_F _,C_D))) -> 56 
  C_C (C_C (C_C _ _) (C_E _)) (C_E _) -> 57 
  C_C (C_B C_D) (C_F (C_C _ _)) -> 58 
  C_C (C_C _ _) (C_E ((C_F _,C_F _))) -> 59 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_F _,C_F _))) -> 60 
  C_C (C_C (C_A) _) (C_E ((C_F _,C_F _))) -> 61 
  C_C (C_C _ (C_E _)) (C_F (C_A)) -> 62 
  C_C (C_C (C_A) (C_F _)) _ -> 63 
  C_C (C_C _ _) C_D -> 64 
  C_C _ (C_F (C_A)) -> 65 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_E _,C_D))) -> 66 
  C_C (C_C (C_A) C_D) (C_F (C_C _ _)) -> 67 
  C_C (C_C _ C_D) (C_E ((C_D,C_E _))) -> 68 
  C_C (C_C _ C_D) (C_F (C_B _)) -> 69 
  C_C (C_C (C_A) _) (C_E ((C_E _,C_D))) -> 70 
  C_C (C_B C_D) (C_E ((C_F _,C_D))) -> 71 
  C_C _ (C_E ((C_E _,C_D))) -> 72 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_F _,C_F _))) -> 73 
  C_C (C_C (C_B _) (C_E _)) C_D -> 74 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_F _,C_E _))) -> 75 
  C_C (C_C (C_C _ _) (C_E _)) (C_F (C_A)) -> 76 
  C_C (C_C (C_B _) _) (C_F (C_B _)) -> 77 
  C_C (C_B (C_E _)) (C_F (C_C _ _)) -> 78 
  C_C (C_C (C_A) (C_E _)) (C_E ((C_E _,C_D))) -> 79 
  C_C (C_C (C_A) _) _ -> 80 
  C_C (C_C _ (C_F _)) (C_E ((C_E _,C_F _))) -> 81 
  C_C _ (C_F (C_B _)) -> 82 
  C_C (C_C (C_A) C_D) _ -> 83 
  C_C (C_C (C_A) _) (C_F (C_C _ _)) -> 84 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_E _,C_F _))) -> 85 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_D,C_D))) -> 86 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_D,C_D))) -> 87 
  C_C (C_B _) (C_E ((C_E _,C_F _))) -> 88 
  C_C (C_C (C_A) (C_F _)) (C_F (C_B _)) -> 89 
  C_C (C_C _ (C_E _)) (C_E ((C_E _,C_D))) -> 90 
  C_C (C_B _) C_D -> 91 
  C_C (C_C _ (C_F _)) (C_F (C_C _ _)) -> 92 
  C_C (C_A) (C_E ((C_F _,C_E _))) -> 93 
  C_C (C_C (C_B _) _) C_D -> 94 
  C_C (C_B (C_E _)) (C_E ((C_F _,C_E _))) -> 95 
  C_C (C_C (C_B _) _) (C_E _) -> 96 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_D,C_F _))) -> 97 
  C_C _ (C_E ((C_E _,C_E _))) -> 98 
  C_C (C_C _ C_D) (C_E ((C_F _,C_F _))) -> 99 
  C_C (C_B C_D) (C_F (C_B _)) -> 100 
  C_C (C_C (C_A) _) (C_E ((C_D,C_F _))) -> 101 
  C_C (C_C _ (C_E _)) (C_F _) -> 102 
  C_C (C_C _ (C_F _)) (C_E ((C_E _,C_D))) -> 103 
  C_C (C_C (C_B _) C_D) (C_E ((C_F _,C_D))) -> 104 
  C_C (C_C _ C_D) (C_E _) -> 105 
  C_C (C_B (C_E _)) (C_E ((C_D,C_D))) -> 106 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_E _,C_E _))) -> 107 
  C_C (C_A) (C_E ((C_F _,C_D))) -> 108 
  C_C (C_C (C_B _) (C_E _)) (C_F (C_C _ _)) -> 109 
  C_C (C_C _ _) (C_E ((C_D,C_D))) -> 110 
  C_C (C_B _) (C_F (C_C _ _)) -> 111 
  C_C (C_C (C_A) C_D) (C_F _) -> 112 
  C_C (C_C _ (C_E _)) _ -> 113 
  C_C (C_C _ _) (C_E ((C_F _,C_D))) -> 114 
  C_C (C_C (C_A) (C_E _)) (C_F (C_A)) -> 115 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_D,C_E _))) -> 116 
  C_C _ (C_F (C_C _ _)) -> 117 
  C_C (C_C _ C_D) (C_E ((C_E _,C_F _))) -> 118 
  C_C (C_C _ C_D) C_D -> 119 
  C_C (C_B C_D) (C_E ((C_D,C_F _))) -> 120 
  C_C (C_C _ C_D) _ -> 121 
  C_C (C_C (C_C _ _) _) (C_E ((C_F _,C_F _))) -> 122 
  C_C (C_B C_D) (C_F _) -> 123 
  C_C (C_C (C_C _ _) (C_F _)) (C_E ((C_D,C_E _))) -> 124 
  C_C (C_B (C_E _)) (C_F _) -> 125 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_F _,C_D))) -> 126 
  C_C (C_C (C_B _) _) (C_E ((C_F _,C_E _))) -> 127 
  C_C (C_C (C_B _) (C_F _)) C_D -> 128 
  C_C (C_C (C_C _ _) _) (C_F (C_A)) -> 129 
  C_C (C_C (C_B _) (C_F _)) (C_F (C_A)) -> 130 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_E _,C_F _))) -> 131 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_E _,C_F _))) -> 132 
  C_C (C_C (C_B _) _) (C_E ((C_E _,C_E _))) -> 133 
  C_C (C_C (C_C _ _) _) (C_E ((C_D,C_E _))) -> 134 
  C_C (C_C (C_C _ _) C_D) (C_F (C_A)) -> 135 
  C_C (C_C (C_C _ _) (C_E _)) (C_E ((C_E _,C_E _))) -> 136 
  C_C (C_C (C_B _) (C_E _)) (C_F (C_A)) -> 137 
  C_C (C_C (C_A) (C_F _)) (C_E ((C_E _,C_D))) -> 138 
  C_C (C_C (C_A) (C_E _)) (C_F (C_B _)) -> 139 
  C_C (C_C _ (C_E _)) (C_E ((C_D,C_D))) -> 140 
  C_C (C_B (C_F _)) C_D -> 141 
  C_C (C_C (C_B _) (C_E _)) (C_E ((C_D,C_E _))) -> 142 
  C_C (C_C (C_B _) (C_F _)) (C_E ((C_D,C_F _))) -> 143 
  C_C (C_C (C_B _) (C_E _)) _ -> 144 
