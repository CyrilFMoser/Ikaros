module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A (((Int,Char),(Int,Int)))
data B_B = C_B (B_C B_D B_D) (B_C ((Char,Int)) B_B)
data B_D = C_H Bool | C_I B_D ((Char,B_B))
data B_C c d = C_C ((B_B,Int)) | C_D Char B_B | C_E | C_F | C_G

v_a :: B_C Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_D _ _ -> 1 
  C_E -> 2 
  C_G -> 3 
