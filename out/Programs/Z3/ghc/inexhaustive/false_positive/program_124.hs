module Program_6 () where 

 main = print $ show v_b
data B_B = C_C Char | C_D
data B_A a = C_A B_B a | C_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A C_D _ -> 0 
