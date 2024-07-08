module Program_17 () where 

 main = print $ show v_b
data B_C d = C_G | C_H (B_D d d) (B_B d d) | C_I (B_D d d) d | C_J (B_D d Bool) | C_K d (((Int,Bool),Int))
data B_A a = C_A (B_B a a) a | C_B (B_A Int) a | C_C (B_D a a) (B_C a) | C_D | C_E
data B_B b c = C_F Bool (B_A c)
data B_D e f = C_L (B_B f e) (B_B ((Int,Char)) f)

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H _ (C_F _ _) -> 1 
  C_I _ _ -> 2 
  C_J _ -> 3 
