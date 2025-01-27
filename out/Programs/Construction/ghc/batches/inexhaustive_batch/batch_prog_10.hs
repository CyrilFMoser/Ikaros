module Program_10 () where 

main = print $ show v_b
data B_A a b = C_A b a (B_A a a) | C_B | C_C (B_A a a) (B_A (B_A Int Int) (B_A Int Int))

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ _ -> 0 
  C_B -> 1 
  C_C (C_A _ _ _) (C_A _ _ _) -> 2 
  C_C (C_A _ _ _) (C_B) -> 3 
  C_C (C_A _ _ _) (C_C (C_A _ _ _) (C_A _ _ _)) -> 4 
  C_C (C_A _ _ _) (C_C (C_A _ _ _) (C_B)) -> 5 
  C_C (C_A _ _ _) (C_C (C_A _ _ _) (C_C _ _)) -> 6 
  C_C (C_A _ _ _) (C_C (C_B) (C_A _ _ _)) -> 7 
  C_C (C_A _ _ _) (C_C (C_B) (C_B)) -> 8 
  C_C (C_A _ _ _) (C_C (C_B) (C_C _ _)) -> 9 
  C_C (C_A _ _ _) (C_C (C_C _ _) (C_A _ _ _)) -> 10 
  C_C (C_A _ _ _) (C_C (C_C _ _) (C_B)) -> 11 
  C_C (C_A _ _ _) (C_C (C_C _ _) (C_C _ _)) -> 12 
  C_C (C_B) (C_A _ _ _) -> 13 
  C_C (C_B) (C_B) -> 14 
  C_C (C_B) (C_C (C_A _ _ _) (C_A _ _ _)) -> 15 
  C_C (C_B) (C_C (C_A _ _ _) (C_B)) -> 16 
  C_C (C_B) (C_C (C_A _ _ _) (C_C _ _)) -> 17 
  C_C (C_B) (C_C (C_B) (C_A _ _ _)) -> 18 
  C_C (C_B) (C_C (C_B) (C_B)) -> 19 
  C_C (C_B) (C_C (C_B) (C_C _ _)) -> 20 
  C_C (C_B) (C_C (C_C _ _) (C_A _ _ _)) -> 21 
  C_C (C_B) (C_C (C_C _ _) (C_B)) -> 22 
  C_C (C_B) (C_C (C_C _ _) (C_C _ _)) -> 23 
  C_C (C_C (C_A _ _ _) _) (C_A _ _ _) -> 24 
  C_C (C_C (C_A _ _ _) _) (C_B) -> 25 
  C_C (C_C (C_A _ _ _) _) (C_C (C_A _ _ _) (C_A _ _ _)) -> 26 
  C_C (C_C (C_A _ _ _) _) (C_C (C_A _ _ _) (C_B)) -> 27 
  C_C (C_C (C_A _ _ _) _) (C_C (C_A _ _ _) (C_C _ _)) -> 28 
  C_C (C_C (C_A _ _ _) _) (C_C (C_B) (C_A _ _ _)) -> 29 
  C_C (C_C (C_A _ _ _) _) (C_C (C_B) (C_B)) -> 30 
  C_C (C_C (C_A _ _ _) _) (C_C (C_B) (C_C _ _)) -> 31 
  C_C (C_C (C_A _ _ _) _) (C_C (C_C _ _) (C_A _ _ _)) -> 32 
  C_C (C_C (C_A _ _ _) _) (C_C (C_C _ _) (C_B)) -> 33 
  C_C (C_C (C_A _ _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 34 
  C_C (C_C (C_B) _) (C_A _ _ _) -> 35 
  C_C (C_C (C_B) _) (C_B) -> 36 
  C_C (C_C (C_B) _) (C_C (C_A _ _ _) (C_A _ _ _)) -> 37 
  C_C (C_C (C_B) _) (C_C (C_A _ _ _) (C_B)) -> 38 
  C_C (C_C (C_B) _) (C_C (C_A _ _ _) (C_C _ _)) -> 39 
  C_C (C_C (C_B) _) (C_C (C_B) (C_A _ _ _)) -> 40 
  C_C (C_C (C_B) _) (C_C (C_B) (C_B)) -> 41 
  C_C (C_C (C_B) _) (C_C (C_B) (C_C _ _)) -> 42 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_A _ _ _)) -> 43 
  C_C (C_C (C_B) _) (C_C (C_C _ _) (C_B)) -> 44 
  C_C (C_C (C_C _ _) _) (C_A _ _ _) -> 45 
  C_C (C_C (C_C _ _) _) (C_B) -> 46 
  C_C (C_C (C_C _ _) _) (C_C (C_A _ _ _) (C_A _ _ _)) -> 47 
  C_C (C_C (C_C _ _) _) (C_C (C_A _ _ _) (C_B)) -> 48 
  C_C (C_C (C_C _ _) _) (C_C (C_A _ _ _) (C_C _ _)) -> 49 
  C_C (C_C (C_C _ _) _) (C_C (C_B) (C_A _ _ _)) -> 50 
  C_C (C_C (C_C _ _) _) (C_C (C_B) (C_B)) -> 51 
  C_C (C_C (C_C _ _) _) (C_C (C_B) (C_C _ _)) -> 52 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_A _ _ _)) -> 53 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_B)) -> 54 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_C _ _)) -> 55 

--  This is not matched: C_C (C_C (C_B) _) (C_C (C_C _ _) (C_C _ _))