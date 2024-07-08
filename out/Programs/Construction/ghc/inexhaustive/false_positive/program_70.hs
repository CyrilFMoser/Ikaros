module Program_14 () where 

 main = print $ show v_b
data B_B c d = C_B (B_B Char d) d | C_C (B_B c c) ((Int,Bool)) | C_D (B_B d d) | C_E ((Char,Char)) (B_B Int Int) | C_F (B_B c c) d
data B_C e f = C_G f
data B_A a b = C_A (B_B a a)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
