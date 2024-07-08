module Program_6 () where 

 main = print $ show v_b
data B_B c = C_B ((Int,Int)) Int | C_C
data B_A a b = C_A (B_B a) (B_B b)

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((_,_)) _ -> 0 
