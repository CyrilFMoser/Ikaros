object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b:     C    ) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, (Byte,Char)]], T_A[T_A[Char, Boolean], (Char,Int)]]
case class CC_B(a:           Int                    , b:          Byte                  , c: CC_A[T_A[Char, Char]]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, (Byte,Char)]], T_A[T_A[Char, Boolean], (Char,Int)]]
val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, (Byte,Char)]], T_A[T_A[Char, Boolean], (Char,Int)]] = null
val v_b      = v_a match{
  case CC_A(_, _) => 0
  case CC_B(_, _, CC_A(_, _)) => 1
}
}
