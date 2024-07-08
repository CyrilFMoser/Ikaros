module Program_25 () where 

 main = print $ show v_b
data B_B c = C_C | C_D c | C_E (B_A c c) | C_F (B_A c c) | C_G c
data B_A a b = C_A a | C_B (B_A a a) Int

v_a :: B_A Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
