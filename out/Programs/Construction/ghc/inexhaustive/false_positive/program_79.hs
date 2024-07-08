module Program_22 () where 

 main = print $ show v_b
data B_C = C_H (((Int,Bool),(Bool,Int)))
data B_B a b = C_D | C_E b B_C | C_F ((B_A,B_A)) | C_G
data B_D c d = C_I | C_J ((Int,B_C)) d | C_K Bool ((Int,B_A)) | C_L d c
data B_A = C_A B_C | C_B (B_B B_C B_A) B_A | C_C Char ((B_C,B_A))

v_a :: B_B Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E _ (C_H _) -> 1 
  C_G -> 2 
