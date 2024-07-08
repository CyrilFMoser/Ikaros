module Program_0 () where 

 main = print $ show v_b
data B_A a = C_A Char | C_B (B_A Int) a | C_C (B_A a) a

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
