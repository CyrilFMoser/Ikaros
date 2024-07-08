module Program_30 () where 

 main = print $ show v_b
data B_B a = C_C | C_D a (((Int,Int),B_A)) | C_E Bool B_A | C_F B_A
data B_A = C_A (B_B B_A) | C_B ((B_A,(Int,Bool)))

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_A _) -> 0 
