module Program_17 () where 

 main = print $ show v_b
data B_C c = C_F (B_C c) c | C_G c (B_B c c)
data B_A = C_A Bool
data B_B a b = C_B | C_C (B_C B_A) | C_D a (B_C a) | C_E

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
