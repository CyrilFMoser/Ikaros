module Program_8 () where 

 main = print $ show v_b
data B_A a = C_A | C_B a ((Int,Int)) | C_C ((Bool,Char))

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ ((_,_)) -> 0 
