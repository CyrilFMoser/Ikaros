module Program_31 () where 

 main = print $ show v_b
data B_A a = C_A | C_B a | C_C Bool | C_D
data B_B = C_E | C_F

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
