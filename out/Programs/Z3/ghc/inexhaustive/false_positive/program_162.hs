module Program_10 () where 

 main = print $ show v_b
data B_A a b = C_A ((Int,Char)) | C_B Char | C_C (B_A a a)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((_,_)) -> 0 
  C_C (C_C _) -> 1 
