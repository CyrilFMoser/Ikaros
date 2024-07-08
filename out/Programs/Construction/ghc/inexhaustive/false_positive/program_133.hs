module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A (B_C a a) | C_B (B_C a a) (B_B a b) | C_C
data B_B c d = C_D
data B_D g = C_G (B_B g g) | C_H ((Char,(Int,Char))) | C_I Char g | C_J Char ((Int,Bool)) | C_K ((Bool,Char)) (B_D g)
data B_C e f = C_E | C_F

v_a :: B_B Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
