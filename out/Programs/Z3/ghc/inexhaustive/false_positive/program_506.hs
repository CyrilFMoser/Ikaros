module Program_27 () where 

main = print $ show v_b
data B_A a = C_A | C_B (B_A a) (B_A ((Char,Int))) | C_C | C_D Char
data B_B = C_E (B_A B_B) B_B | C_F B_B | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_E (C_A) (C_E _ _)) -> 0 
  C_F (C_E (C_B _ _) _) -> 1 
  C_F (C_F _) -> 2 
  C_F (C_E (C_B _ _) (C_E _ _)) -> 3 
  C_E (C_B (C_D _) _) (C_E (C_C) C_G) -> 4 
  C_E (C_A) (C_E _ (C_E _ _)) -> 5 
  C_E (C_B _ (C_C)) (C_E (C_B _ _) (C_F _)) -> 6 
  C_E (C_B (C_B _ _) (C_C)) (C_E _ (C_E _ _)) -> 7 
  C_E (C_B _ (C_C)) C_G -> 8 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_B _ _) (C_F _)) -> 9 
  C_E (C_B (C_D _) (C_A)) (C_E _ (C_E _ _)) -> 10 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_B _ _) C_G) -> 11 
  C_E _ (C_E (C_B _ _) _) -> 12 
  C_E (C_B _ (C_A)) (C_E (C_C) _) -> 13 
  C_E (C_B (C_C) (C_B _ _)) (C_E (C_A) (C_F _)) -> 14 
  C_E (C_B _ (C_D _)) (C_E (C_D _) C_G) -> 15 
  C_E (C_B (C_B _ _) (C_C)) C_G -> 16 
  C_E (C_B _ (C_D _)) (C_F C_G) -> 17 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_C) (C_F _)) -> 18 
  C_E (C_B (C_A) _) _ -> 19 
  C_E (C_B (C_C) (C_A)) (C_E (C_C) (C_F _)) -> 20 
  C_E (C_B (C_A) _) (C_E (C_D _) C_G) -> 21 
  C_E (C_B (C_D _) (C_D _)) (C_E (C_A) (C_E _ _)) -> 22 
  C_E (C_B (C_B _ _) (C_A)) (C_E _ C_G) -> 23 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C) _) -> 24 
  C_E (C_B (C_B _ _) (C_A)) (C_E (C_A) C_G) -> 25 
  C_E (C_C) (C_E (C_D _) (C_F _)) -> 26 
  C_E (C_B (C_A) _) (C_E (C_B _ _) (C_E _ _)) -> 27 
  C_E (C_B (C_C) (C_B _ _)) (C_F (C_E _ _)) -> 28 
  C_E (C_B (C_A) (C_C)) (C_E (C_D _) (C_F _)) -> 29 
  C_E (C_C) (C_F C_G) -> 30 
  C_E (C_B (C_B _ _) _) (C_E (C_B _ _) (C_E _ _)) -> 31 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_C) (C_E _ _)) -> 32 
  C_E (C_B (C_C) (C_A)) C_G -> 33 
  C_E (C_B (C_B _ _) (C_D _)) (C_E (C_A) _) -> 34 
  C_E (C_B _ (C_C)) (C_E _ _) -> 35 
  C_E (C_B _ (C_A)) (C_E (C_C) C_G) -> 36 
  C_E (C_B (C_C) _) (C_E _ (C_E _ _)) -> 37 
  C_E (C_B (C_B _ _) (C_B _ _)) (C_E (C_A) _) -> 38 
  C_E _ (C_E (C_A) (C_E _ _)) -> 39 
  C_E (C_B (C_B _ _) (C_C)) (C_E _ C_G) -> 40 
  C_E (C_B (C_A) (C_A)) (C_E _ (C_E _ _)) -> 41 
  C_E (C_B (C_A) (C_C)) (C_E (C_B _ _) (C_F _)) -> 42 
  C_E (C_B (C_A) _) (C_F (C_F _)) -> 43 
  C_E (C_B (C_B _ _) (C_D _)) _ -> 44 
  C_E (C_D _) (C_E (C_D _) C_G) -> 45 
  C_E (C_B (C_D _) (C_B _ _)) (C_E (C_D _) (C_E _ _)) -> 46 
  C_E (C_B (C_A) (C_B _ _)) (C_E (C_C) C_G) -> 47 
  C_E (C_B (C_C) (C_B _ _)) (C_F _) -> 48 
  C_E (C_B (C_D _) (C_A)) (C_E _ (C_F _)) -> 49 
  C_E (C_B (C_A) (C_D _)) (C_E (C_B _ _) (C_F _)) -> 50 
  C_E (C_B (C_B _ _) (C_C)) (C_E (C_B _ _) C_G) -> 51 
  C_E (C_B (C_D _) (C_C)) (C_E (C_D _) _) -> 52 
  C_E (C_B (C_D _) (C_A)) (C_E (C_D _) C_G) -> 53 
