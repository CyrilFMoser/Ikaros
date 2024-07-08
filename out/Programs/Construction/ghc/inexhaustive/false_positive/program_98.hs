module Program_10 () where 

 main = print $ show v_b
data B_B b = C_E | C_F
data B_C c = C_G (B_B c) | C_H
data B_D d e = C_I | C_J (B_C d) Bool
data B_A a = C_A | C_B | C_C a | C_D (B_B a)

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
