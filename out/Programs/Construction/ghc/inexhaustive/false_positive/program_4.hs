module Program_12 () where 

 main = print $ show v_b
data B_B b = C_B | C_C (B_D b b) | C_D (B_A b) b | C_E
data B_A a = C_A
data B_D c d = C_K (B_B c) (B_A c) | C_L (B_B c) (B_D c d) | C_M (B_A d) | C_N c
data B_C = C_F (B_B B_C) Int | C_G (B_A B_C) B_C | C_H (B_D B_C B_C) | C_I | C_J (B_B B_C)

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (C_K (C_B) _) -> 1 
  C_C (C_K (C_C _) _) -> 2 
  C_C (C_K (C_D _ _) _) -> 3 
  C_C (C_L (C_B) _) -> 4 
  C_C (C_L (C_C _) _) -> 5 
  C_C (C_L (C_D _ _) _) -> 6 
  C_C (C_L (C_E) _) -> 7 
  C_C (C_M _) -> 8 
  C_C (C_N _) -> 9 
  C_D (C_A) _ -> 10 
  C_E -> 11 
