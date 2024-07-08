module Program_24 () where 

 main = print $ show v_b
data B_A = C_A ((B_B,B_B)) (((Char,Int),B_A)) | C_B (((Char,Int),Char)) | C_C ((B_B,B_B)) | C_D Bool | C_E B_B B_B
data B_B = C_F (((Char,Int),Char)) (B_C B_A)
data B_C a = C_G | C_H B_A a

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (((_,_),_)) -> 1 
  C_D _ -> 2 
  C_E _ _ -> 3 
