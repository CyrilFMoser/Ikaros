module Program_4 () where 

 main = print $ show v_b
data B_C d = C_G
data B_A a = C_A (B_C a) (B_B a a) | C_B ((Char,(Char,Bool)))
data B_B b c = C_C (B_C Char) Int | C_D ((Char,Bool)) | C_E (B_C c) | C_F

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
