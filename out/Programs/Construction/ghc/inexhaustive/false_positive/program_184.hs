module Program_30 () where 

 main = print $ show v_b
data B_B c d = C_B (B_C c) (B_B d d) | C_C (B_B d Char) (B_A d c) | C_D Int ((Int,Bool))
data B_C e = C_E e (B_B e e) | C_F
data B_A a b = C_A (B_C a)

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
