{-# LANGUAGE ImplicitParams
             , Arrows #-}

import Control.Arrow

test :: (Eq a, Num a) => a -> a
test = proc a -> do
  let ?ldfk = undefined
  4 <- returnA -< a
  returnA -< a


main = print $ test 4
