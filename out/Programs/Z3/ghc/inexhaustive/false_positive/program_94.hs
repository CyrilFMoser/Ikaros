module Program_8 () where 

 main = print $ show v_b
data B_B = C_E Char (B_A B_B) | C_F | C_G B_B B_B
data B_A a = C_A | C_B | C_C B_B | C_D

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C (C_G (C_G _ _) (C_G _ _)) -> 1 
  C_C (C_G _ (C_G _ _)) -> 2 
  C_C (C_G C_F _) -> 3 
  C_C (C_G _ _) -> 4 
  C_C (C_G (C_G _ _) C_F) -> 5 
