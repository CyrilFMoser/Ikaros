module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A B_D | C_B Int | C_C | C_D | C_E (B_B a) ((B_D,Int))
data B_D = C_M (B_B ((Int,Bool))) B_D
data B_B c = C_F | C_G c B_D
data B_C d e = C_H e | C_I | C_J (B_C e e) e | C_K | C_L ((B_D,B_D))

v_a :: B_C Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ -> 0 
  C_I -> 1 
  C_J _ _ -> 2 
  C_K -> 3 
