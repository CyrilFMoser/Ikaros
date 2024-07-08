module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) (B_A a a) | C_B (B_A a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
