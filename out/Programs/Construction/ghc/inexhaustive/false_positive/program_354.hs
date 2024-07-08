module Program_10 () where 

 main = print $ show v_b
data B_C e f = C_I f f | C_J (B_D f) (B_B f f)
data B_D g = C_K ((Char,(Int,Bool))) | C_L ((Bool,Char)) (((Bool,Bool),Bool)) | C_M
data B_B c d = C_E | C_F Int | C_G (B_B d d) ((Int,Bool)) | C_H
data B_A a b = C_A | C_B (B_C Int b) | C_C | C_D ((Bool,Bool)) (B_B a b)

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F _ -> 1 
  C_G _ _ -> 2 
