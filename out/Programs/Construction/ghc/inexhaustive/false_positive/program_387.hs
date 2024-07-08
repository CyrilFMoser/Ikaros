module Program_11 () where 

 main = print $ show v_b
data B_A = C_A (B_C ((Char,Bool))) | C_B | C_C
data B_C a = C_E | C_F Bool B_B | C_G B_B a
data B_B = C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_E) -> 0 
  C_A (C_F _ _) -> 1 
  C_B -> 2 
  C_C -> 3 
