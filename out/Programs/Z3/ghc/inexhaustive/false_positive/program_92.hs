module Program_6 () where 

 main = print $ show v_b
data B_A a = C_A | C_B | C_C B_B | C_D
data B_B = C_E Char (B_A B_B) | C_F | C_G B_B B_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_D -> 1 
  C_C (C_G C_F (C_E _ _)) -> 2 
  C_C (C_E _ _) -> 3 
  C_C (C_G (C_E _ _) C_F) -> 4 
  C_C (C_G (C_G _ _) _) -> 5 
  C_C (C_G (C_E _ _) _) -> 6 
  C_C (C_G (C_G _ _) (C_E _ _)) -> 7 
  C_C (C_E _ (C_B)) -> 8 
  C_C (C_G C_F C_F) -> 9 
  C_C (C_G C_F (C_G _ _)) -> 10 
