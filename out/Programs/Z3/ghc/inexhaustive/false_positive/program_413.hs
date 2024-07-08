module Program_7 () where 

 main = print $ show v_b
data B_B a b = C_C a
data B_A = C_A ((B_A,Bool)) Char | C_B B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((C_A _ _,_)) _ -> 0 
  C_B _ -> 1 
