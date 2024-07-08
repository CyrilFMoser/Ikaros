module Program_18 () where 

 main = print $ show v_b
data B_B a = C_D B_A
data B_A = C_A | C_B (B_B Bool) (((Int,Bool),B_A)) | C_C ((B_A,(Char,Char))) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C ((C_A,(_,_))) _ -> 1 
  C_C ((C_B _ _,(_,_))) _ -> 2 
  C_C ((C_C _ _,(_,_))) _ -> 3 
