module Program_24 () where 

 main = print $ show v_b
data B_B b c = C_F | C_G (B_B b b) (B_B b b) | C_H (B_A b) (B_B c c)
data B_A a = C_A ((Int,Int)) | C_B (B_B a Bool) | C_C (B_B Int Int) a | C_D (B_A a) (B_B Char a) | C_E (B_A a) Char

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_H _ _ -> 1 
