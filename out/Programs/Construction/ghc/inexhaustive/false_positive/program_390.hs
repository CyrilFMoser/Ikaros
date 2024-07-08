module Program_14 () where 

 main = print $ show v_b
data B_B c = C_E Bool c | C_F (B_C c c) (B_A c c) | C_G ((Char,Char)) | C_H (((Bool,Int),Char))
data B_C d e = C_I (B_A d e) | C_J | C_K | C_L e | C_M Bool ((Bool,Char))
data B_A a b = C_A (((Bool,Int),Int)) | C_B | C_C a | C_D Char

v_a :: B_C Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ -> 0 
  C_J -> 1 
  C_K -> 2 
  C_M _ _ -> 3 
