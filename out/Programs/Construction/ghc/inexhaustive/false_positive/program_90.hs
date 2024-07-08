module Program_4 () where 

 main = print $ show v_b
data B_B c = C_F | C_G (B_A c c) | C_H (B_B Char) c | C_I (B_B c) c
data B_A a b = C_A (B_A a a) ((Char,Int)) | C_B Bool (B_B a) | C_C ((Int,(Bool,Char))) b | C_D (B_B a) ((Char,Bool)) | C_E (B_A a a) (B_B b)

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G _ -> 1 
  C_H _ _ -> 2 
