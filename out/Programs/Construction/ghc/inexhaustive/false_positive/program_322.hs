module Program_10 () where 

 main = print $ show v_b
data B_A = C_A ((Bool,B_A)) ((B_A,B_A)) | C_B B_A | C_C (((Bool,Char),B_A)) | C_D Bool B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_A _ _) -> 1 
  C_B (C_B (C_A _ _)) -> 2 
  C_B (C_B (C_B _)) -> 3 
  C_B (C_B (C_C _)) -> 4 
  C_B (C_C _) -> 5 
  C_B (C_D _ _) -> 6 
  C_C _ -> 7 
  C_D _ _ -> 8 
