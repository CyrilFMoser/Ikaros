module Program_31 () where 

 main = print $ show v_b
data B_B c = C_D (B_A c c) | C_E ((Int,Bool)) | C_F c | C_G (B_B c) (B_A c Bool) | C_H (B_B c)
data B_C d e = C_I | C_J Int Bool | C_K | C_L | C_M ((Char,Int))
data B_D f g = C_N f (B_D g g) | C_O | C_P | C_Q | C_R f
data B_A a b = C_A | C_B | C_C

v_a :: B_D Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_N _ _ -> 0 
  C_P -> 1 
  C_Q -> 2 
  C_R _ -> 3 
