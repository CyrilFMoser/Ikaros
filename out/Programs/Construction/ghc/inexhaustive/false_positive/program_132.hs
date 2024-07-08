module Program_12 () where 

 main = print $ show v_b
data B_B = C_D B_B | C_E | C_F Int
data B_A a b = C_A (B_A b b) | C_B | C_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_E -> 1 
