module Program_3 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B b)
data B_B c = C_B | C_C
data B_C = C_D (B_B B_C) | C_E

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
