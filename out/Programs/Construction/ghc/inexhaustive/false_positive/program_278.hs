module Program_29 () where 

 main = print $ show v_b
data B_A a = C_A ((Bool,Int)) a | C_B | C_C
data B_B b c = C_D | C_E b c | C_F | C_G
data B_C d e = C_H d | C_I (B_C d d) | C_J Char | C_K (((Bool,Char),Bool))

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
