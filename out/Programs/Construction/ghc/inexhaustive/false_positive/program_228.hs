module Program_12 () where 

 main = print $ show v_b
data B_C d e = C_E d B_D | C_F | C_G (B_A d B_D) (B_C e e)
data B_D = C_H
data B_B c = C_C c | C_D
data B_A a b = C_A B_D (B_A a b) | C_B

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
