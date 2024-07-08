module Program_16 () where 

 main = print $ show v_b
data B_D = C_G
data B_B b = C_D b B_D
data B_A a = C_A (((Bool,Int),B_D)) a | C_B | C_C (((Bool,Bool),B_D)) (B_A a)
data B_C c d = C_E | C_F B_D B_D

v_a :: B_C Int B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
