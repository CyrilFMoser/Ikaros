module Program_4 () where 

 main = print $ show v_b
data B_C c d = C_G d | C_H c ((B_B,Int)) | C_I | C_J
data B_D = C_K B_D (B_C B_D B_B) | C_L
data B_A a b = C_A | C_B Bool | C_C a B_B | C_D (B_C b b)
data B_B = C_E B_D | C_F

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_L -> 0 
