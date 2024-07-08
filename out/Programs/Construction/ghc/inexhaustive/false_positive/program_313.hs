module Program_31 () where 

 main = print $ show v_b
data B_B c = C_D ((Int,Int)) (B_B c) | C_E (B_A c c) ((Char,Char)) | C_F c | C_G (B_D c c) | C_H (B_B c)
data B_C d e = C_I
data B_A a b = C_A Int a | C_B (B_B a) (B_A a b) | C_C (B_C a b)
data B_D f g = C_J

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E _ _ -> 1 
  C_F _ -> 2 
  C_G _ -> 3 
