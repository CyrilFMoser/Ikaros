module Program_25 () where 

 main = print $ show v_b
data B_D e = C_G (B_C e) (((Int,Bool),Char)) | C_H (B_D e) | C_I Bool
data B_B b c = C_E (((Char,Char),Bool)) c
data B_A a = C_A | C_B a (((Int,Bool),(Int,Bool))) | C_C | C_D (B_C a) (B_B a a)
data B_C d = C_F (B_B d d)

v_a :: B_D Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H (C_H _) -> 1 
  C_H (C_I _) -> 2 
  C_I _ -> 3 
