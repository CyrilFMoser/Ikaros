module Program_13 () where 

 main = print $ show v_b
data B_B = C_C B_B | C_D B_B | C_E ((B_B,Int)) (B_A B_B B_B)
data B_A a b = C_A (B_A a ((Char,Int))) | C_B

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
