module Program_12 () where 

 main = print $ show v_b
data B_B c = C_E (B_A Bool c) | C_F
data B_A a b = C_A (B_B a) Int | C_B | C_C | C_D

v_a :: B_A Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_E (C_C)) _ -> 0 
