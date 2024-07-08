module Program_1 () where 

 main = print $ show v_b
data B_A = C_A ((Bool,Bool)) B_A | C_B Int Int | C_C Int ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_C _ ((C_B _ _,C_C _ _))) -> 0 
