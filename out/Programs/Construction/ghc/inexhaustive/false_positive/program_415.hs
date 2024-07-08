module Program_9 () where 

 main = print $ show v_b
data B_B c d = C_F | C_G d (B_C d c) | C_H (B_C c c)
data B_A a b = C_A (B_C a Int) (B_C b a) | C_B | C_C (B_C b a) (B_C a Bool) | C_D | C_E a
data B_C e f = C_I | C_J Char | C_K e (B_C e e) | C_L ((Bool,Bool)) | C_M f

v_a :: B_B Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H _ -> 1 
