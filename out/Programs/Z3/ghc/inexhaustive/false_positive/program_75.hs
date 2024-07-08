module Program_19 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B a Bool
data B_B b c = C_C Char (B_B b c) | C_D | C_E (B_B c c) (B_A c)

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_C _ (C_E _ _)) -> 0 
  C_C _ (C_E (C_C _ _) _) -> 1 
  C_C _ (C_E (C_E _ _) (C_B _ _)) -> 2 
  C_C _ (C_D) -> 3 
  C_C _ (C_E _ (C_B _ _)) -> 4 
  C_C _ (C_E (C_D) _) -> 5 
  C_E (C_E (C_C _ _) _) (C_A (C_A _)) -> 6 
  C_E (C_E (C_E _ _) _) _ -> 7 
  C_E (C_E (C_D) (C_B _ _)) _ -> 8 
  C_E (C_C _ (C_E _ _)) (C_A (C_B _ _)) -> 9 
  C_E _ _ -> 10 
  C_E (C_E (C_E _ _) (C_B _ _)) _ -> 11 
  C_E (C_E _ (C_B _ _)) (C_A _) -> 12 
  C_E (C_E (C_C _ _) (C_B _ _)) (C_B _ _) -> 13 
  C_E (C_E _ (C_B _ _)) _ -> 14 
  C_E (C_E (C_E _ _) (C_A _)) (C_A (C_B _ _)) -> 15 
  C_E (C_E _ (C_A _)) (C_A (C_B _ _)) -> 16 
  C_E (C_C _ (C_D)) (C_A _) -> 17 
  C_E (C_C _ _) (C_A _) -> 18 
  C_E (C_E (C_D) (C_A _)) (C_A _) -> 19 
  C_E (C_D) (C_A (C_B _ _)) -> 20 
  C_E (C_E _ _) (C_A _) -> 21 
  C_E (C_E (C_C _ _) (C_B _ _)) _ -> 22 
  C_E (C_E (C_D) _) (C_A (C_A _)) -> 23 
  C_E (C_E (C_D) _) (C_A (C_B _ _)) -> 24 
  C_E (C_C _ (C_C _ _)) (C_A (C_B _ _)) -> 25 
  C_E (C_E (C_C _ _) (C_B _ _)) (C_A (C_B _ _)) -> 26 
  C_E (C_E _ _) (C_A (C_A _)) -> 27 
  C_E (C_C _ (C_C _ _)) (C_A (C_A _)) -> 28 
  C_E _ (C_A (C_B _ _)) -> 29 
  C_E (C_D) (C_A _) -> 30 
  C_E (C_E _ _) (C_B _ _) -> 31 
  C_E (C_D) (C_A (C_A _)) -> 32 
  C_E (C_E _ (C_B _ _)) (C_A (C_B _ _)) -> 33 
  C_E (C_E (C_C _ _) (C_A _)) (C_B _ _) -> 34 
  C_E (C_E (C_C _ _) (C_B _ _)) (C_A (C_A _)) -> 35 
  C_E (C_C _ _) _ -> 36 
  C_E (C_E (C_C _ _) (C_A _)) _ -> 37 
  C_E (C_E (C_D) _) (C_B _ _) -> 38 
  C_E (C_C _ _) (C_B _ _) -> 39 
  C_E (C_C _ (C_E _ _)) _ -> 40 
  C_E (C_E (C_C _ _) (C_A _)) (C_A (C_B _ _)) -> 41 
  C_E (C_E (C_C _ _) (C_A _)) (C_A (C_A _)) -> 42 
  C_E (C_E (C_D) (C_A _)) (C_A (C_B _ _)) -> 43 
  C_E (C_E _ (C_A _)) (C_A (C_A _)) -> 44 
  C_E (C_E (C_E _ _) (C_B _ _)) (C_A (C_B _ _)) -> 45 
  C_E (C_C _ (C_D)) (C_A (C_B _ _)) -> 46 
  C_E (C_D) (C_B _ _) -> 47 
  C_E (C_E (C_C _ _) _) (C_B _ _) -> 48 
  C_E (C_E _ (C_B _ _)) (C_B _ _) -> 49 
  C_E (C_E _ (C_A _)) (C_A _) -> 50 
