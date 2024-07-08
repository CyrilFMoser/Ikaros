module Program_6 () where 

 main = print $ show v_b
data B_B b c = C_F b (B_A c) | C_G (B_C b) Bool | C_H | C_I (B_C c)
data B_A a = C_A | C_B (B_B a a) | C_C | C_D (((Char,Bool),Int)) | C_E (B_A a)
data B_C d = C_J (B_C d) ((Char,Char)) | C_K d d

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_K _ _ -> 0 
