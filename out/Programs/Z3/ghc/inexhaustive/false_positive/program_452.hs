module Program_8 () where 

main = print $ show v_b
data B_A a = C_A (B_B a a) (B_A a) | C_B (B_A a) (((Char,Char),Int)) | C_C
data B_B b c = C_D | C_E (B_A b) (B_A b) | C_F

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_B (C_C) (((_,_),_))) -> 1 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_C) -> 2 
  C_E (C_A (C_E _ _) _) (C_C) -> 3 
  C_E (C_B (C_A _ _) _) (C_A (C_E _ _) _) -> 4 
  C_E (C_A (C_F) (C_C)) (C_B (C_A _ _) (((_,_),_))) -> 5 
  C_E (C_A _ _) (C_A _ _) -> 6 
  C_E (C_A (C_F) _) (C_A (C_D) (C_A _ _)) -> 7 
  C_E (C_A (C_F) _) (C_A (C_E _ _) (C_A _ _)) -> 8 
  C_E (C_A _ (C_A _ _)) _ -> 9 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_B (C_B _ _) _) -> 10 
  C_E _ (C_B (C_C) (((_,_),_))) -> 11 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_A _ _) -> 12 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_A (C_F) (C_C)) -> 13 
  C_E (C_B _ (((_,_),_))) (C_A (C_D) (C_A _ _)) -> 14 
  C_E (C_A (C_D) _) (C_B _ _) -> 15 
  C_E (C_B _ _) (C_A (C_F) (C_B _ _)) -> 16 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_A (C_D) (C_C)) -> 17 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A _ (C_A _ _)) -> 18 
  C_E (C_A (C_D) _) (C_A (C_D) (C_B _ _)) -> 19 
  C_E (C_B (C_B _ _) _) (C_A _ _) -> 20 
  C_E (C_A (C_F) (C_A _ _)) (C_B (C_C) _) -> 21 
  C_E (C_B _ (((_,_),_))) (C_C) -> 22 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_A _ (C_C)) -> 23 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_F) (C_B _ _)) -> 24 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_B (C_A _ _) (((_,_),_))) -> 25 
  C_E (C_A (C_D) _) (C_A (C_E _ _) (C_A _ _)) -> 26 
  C_E (C_A (C_F) (C_C)) (C_A (C_F) _) -> 27 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_C) -> 28 
  C_E (C_B (C_C) _) (C_A (C_E _ _) (C_A _ _)) -> 29 
  C_E (C_A (C_D) (C_B _ _)) (C_A _ (C_C)) -> 30 
  C_E (C_A _ (C_B _ _)) (C_B _ (((_,_),_))) -> 31 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 32 
  C_E (C_B (C_A _ _) _) (C_B (C_C) (((_,_),_))) -> 33 
  C_E (C_B (C_A _ _) _) (C_A (C_D) (C_B _ _)) -> 34 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_F) (C_B _ _)) -> 35 
  C_E (C_A _ (C_C)) (C_B _ (((_,_),_))) -> 36 
  C_E (C_B _ _) (C_A _ _) -> 37 
  C_E (C_B _ (((_,_),_))) (C_A (C_F) (C_C)) -> 38 
  C_E (C_B (C_C) (((_,_),_))) (C_B (C_B _ _) _) -> 39 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_A _ (C_C)) -> 40 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_B (C_C) (((_,_),_))) -> 41 
  C_E (C_B (C_C) _) (C_B _ (((_,_),_))) -> 42 
  C_E (C_B (C_B _ _) _) (C_A (C_D) (C_B _ _)) -> 43 
  C_E (C_A (C_F) _) (C_A (C_D) (C_C)) -> 44 
  C_E (C_A (C_E _ _) (C_B _ _)) (C_B (C_C) _) -> 45 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_D) (C_B _ _)) -> 46 
  C_E (C_A (C_E _ _) _) (C_A (C_F) _) -> 47 
  C_E (C_C) (C_A _ (C_C)) -> 48 
  C_E (C_A (C_D) (C_C)) (C_B (C_A _ _) _) -> 49 
  C_E (C_A (C_D) (C_A _ _)) (C_A (C_F) (C_B _ _)) -> 50 
  C_E (C_B (C_B _ _) _) (C_B (C_B _ _) (((_,_),_))) -> 51 
  C_E (C_B _ (((_,_),_))) (C_A (C_D) (C_B _ _)) -> 52 
  C_E (C_B (C_C) (((_,_),_))) (C_A (C_D) (C_C)) -> 53 
  C_E (C_A (C_F) (C_C)) (C_B (C_C) _) -> 54 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_B (C_A _ _) (((_,_),_))) -> 55 
  C_E (C_A (C_F) _) (C_A (C_D) (C_B _ _)) -> 56 
  C_E (C_A _ (C_C)) (C_A (C_F) (C_A _ _)) -> 57 
  C_E (C_A (C_E _ _) _) (C_B (C_B _ _) _) -> 58 
  C_E (C_A (C_F) (C_B _ _)) (C_B (C_C) (((_,_),_))) -> 59 
  C_E (C_B (C_C) (((_,_),_))) (C_B _ _) -> 60 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_A (C_E _ _) (C_B _ _)) -> 61 
  C_E (C_A (C_E _ _) (C_B _ _)) _ -> 62 
  C_E (C_A _ _) (C_A (C_D) (C_C)) -> 63 
  C_E (C_A (C_F) (C_A _ _)) (C_B (C_B _ _) _) -> 64 
  C_E (C_A (C_E _ _) _) (C_A (C_D) (C_A _ _)) -> 65 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_A (C_D) (C_C)) -> 66 
  C_E (C_A (C_E _ _) _) (C_B _ _) -> 67 
  C_E (C_A _ _) (C_C) -> 68 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_D) (C_C)) -> 69 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_A (C_E _ _) (C_C)) -> 70 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_A (C_F) (C_A _ _)) -> 71 
  C_E (C_A _ (C_C)) (C_B (C_C) _) -> 72 
  C_E (C_B (C_C) _) (C_A (C_D) _) -> 73 
  C_E (C_B (C_B _ _) (((_,_),_))) (C_A _ _) -> 74 
  C_E (C_B _ (((_,_),_))) (C_A (C_E _ _) (C_C)) -> 75 
  C_E (C_A _ (C_A _ _)) (C_A (C_D) (C_C)) -> 76 
  C_E (C_A (C_F) (C_B _ _)) (C_A (C_D) (C_A _ _)) -> 77 
  C_E (C_A (C_E _ _) (C_C)) (C_B _ _) -> 78 
  C_E _ (C_A (C_E _ _) (C_B _ _)) -> 79 
  C_E (C_A (C_E _ _) (C_C)) (C_B _ (((_,_),_))) -> 80 
  C_E (C_A _ _) (C_B (C_B _ _) _) -> 81 
  C_E (C_A (C_F) (C_C)) (C_A (C_F) (C_B _ _)) -> 82 
  C_E (C_A _ (C_A _ _)) (C_B _ _) -> 83 
  C_E (C_B (C_B _ _) _) (C_A (C_D) (C_C)) -> 84 
  C_E (C_A _ (C_B _ _)) (C_B (C_B _ _) _) -> 85 
  C_E (C_B (C_C) _) _ -> 86 
  C_E (C_A _ _) (C_B (C_A _ _) _) -> 87 
  C_E (C_B _ _) (C_A (C_F) (C_A _ _)) -> 88 
  C_E (C_A _ (C_B _ _)) (C_A (C_D) (C_B _ _)) -> 89 
  C_E (C_A _ (C_C)) (C_B (C_C) (((_,_),_))) -> 90 
  C_E (C_A (C_D) (C_C)) (C_A (C_F) (C_B _ _)) -> 91 
  C_E (C_C) (C_B (C_C) _) -> 92 
  C_E (C_B _ _) (C_A (C_F) (C_C)) -> 93 
  C_E (C_C) (C_B (C_C) (((_,_),_))) -> 94 
  C_E (C_A (C_D) (C_B _ _)) (C_B (C_C) (((_,_),_))) -> 95 
  C_E (C_B (C_A _ _) (((_,_),_))) (C_A (C_E _ _) _) -> 96 
  C_E (C_A (C_F) (C_A _ _)) (C_A (C_D) (C_C)) -> 97 
  C_E (C_B (C_B _ _) (((_,_),_))) _ -> 98 
  C_E (C_A (C_F) _) (C_B _ _) -> 99 
  C_E _ (C_A (C_D) _) -> 100 
  C_E (C_B (C_B _ _) _) (C_A _ (C_B _ _)) -> 101 
  C_E (C_A (C_F) (C_C)) (C_B (C_A _ _) _) -> 102 
  C_E (C_A _ (C_B _ _)) (C_A (C_E _ _) (C_C)) -> 103 
  C_E (C_A _ (C_C)) (C_C) -> 104 
  C_E (C_A (C_E _ _) (C_C)) (C_A (C_F) (C_B _ _)) -> 105 
  C_E (C_A (C_F) (C_A _ _)) (C_B _ (((_,_),_))) -> 106 
  C_E (C_A (C_E _ _) (C_A _ _)) (C_B (C_C) _) -> 107 
