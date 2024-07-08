module Program_19 () where 

 main = print $ show v_b
data B_B c d = C_C
data B_A a b = C_A b (B_B a b) | C_B

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
