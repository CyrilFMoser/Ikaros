module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A ((Bool,Char)) | C_B | C_C ((Int,Int)) | C_D
data B_C e = C_J (B_D e) | C_K ((Int,Char)) | C_L e | C_M | C_N
data B_D f = C_O | C_P (B_D f) | C_Q (B_D f) (B_B f f) | C_R (B_D f)
data B_B c d = C_E (B_B c c) d | C_F | C_G (B_D c) | C_H ((Bool,Bool)) (B_D d) | C_I (B_A c Char) (B_B c ((Int,Char)))

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
  C_K ((_,_)) -> 1 
  C_L 'x' -> 2 
  C_L _ -> 3 
  C_M -> 4 
