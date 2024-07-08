module Program_20 () where 

 main = print $ show v_b
data B_A = C_A Bool | C_B ((B_A,Int)) B_A | C_C ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_C ((C_A _,C_A _)) -> 2 
  C_C ((C_A _,C_B _ _)) -> 3 
  C_C ((C_A _,C_C _)) -> 4 
  C_C ((C_B _ _,C_A _)) -> 5 
  C_C ((C_B _ _,C_B _ _)) -> 6 
  C_C ((C_B _ _,C_C _)) -> 7 
  C_C ((C_C _,C_A _)) -> 8 
  C_C ((C_C _,C_B _ _)) -> 9 
  C_C ((C_C _,C_C _)) -> 10 
