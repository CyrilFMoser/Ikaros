module Program_7 () where 

 main = print $ show v_b
data B_A a = C_A a (B_A Bool) | C_B | C_C (B_B a) a
data B_B b = C_D Bool | C_E

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
