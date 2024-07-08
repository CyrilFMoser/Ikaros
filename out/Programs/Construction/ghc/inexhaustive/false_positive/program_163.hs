module Program_11 () where 

 main = print $ show v_b
data B_B b c = C_B | C_C ((Char,Char)) Bool | C_D ((Char,Int)) | C_E (B_B c c)
data B_C d e = C_F | C_G | C_H (B_C d d) d | C_I
data B_A a = C_A

v_a :: B_C Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G -> 1 
  C_I -> 2 
