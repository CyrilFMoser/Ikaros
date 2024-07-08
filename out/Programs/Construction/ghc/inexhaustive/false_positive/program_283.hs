module Program_5 () where 

 main = print $ show v_b
data B_B = C_B (B_A B_B)
data B_A a = C_A

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
