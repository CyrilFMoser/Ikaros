module Program_8 () where 

 main = print $ show v_b
data B_A = C_A Char | C_B B_A | C_C (B_B B_A) | C_D
data B_B a = C_E Bool | C_F B_A (B_B a) | C_G B_A a

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_F (C_C _) (C_E _)) -> 0 
