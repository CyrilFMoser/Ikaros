module Program_30 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B ((Char,Int)) (B_A b b)
data B_B c d = C_C | C_D (B_B d d) c | C_E | C_F (B_B c d) ((Bool,Int))

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
