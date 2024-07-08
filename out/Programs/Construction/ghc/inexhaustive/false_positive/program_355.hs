module Program_11 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B B_B | C_C Bool b
data B_B = C_D
data B_C c d = C_E

v_a :: B_C Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
