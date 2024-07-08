module Program_23 () where 

 main = print $ show v_b
data B_C e f = C_F (B_A f e) | C_G (B_A f f) f
data B_B c d = C_C | C_D (B_D c c) | C_E ((Char,Char)) (B_A c d)
data B_D g h = C_H (B_C h g) | C_I | C_J | C_K (B_C h h)
data B_A a b = C_A ((Int,Int)) (B_B b b) | C_B

v_a :: B_C Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
