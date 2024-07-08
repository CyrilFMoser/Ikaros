module Program_31 () where 

 main = print $ show v_b
data B_A = C_A B_C | C_B | C_C (B_B B_A) | C_D B_A | C_E (B_B B_C)
data B_B a = C_F a | C_G | C_H B_C a
data B_C = C_I | C_J | C_K B_A B_A | C_L B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C (C_F _) -> 2 
  C_C (C_G) -> 3 
  C_C (C_H _ _) -> 4 
  C_D _ -> 5 
  C_E (C_F C_I) -> 6 
  C_E (C_F C_J) -> 7 
  C_E (C_F (C_K _ _)) -> 8 
  C_E (C_F (C_L _)) -> 9 
  C_E (C_G) -> 10 
