module Program_27 () where 

 main = print $ show v_b
data B_B c = C_F | C_G c ((B_C,B_C)) | C_H (((Int,Bool),B_C)) | C_I | C_J B_C ((B_C,B_C))
data B_D d = C_L (B_A d d) | C_M Char | C_N B_C | C_O | C_P
data B_C = C_K ((Char,B_C)) Bool
data B_A a b = C_A | C_B B_C | C_C | C_D b | C_E

v_a :: B_D Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_L _ -> 0 
  C_M _ -> 1 
  C_N _ -> 2 
  C_P -> 3 
