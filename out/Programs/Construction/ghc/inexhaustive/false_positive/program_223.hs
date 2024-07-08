module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A (((Bool,Char),B_C)) | C_B B_D | C_C | C_D (B_A a a) | C_E
data B_D = C_L | C_M
data B_B c d = C_F d
data B_C = C_G ((Char,(Int,Bool))) | C_H | C_I (B_B B_C B_D) | C_J | C_K (B_B ((Bool,Bool)) B_D) B_D

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_H -> 1 
  C_I _ -> 2 
  C_J -> 3 
  C_K (C_F _) C_M -> 4 
