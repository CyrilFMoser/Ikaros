module Program_20 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B | C_C (((Char,Bool),B_B)) | C_D
data B_B = C_E | C_F

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_A (C_A C_D) -> 1 
  C_A (C_A _) -> 2 
