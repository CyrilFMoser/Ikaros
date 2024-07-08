module Program_0 () where 

 main = print $ show v_b
data B_C b = C_E | C_F (B_C b)
data B_A = C_A ((B_A,B_A)) (B_B B_A) | C_B (B_B Int) (B_D ((Char,Int)) ((Int,Char)))
data B_B a = C_C a | C_D Int
data B_D c d = C_G B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
