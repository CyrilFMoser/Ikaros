module Program_1 () where 

 main = print $ show v_b
data B_B a = C_B (B_D a a) | C_C (B_B a) (((Int,Int),B_A)) | C_D (B_D a a)
data B_D d e = C_J | C_K B_A | C_L | C_M Int
data B_A = C_A
data B_C b c = C_E | C_F | C_G Int Char | C_H | C_I Char

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_D _ -> 1 
