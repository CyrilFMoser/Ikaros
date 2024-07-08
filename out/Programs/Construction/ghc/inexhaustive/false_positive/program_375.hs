module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Int) (B_A a) | C_B ((Bool,Int)) | C_C (B_A a) | C_D (B_A a)

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B ((_,12)) -> 1 
  C_B ((_,_)) -> 2 
  C_C (C_A _ _) -> 3 
  C_C (C_B _) -> 4 
  C_C (C_C (C_A _ _)) -> 5 
  C_C (C_C (C_B _)) -> 6 
  C_C (C_C (C_D _)) -> 7 
  C_C (C_D _) -> 8 
  C_D (C_A _ _) -> 9 
  C_D (C_B ((_,_))) -> 10 
  C_D (C_C (C_A _ _)) -> 11 
  C_D (C_C (C_B _)) -> 12 
  C_D (C_C (C_C _)) -> 13 
  C_D (C_C (C_D _)) -> 14 
  C_D (C_D _) -> 15 
