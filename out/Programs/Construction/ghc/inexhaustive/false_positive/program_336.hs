module Program_23 () where 

 main = print $ show v_b
data B_A a = C_A
data B_C = C_E
data B_B b c = C_B (B_A c) b | C_C b (B_B c c) | C_D (B_B B_C B_C) ((B_C,Int))

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
