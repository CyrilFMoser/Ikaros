module Program_2 () where 

 main = print $ show v_b
data B_A = C_A (B_C B_A B_A) | C_B (B_C B_A Int) Int | C_C (B_C B_A B_A) | C_D Int | C_E
data B_B a b = C_F a (B_C b b) | C_G ((B_A,(Int,Char))) (((Char,Char),(Int,Int))) | C_H b | C_I Bool
data B_C c d = C_J ((B_A,B_A)) | C_K ((B_A,(Char,Bool)))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_J ((_,_))) _ -> 1 
  C_B (C_K _) _ -> 2 
  C_C (C_K _) -> 3 
  C_D _ -> 4 
  C_E -> 5 
