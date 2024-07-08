module Program_6 () where 

 main = print $ show v_b
data B_C c = C_G
data B_A = C_A
data B_B a b = C_B | C_C B_A | C_D | C_E (B_C a) | C_F

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
