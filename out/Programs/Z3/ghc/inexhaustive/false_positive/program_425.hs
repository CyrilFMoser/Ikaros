module Program_11 () where 

main = print $ show v_b
data B_B b c = C_D | C_E (B_A b) (B_A b) | C_F
data B_A a = C_A (B_B a a) (B_A a) | C_B (B_A a) (((Char,Char),Int)) | C_C

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_A _ _) (C_B (C_A _ _) (((_,_),_))) -> 0 
  C_E _ (C_B _ (((_,_),_))) -> 1 
  C_E (C_A (C_E _ _) _) (C_A _ (C_A _ _)) -> 2 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_B (C_B _ _) (((_,_),_))) -> 3 
  C_E (C_A (C_D) (C_A _ _)) (C_B (C_A _ _) (((_,_),_))) -> 4 
  C_E (C_B (C_A _ _) _) (C_A (C_E _ _) (C_B _ _)) -> 5 
  C_E (C_A (C_D) (C_B _ _)) (C_A (C_F) _) -> 6 
  C_E (C_B (C_B _ _) _) (C_A (C_D) _) -> 7 
  C_E (C_A (C_D) (C_A _ _)) (C_C) -> 8 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_B _ (((_,_),_))) -> 9 
  C_E (C_A _ (C_B _ _)) (C_A (C_D) (C_A _ _)) -> 10 
  C_E (C_A _ _) (C_A (C_F) (C_A _ _)) -> 11 
  C_E (C_A (C_E _ _) _) (C_B _ (((_,_),_))) -> 12 
  C_E (C_A _ _) (C_A (C_E _ _) (C_B _ _)) -> 13 
  C_E (C_B _ (((_,_),_))) (C_B (C_A _ _) _) -> 14 
  C_E (C_A (C_E _ _) _) (C_B (C_C) _) -> 15 
  C_E (C_A (C_F) (C_C)) (C_B (C_C) (((_,_),_))) -> 16 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_E _ _) _) -> 17 
  C_E (C_A (C_F) (C_A _ _)) (C_B _ _) -> 18 
  C_E (C_A (C_D) (C_A _ _)) (C_B _ (((_,_),_))) -> 19 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_E _ _) (C_B _ _)) -> 20 
  C_E (C_B _ _) (C_A (C_D) _) -> 21 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_B _ _) -> 22 
  C_E _ (C_C) -> 23 
  C_E _ (C_A (C_F) _) -> 24 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_E _ _) _) -> 25 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_E _ _) (C_A _ _)) -> 26 
  C_E (C_B (C_A _ _) _) (C_C) -> 27 
  C_E (C_A (C_F) (C_C)) (C_C) -> 28 
  C_E (C_A _ (C_A _ _)) (C_B (C_B _ _) (((_,_),_))) -> 29 
  C_E (C_A (C_E _ _) (C_C)) (C_A (C_F) (C_C)) -> 30 
  C_E (C_A (C_D) (C_B _ _)) (C_A (C_E _ _) (C_C)) -> 31 
  C_E (C_A _ _) _ -> 32 
  C_E (C_B (C_A _ _) _) (C_A (C_D) _) -> 33 
  C_E (C_A (C_F) _) (C_A (C_F) (C_C)) -> 34 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_A (C_E _ _) (C_C)) -> 35 
  C_E (C_A _ (C_C)) (C_A (C_F) (C_C)) -> 36 
  C_E (C_A _ (C_A _ _)) (C_A (C_F) _) -> 37 
  C_E (C_A (C_D) (C_C)) (C_A (C_D) _) -> 38 
  C_E (C_C) (C_A (C_D) (C_C)) -> 39 
  C_E (C_A (C_E _ _) _) (C_A _ _) -> 40 
  C_E (C_A (C_E _ _) _) (C_A (C_D) _) -> 41 
  C_E (C_A _ _) (C_A (C_D) (C_B _ _)) -> 42 
  C_E (C_A (C_D) (C_C)) (C_B _ _) -> 43 
  C_E (C_A _ _) (C_B (C_C) (((_,_),_))) -> 44 
  C_E (C_A (C_D) (C_C)) (C_A (C_D) (C_A _ _)) -> 45 
  C_E (C_A (C_E _ _) (C_C)) (C_A (C_E _ _) _) -> 46 
  C_E (C_A _ (C_C)) (C_A _ _) -> 47 
  C_E (C_A _ (C_A _ _)) (C_A (C_E _ _) (C_C)) -> 48 
  C_E (C_B _ _) (C_A (C_E _ _) _) -> 49 
  C_E (C_B (C_C) _) (C_A (C_E _ _) (C_C)) -> 50 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_E _ _) (C_C)) -> 51 
  C_E (C_C) (C_A (C_F) (C_B _ _)) -> 52 
  C_E (C_A (C_D) _) (C_A (C_F) (C_B _ _)) -> 53 
  C_E (C_A (C_D) (C_A _ _)) (C_A (C_E _ _) _) -> 54 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_E _ _) (C_A _ _)) -> 55 
  C_E (C_A _ (C_B _ _)) (C_A (C_E _ _) (C_A _ _)) -> 56 
  C_E (C_B _ (((_,_),_))) (C_B (C_C) (((_,_),_))) -> 57 
  C_E (C_B (C_B _ _) _) (C_A (C_F) (C_B _ _)) -> 58 
  C_E (C_A (C_D) (C_B _ _)) (C_A (C_D) (C_A _ _)) -> 59 
  C_E (C_B (C_A _ _) _) (C_B (C_A _ _) (((_,_),_))) -> 60 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_A _ (C_C)) -> 61 
  C_E (C_C) (C_A (C_D) (C_B _ _)) -> 62 
  C_E (C_A _ (C_B _ _)) (C_C) -> 63 
  C_E (C_A _ (C_B _ _)) (C_A (C_F) (C_C)) -> 64 
  C_E (C_A (C_D) (C_A _ _)) (C_A _ (C_C)) -> 65 
