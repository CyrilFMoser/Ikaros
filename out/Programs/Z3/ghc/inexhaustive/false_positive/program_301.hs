module Program_20 () where 

 main = print $ show v_b
data B_A a = C_A (((Bool,Bool),Char)) ((Int,Char))
data B_B b c = C_B (B_B b b) | C_C ((Int,Bool)) b

v_a :: B_B Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_C ((_,_)) _) -> 0 
