module Program_16 () where 

 main = print $ show v_b
data B_A a = C_A ((Char,Char)) (((Int,Int),Int)) | C_B (B_C a) (B_A a) | C_C | C_D | C_E ((Bool,Bool))
data B_B b c = C_F Bool (B_A b) | C_G | C_H (B_A b) | C_I (B_B b b)
data B_C d = C_J d ((Char,Char)) | C_K | C_L (((Bool,Char),Int)) d | C_M (B_A d) (B_C d) | C_N

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ _ -> 0 
  C_K -> 1 
  C_L _ _ -> 2 
  C_M _ _ -> 3 
