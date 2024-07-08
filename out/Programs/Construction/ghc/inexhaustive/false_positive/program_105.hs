module Program_17 () where 

 main = print $ show v_b
data B_A a b = C_A ((Int,(Char,Char))) | C_B | C_C (B_B b b) ((Char,Int)) | C_D a
data B_B c d = C_E (B_A d d) ((Char,Char)) | C_F (B_B c d) | C_G (B_A c c)

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C _ (('x',_)) -> 1 
  C_C _ ((_,_)) -> 2 
  C_D _ -> 3 
