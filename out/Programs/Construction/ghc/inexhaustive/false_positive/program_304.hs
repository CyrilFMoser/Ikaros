module Program_23 () where 

 main = print $ show v_b
data B_A a = C_A ((Bool,Char)) | C_B a | C_C
data B_B b c = C_D ((Bool,Int)) | C_E Char | C_F (B_B b b) | C_G (B_A c) (B_D b)
data B_D e = C_K (B_C e) (B_D e)
data B_C d = C_H (B_D Char) | C_I (B_C d) | C_J d (B_A Char)

v_a :: B_D Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_K _ _ -> 0 
