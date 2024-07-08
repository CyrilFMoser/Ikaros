module Program_7 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a)
data B_B = C_B | C_C | C_D B_B | C_E | C_F

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
