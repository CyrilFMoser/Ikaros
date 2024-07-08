module Program_4 () where 

 main = print $ show v_b
data B_A a b = C_A
data B_B c d = C_B | C_C ((Char,(Int,Bool))) ((Int,Int)) | C_D | C_E d (B_B c d)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
