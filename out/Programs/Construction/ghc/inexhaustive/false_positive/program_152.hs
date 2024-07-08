module Program_30 () where 

 main = print $ show v_b
data B_D f g = C_K | C_L f (B_D f f) | C_M (B_B Bool) ((Char,Bool)) | C_N f
data B_A a b = C_A b ((Bool,Bool)) | C_B | C_C | C_D a b | C_E ((Char,Bool))
data B_B c = C_F (((Char,Int),Char)) | C_G (B_A c c) c | C_H
data B_C d e = C_I | C_J (B_A d Bool) (B_D d e)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C -> 2 
  C_E _ -> 3 
