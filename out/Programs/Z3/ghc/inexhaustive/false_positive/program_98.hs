module Program_10 () where 

 main = print $ show v_b
data B_B = C_C B_B | C_D Int | C_E B_B B_B
data B_A = C_A | C_B ((B_A,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_C (C_C (C_E _ _)) -> 1 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_E _ _) _) -> 2 
  C_E (C_E (C_C _) _) (C_E _ (C_C _)) -> 3 
  C_E (C_E _ (C_D _)) (C_E _ _) -> 4 
  C_E (C_E (C_D _) (C_E _ _)) (C_C (C_D _)) -> 5 
  C_E (C_E (C_E _ _) (C_C _)) (C_C (C_C _)) -> 6 
  C_E (C_E (C_E _ _) (C_D _)) _ -> 7 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_D _) _) -> 8 
  C_E (C_E (C_E _ _) _) (C_E _ _) -> 9 
  C_E (C_C (C_D _)) (C_C (C_C _)) -> 10 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _) (C_E _ _)) -> 11 
  C_E (C_C (C_D _)) (C_E _ (C_E _ _)) -> 12 
  C_E (C_E (C_D _) (C_E _ _)) (C_E (C_C _) (C_C _)) -> 13 
  C_E (C_E (C_C _) (C_C _)) (C_E _ (C_E _ _)) -> 14 
  C_E (C_E _ _) (C_E (C_E _ _) (C_D _)) -> 15 
  C_E (C_E (C_C _) _) (C_E (C_D _) (C_C _)) -> 16 
  C_E (C_E (C_D _) (C_E _ _)) (C_C (C_E _ _)) -> 17 
  C_E (C_E (C_E _ _) _) (C_E (C_D _) (C_D _)) -> 18 
  C_E (C_C (C_D _)) (C_E (C_D _) (C_C _)) -> 19 
  C_E (C_E (C_C _) (C_D _)) (C_C (C_C _)) -> 20 
  C_E (C_C (C_E _ _)) (C_C (C_C _)) -> 21 
  C_E (C_E (C_C _) (C_C _)) (C_E (C_E _ _) (C_E _ _)) -> 22 
  C_E (C_E (C_E _ _) _) (C_E (C_D _) _) -> 23 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E _ (C_E _ _)) -> 24 
  C_E (C_E (C_D _) _) (C_E (C_C _) _) -> 25 
  C_E (C_E _ _) (C_E (C_C _) (C_D _)) -> 26 
  C_E (C_E (C_D _) (C_D _)) (C_C (C_C _)) -> 27 
  C_E (C_E (C_C _) (C_D _)) (C_C (C_D _)) -> 28 
  C_E (C_E (C_D _) (C_E _ _)) (C_C (C_C _)) -> 29 
  C_E (C_E _ _) (C_E (C_C _) (C_E _ _)) -> 30 
  C_E (C_E (C_C _) (C_C _)) (C_C (C_D _)) -> 31 
  C_E (C_E (C_D _) (C_C _)) (C_E (C_E _ _) (C_D _)) -> 32 
  C_E (C_E _ _) (C_E _ (C_D _)) -> 33 
  C_E (C_C (C_E _ _)) (C_E (C_C _) _) -> 34 
  C_E (C_E _ (C_D _)) (C_E (C_E _ _) (C_D _)) -> 35 
  C_E (C_C (C_C _)) (C_E (C_D _) (C_C _)) -> 36 
  C_E (C_E _ _) (C_C (C_E _ _)) -> 37 
  C_E (C_C (C_E _ _)) (C_E (C_D _) _) -> 38 
  C_E (C_E (C_C _) (C_D _)) (C_E (C_D _) _) -> 39 
  C_E (C_E _ _) (C_E (C_D _) _) -> 40 
  C_E (C_C (C_E _ _)) (C_E _ _) -> 41 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_C _) _) -> 42 
  C_E (C_E (C_C _) (C_E _ _)) (C_C _) -> 43 
  C_E (C_C _) (C_C _) -> 44 
  C_E (C_E (C_E _ _) (C_D _)) (C_E _ _) -> 45 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_C _) (C_E _ _)) -> 46 
  C_E (C_E _ (C_E _ _)) (C_E (C_D _) (C_E _ _)) -> 47 
  C_E (C_E _ (C_D _)) (C_E (C_D _) (C_C _)) -> 48 
  C_E (C_E (C_E _ _) _) (C_E (C_C _) (C_E _ _)) -> 49 
  C_E (C_E (C_D _) (C_C _)) _ -> 50 
  C_E (C_E (C_C _) _) (C_C _) -> 51 
  C_E (C_E _ _) (C_E (C_E _ _) (C_C _)) -> 52 
  C_E (C_E (C_E _ _) (C_E _ _)) (C_E (C_E _ _) (C_D _)) -> 53 
  C_E (C_E (C_D _) (C_E _ _)) (C_E _ (C_C _)) -> 54 
  C_E _ (C_D _) -> 55 
  C_E (C_E (C_E _ _) (C_D _)) (C_E (C_E _ _) (C_C _)) -> 56 
  C_E (C_E (C_D _) (C_D _)) (C_E (C_C _) (C_C _)) -> 57 
  C_E (C_E _ (C_D _)) (C_E _ (C_C _)) -> 58 
  C_E _ (C_E (C_D _) (C_C _)) -> 59 
  C_E _ (C_C (C_E _ _)) -> 60 
  C_E (C_E _ _) (C_E (C_E _ _) _) -> 61 
  C_E (C_E _ (C_E _ _)) (C_C _) -> 62 
