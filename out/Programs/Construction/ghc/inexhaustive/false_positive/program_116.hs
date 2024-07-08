module Program_27 () where 

 main = print $ show v_b
data B_B b c = C_F (B_C Int Int)
data B_C d e = C_G Bool Int | C_H (B_A d) Bool | C_I | C_J
data B_D f g = C_K ((Int,Int)) | C_L | C_M f (B_C g g) | C_N ((Int,Int)) | C_O Char f
data B_A a = C_A ((Bool,Bool)) | C_B (B_C a a) | C_C | C_D | C_E

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C -> 1 
  C_D -> 2 
  C_E -> 3 
