module Program_7 () where 

 main = print $ show v_b
data B_A a = C_A | C_B | C_C B_B | C_D
data B_B = C_E Char (B_A B_B) | C_F | C_G B_B B_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_G _ (C_E _ _)) -> 0 
  C_C (C_G _ C_F) -> 1 
  C_C (C_E _ (C_D)) -> 2 
  C_C C_F -> 3 
  C_C _ -> 4 
  C_C (C_G (C_E _ _) (C_E _ _)) -> 5 
  C_C (C_E _ (C_A)) -> 6 
