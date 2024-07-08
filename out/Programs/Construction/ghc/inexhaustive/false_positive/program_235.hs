module Program_19 () where 

 main = print $ show v_b
data B_A a = C_A
data B_B b = C_B Bool | C_C

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
