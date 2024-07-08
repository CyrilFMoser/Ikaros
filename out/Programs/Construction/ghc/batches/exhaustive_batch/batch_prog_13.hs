module Program_13 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Char) | C_B | C_C (B_A a) (B_A a) | C_D a | C_E a (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _) -> 0 
  C_A (C_B) -> 1 
  C_A (C_C (C_A _) _) -> 2 
  C_A (C_C (C_B) _) -> 3 
  C_A (C_C (C_C _ _) _) -> 4 
  C_A (C_C (C_D _) _) -> 5 
  C_A (C_C (C_E _ _) _) -> 6 
  C_A (C_D _) -> 7 
  C_A (C_E _ (C_A _)) -> 8 
  C_A (C_E _ (C_B)) -> 9 
  C_A (C_E _ (C_C _ _)) -> 10 
  C_A (C_E _ (C_D _)) -> 11 
  C_A (C_E _ (C_E _ _)) -> 12 
  C_B -> 13 
  C_C (C_A (C_A _)) _ -> 14 
  C_C (C_A (C_B)) _ -> 15 
  C_C (C_A (C_C _ _)) _ -> 16 
  C_C (C_A (C_D _)) _ -> 17 
  C_C (C_A (C_E _ _)) _ -> 18 
  C_C (C_B) _ -> 19 
  C_C (C_C _ (C_A _)) _ -> 20 
  C_C (C_C _ (C_B)) _ -> 21 
  C_C (C_C _ (C_C _ _)) _ -> 22 
  C_C (C_C _ (C_D _)) _ -> 23 
  C_C (C_C _ (C_E _ _)) _ -> 24 
  C_C (C_D _) _ -> 25 
  C_C (C_E _ (C_A _)) _ -> 26 
  C_C (C_E _ (C_B)) _ -> 27 
  C_C (C_E _ (C_C _ _)) _ -> 28 
  C_C (C_E _ (C_D _)) _ -> 29 
  C_C (C_E _ (C_E _ _)) _ -> 30 
  C_D _ -> 31 
  C_E _ (C_A (C_A _)) -> 32 
  C_E _ (C_A (C_B)) -> 33 
  C_E _ (C_A (C_C _ _)) -> 34 
  C_E _ (C_A (C_D _)) -> 35 
  C_E _ (C_A (C_E _ _)) -> 36 
  C_E _ (C_B) -> 37 
  C_E _ (C_C _ _) -> 38 
  C_E _ (C_D _) -> 39 
  C_E _ (C_E _ _) -> 40 
