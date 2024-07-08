module Program_19 () where 

 main = print $ show v_b
data B_A a b = C_A
data B_B c = C_B (B_B c) c

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
