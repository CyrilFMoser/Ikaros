module Program_15 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (((Char,Int),B_B)) (B_A B_B)
data B_B = C_C Int | C_D | C_E | C_F B_B (B_A B_B)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ _ -> 1 
