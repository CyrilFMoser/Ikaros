module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A a b) (((Char,Int),(Bool,Char))) | C_C ((Int,Int)) | C_D

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ _ -> 1 
  C_C ((_,_)) -> 2 
  C_D -> 3 
