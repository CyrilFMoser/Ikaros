module Program_12 () where 

 main = print $ show v_b
data B_C = C_G | C_H (B_B ((Bool,Int)) B_C) ((B_C,B_C))
data B_A a b = C_A ((Char,B_C)) (B_B b b) | C_B ((Bool,B_C)) | C_C B_C
data B_B c d = C_D | C_E | C_F (B_A d d) (B_A B_C c)

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_F _ _ -> 1 
