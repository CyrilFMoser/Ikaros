module Program_3 () where 

main = print $ show v_b
data B_A a = C_A (B_B a a) | C_B Int (((Int,Char),Bool)) | C_C Bool
data B_B b c = C_D (B_B b b) ((Int,Int))

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_B _ (((_,_),_)) -> 1 
  C_A (C_D _ ((_,_))) -> 2 
  C_A (C_D (C_D _ _) ((_,_))) -> 3 
