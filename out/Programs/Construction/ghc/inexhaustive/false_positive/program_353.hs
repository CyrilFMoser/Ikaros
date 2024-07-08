module Program_1 () where 

 main = print $ show v_b
data B_A a = C_A a
data B_B b c = C_B (B_C c) | C_C | C_D
data B_C d = C_E

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
