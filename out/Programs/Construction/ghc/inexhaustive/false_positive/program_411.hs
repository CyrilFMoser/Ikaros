module Program_5 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) | C_B (B_C b) (B_A b b) | C_C (B_A B_D b) (B_C a)
data B_C e = C_E (B_B e e) (B_C e) | C_F | C_G (B_B e e)
data B_B c d = C_D (B_A d c)
data B_D = C_H Char ((B_D,B_D)) | C_I | C_J | C_K Bool B_D

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ _ -> 0 
  C_I -> 1 
  C_J -> 2 
