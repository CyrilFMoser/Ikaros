module Program_12 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A
data B_B a b = C_C (B_B a b) | C_D | C_E | C_F a (((Int,Char),B_A))
data B_C c d = C_G c (B_B d c) | C_H (B_C c B_A) c

v_a :: B_C Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ _ -> 0 
