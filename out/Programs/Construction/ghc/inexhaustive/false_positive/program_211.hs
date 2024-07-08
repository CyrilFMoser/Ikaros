module Program_26 () where 

 main = print $ show v_b
data B_A = C_A B_A B_A | C_B ((B_A,B_A)) (B_B ((Bool,Char))) | C_C Int | C_D (B_B B_A)
data B_B a = C_E ((Int,(Char,Char))) | C_F

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ (C_F) -> 1 
  C_C _ -> 2 
  C_D _ -> 3 
