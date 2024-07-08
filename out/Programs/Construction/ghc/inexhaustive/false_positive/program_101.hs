module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A Char b) ((Bool,Bool)) | C_B (B_A b b) Int | C_C | C_D Int | C_E (B_A b b) ((Int,Char))

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _ _) ((_,_)) -> 0 
  C_A (C_B (C_A _ _) _) ((_,_)) -> 1 
  C_A (C_B (C_B _ _) _) ((_,_)) -> 2 
  C_A (C_B (C_C) _) ((_,_)) -> 3 
  C_A (C_B (C_D _) _) ((_,_)) -> 4 
  C_A (C_B (C_E _ _) _) ((_,_)) -> 5 
  C_A (C_C) ((_,_)) -> 6 
  C_A (C_D _) ((_,_)) -> 7 
  C_A (C_E _ _) ((_,_)) -> 8 
  C_B (C_A _ ((_,_))) _ -> 9 
  C_B (C_B (C_A _ _) _) _ -> 10 
  C_B (C_B (C_B _ _) _) _ -> 11 
  C_B (C_B (C_C) _) _ -> 12 
  C_B (C_B (C_D _) _) _ -> 13 
  C_B (C_C) _ -> 14 
  C_B (C_D _) _ -> 15 
  C_B (C_E _ _) _ -> 16 
  C_C -> 17 
  C_D _ -> 18 
  C_E _ _ -> 19 
