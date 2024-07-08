module Program_5 () where 

 main = print $ show v_b
data B_B a = C_E Bool | C_F B_A (B_B a) | C_G B_A a
data B_A = C_A Char | C_B B_A | C_C (B_B B_A) | C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B (C_A _)) -> 0 
  C_B (C_A _) -> 1 
  C_C (C_F C_D (C_G _ _)) -> 2 
