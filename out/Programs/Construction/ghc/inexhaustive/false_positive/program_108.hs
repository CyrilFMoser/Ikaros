module Program_2 () where 

 main = print $ show v_b
data B_C = C_G B_A | C_H (B_B B_A B_C) B_A
data B_B a b = C_C | C_D (B_B a a) | C_E B_C | C_F
data B_A = C_A | C_B (B_B Int ((Bool,Int)))

v_a :: B_B Char B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D (C_D _) -> 1 
  C_D (C_E _) -> 2 
  C_D (C_F) -> 3 
  C_E (C_G C_A) -> 4 
  C_E (C_G (C_B _)) -> 5 
  C_E (C_H _ _) -> 6 
  C_F -> 7 
