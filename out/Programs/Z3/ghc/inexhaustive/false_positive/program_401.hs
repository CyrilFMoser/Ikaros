module Program_24 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) (((Char,Bool),Int)) | C_B | C_C (B_A a a) Char | C_D Int a

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B) _ -> 0 
  C_C (C_C (C_D _ _) _) _ -> 1 
  C_C (C_C (C_A _ _) _) _ -> 2 
  C_C (C_A (C_B) _) _ -> 3 
  C_A (C_A _ (((_,_),_))) (((_,_),_)) -> 4 
  C_A (C_A (C_C _ _) (((_,_),_))) _ -> 5 
  C_A (C_A (C_B) (((_,_),_))) (((_,_),_)) -> 6 
  C_A (C_C (C_D _ _) _) _ -> 7 
  C_A (C_A (C_B) _) (((_,_),_)) -> 8 
  C_A (C_A (C_B) _) _ -> 9 
  C_A (C_A (C_C _ _) _) (((_,_),_)) -> 10 
  C_A (C_C (C_A _ _) _) _ -> 11 
  C_A (C_A _ _) _ -> 12 
  C_A (C_C (C_D _ _) _) (((_,_),_)) -> 13 
  C_A (C_A (C_A _ _) _) (((_,_),_)) -> 14 
  C_A _ _ -> 15 
  C_A (C_A (C_A _ _) (((_,_),_))) (((_,_),_)) -> 16 
  C_A (C_C (C_C _ _) _) _ -> 17 
  C_A (C_A (C_D _ _) (((_,_),_))) (((_,_),_)) -> 18 
  C_A (C_C (C_B) _) _ -> 19 
  C_A (C_D _ _) _ -> 20 
  C_A (C_A (C_B) (((_,_),_))) _ -> 21 
  C_A (C_A (C_D _ _) (((_,_),_))) _ -> 22 
