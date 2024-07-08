module Program_28 () where 

 main = print $ show v_b
data B_A a b = C_A ((Char,Bool)) | C_B | C_C (B_A ((Int,Int)) a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C (C_B) -> 2 
  C_C (C_C (C_A _)) -> 3 
  C_C (C_C (C_B)) -> 4 
  C_C (C_C (C_C _)) -> 5 
