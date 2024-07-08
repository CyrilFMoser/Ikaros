module Program_12 () where 

 main = print $ show v_b
data B_A = C_A B_A ((B_A,B_A)) | C_B B_A ((B_A,Bool))
data B_B a b = C_C Int a | C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_A _ _) _ -> 1 
