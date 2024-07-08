module Program_27 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B a b) ((Bool,Char)) | C_B (B_C b) (B_A b b) | C_C a | C_D | C_E (B_B a b) (B_A Bool Bool)
data B_C e = C_J | C_K ((Int,Int)) ((Bool,Char)) | C_L | C_M
data B_B c d = C_F Int | C_G | C_H (B_A d c) d | C_I (B_C Bool)

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J -> 0 
  C_L -> 1 
  C_M -> 2 
