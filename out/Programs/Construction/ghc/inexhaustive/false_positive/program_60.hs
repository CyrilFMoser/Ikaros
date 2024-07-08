module Program_6 () where 

 main = print $ show v_b
data B_C d e = C_G d | C_H d | C_I | C_J (B_C e e) e | C_K d
data B_B b c = C_F ((Int,Bool))
data B_D f = C_L | C_M f
data B_A a = C_A ((Int,Bool)) | C_B (B_A a) | C_C | C_D (B_A ((Int,Bool))) ((Bool,Int)) | C_E (B_C a a) Bool

v_a :: B_C Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ -> 0 
  C_I -> 1 
  C_J _ _ -> 2 
  C_K _ -> 3 
