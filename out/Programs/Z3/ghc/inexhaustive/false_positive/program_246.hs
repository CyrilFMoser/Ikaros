module Program_29 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) ((Int,Int)) | C_B | C_C (B_A Int) | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_A (C_A _ _) _) -> 0 
  C_C (C_A (C_C _) _) -> 1 
  C_C (C_C (C_D)) -> 2 
  C_C (C_D) -> 3 
  C_C (C_A (C_D) _) -> 4 
