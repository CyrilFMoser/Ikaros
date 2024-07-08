module Program_9 () where 

 main = print $ show v_b
data B_A a = C_A (((Int,Char),B_C)) B_B | C_B B_C
data B_C = C_H | C_I | C_J B_B | C_K (B_D B_C Char)
data B_B = C_C ((B_C,Int)) B_B | C_D (B_D B_B Bool) ((B_B,(Char,Char))) | C_E | C_F | C_G Int B_C
data B_D b c = C_L b | C_M B_B (B_A c) | C_N (B_D c c)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H -> 0 
  C_I -> 1 
  C_J _ -> 2 
