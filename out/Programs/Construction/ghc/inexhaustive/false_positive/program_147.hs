module Program_26 () where 

 main = print $ show v_b
data B_B c d = C_D ((Char,Int)) | C_E
data B_C e f = C_F (((Int,Int),Int)) | C_G
data B_A a b = C_A (B_A Char b) | C_B | C_C ((Bool,Bool))

v_a :: B_C Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
