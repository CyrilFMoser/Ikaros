module Program_8 () where 

 main = print $ show v_b
data B_A a = C_A B_B a | C_B
data B_B = C_C Char | C_D

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
