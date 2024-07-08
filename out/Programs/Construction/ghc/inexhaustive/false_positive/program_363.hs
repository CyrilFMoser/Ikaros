module Program_19 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) Bool | C_B (B_A a a) Int | C_C (((Char,Bool),(Int,Int))) | C_D b

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ _ -> 1 
  C_C (((_,_),(_,_))) -> 2 
