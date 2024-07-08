module Program_9 () where 

 main = print $ show v_b
data B_B = C_E Char (B_A B_B) | C_F | C_G B_B B_B
data B_A a = C_A | C_B | C_C B_B | C_D

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_E _ (C_C _)) -> 0 
  C_C (C_G (C_E _ _) (C_G _ _)) -> 1 
