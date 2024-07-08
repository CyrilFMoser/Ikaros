module Program_11 () where 

 main = print $ show v_b
data B_A = C_A | C_B ((B_A,B_B))
data B_B = C_C B_B | C_D Int | C_E B_B B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C _) -> 0 
  C_C _ -> 1 
  C_C (C_E _ _) -> 2 
  C_C (C_E _ (C_C _)) -> 3 
  C_C (C_E (C_E _ _) _) -> 4 
  C_C (C_E (C_D _) (C_E _ _)) -> 5 
  C_C (C_E (C_E _ _) (C_E _ _)) -> 6 
  C_C (C_E (C_C _) (C_E _ _)) -> 7 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ _) -> 8 
  C_E (C_E (C_C _) (C_C _)) (C_C (C_C _)) -> 9 
  C_E (C_D _) _ -> 10 
  C_E (C_E (C_D _) (C_D _)) _ -> 11 
  C_E (C_C (C_D _)) (C_C _) -> 12 
  C_E (C_E _ (C_D _)) (C_C _) -> 13 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_E _ _) _) -> 14 
  C_E (C_E (C_E _ _) (C_C _)) (C_C _) -> 15 
  C_E (C_E _ (C_C _)) (C_E (C_C _) (C_C _)) -> 16 
  C_E (C_C (C_C _)) (C_E (C_E _ _) (C_E _ _)) -> 17 
  C_E (C_C (C_E _ _)) (C_E (C_D _) (C_E _ _)) -> 18 
  C_E (C_E (C_D _) _) (C_E _ (C_E _ _)) -> 19 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_C _) (C_D _)) -> 20 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ (C_D _)) -> 21 
  C_E (C_E (C_C _) (C_C _)) (C_C _) -> 22 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_D _) _) -> 23 
  C_E (C_E _ (C_D _)) (C_C (C_D _)) -> 24 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_D _) _) -> 25 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _) _) -> 26 
  C_E (C_E (C_E _ _) _) (C_C (C_D _)) -> 27 
  C_E (C_C (C_E _ _)) (C_C (C_E _ _)) -> 28 
  C_E (C_E (C_E _ _) (C_C _)) (C_E (C_E _ _) (C_C _)) -> 29 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_C _) _) -> 30 
  C_E (C_E (C_C _) (C_C _)) (C_E _ _) -> 31 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_E _ _) (C_E _ _)) -> 32 
  C_E (C_C (C_C _)) (C_E _ _) -> 33 
  C_E (C_E _ (C_C _)) (C_E _ (C_C _)) -> 34 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) _) -> 35 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_D _) (C_E _ _)) -> 36 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_C _) (C_E _ _)) -> 37 
  C_E (C_E _ (C_C _)) (C_E (C_C _) (C_E _ _)) -> 38 
  C_E (C_E (C_C _) (C_E _ _)) (C_D _) -> 39 
  C_E (C_D _) (C_E (C_D _) (C_D _)) -> 40 
  C_E (C_E (C_D _) (C_C _)) (C_E _ _) -> 41 
  C_E (C_E (C_C _) (C_E _ _)) (C_E _ (C_C _)) -> 42 
  C_E (C_D _) (C_E _ _) -> 43 
  C_E _ (C_E (C_C _) (C_E _ _)) -> 44 
  C_E (C_C _) (C_C (C_D _)) -> 45 
  C_E (C_E (C_C _) _) (C_C (C_D _)) -> 46 
  C_E (C_E (C_C _) (C_E _ _)) (C_E (C_C _) (C_D _)) -> 47 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) (C_C _)) -> 48 
  C_E (C_C _) (C_E (C_C _) (C_E _ _)) -> 49 
  C_E (C_E (C_E _ _) (C_C _)) _ -> 50 
  C_E (C_E (C_D _) (C_D _)) (C_C (C_E _ _)) -> 51 
  C_E (C_E (C_D _) _) (C_C (C_C _)) -> 52 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_C _) _) -> 53 
  C_E (C_E (C_D _) (C_E _ _)) (C_E _ (C_E _ _)) -> 54 
