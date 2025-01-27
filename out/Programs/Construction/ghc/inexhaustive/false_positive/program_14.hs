module Program_34 () where 

main = print $ show v_b
data B_B b c = C_B (B_B (B_B Int Int) (B_B Int Int)) | C_D

v_a :: C_B (B_B (B_B Int Int) (B_B Int Int))
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B (C_B _)) -> 0 

--  This is not matched: C_B _ _ (C_A)