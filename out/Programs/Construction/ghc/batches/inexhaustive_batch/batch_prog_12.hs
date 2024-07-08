module Program_12 () where 

 main = print $ show v_b
data B_B b c = C_F b | C_G
data B_C = C_H | C_I | C_J
data B_A a = C_A Int (B_A a) | C_B | C_C B_C (((Bool,Int),B_C)) | C_D | C_E a

v_a :: B_B Char B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
