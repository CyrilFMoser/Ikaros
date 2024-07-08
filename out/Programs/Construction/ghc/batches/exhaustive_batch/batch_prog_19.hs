module Program_19 () where 

 main = print $ show v_b
data B_C = C_E | C_F Int | C_G (B_B Int) (B_A B_C)
data B_A a = C_A (B_B a) a
data B_B b = C_B (B_A b) | C_C B_C | C_D

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B _) True -> 0 
  C_A (C_B _) False -> 1 
  C_A (C_C C_E) True -> 2 
  C_A (C_C C_E) False -> 3 
  C_A (C_C (C_F _)) True -> 4 
  C_A (C_C (C_F _)) False -> 5 
  C_A (C_C (C_G _ _)) True -> 6 
  C_A (C_C (C_G _ _)) False -> 7 
  C_A (C_D) True -> 8 
  C_A (C_D) False -> 9 
