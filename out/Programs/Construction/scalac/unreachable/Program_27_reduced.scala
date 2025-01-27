object Test {
sealed trait T_A[A, B]
case class CC_A[C](a:     C    , b:     C    , c: T_A[C, C]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int]
case class CC_B(a:      CC_A[Char] ) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int]
val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 0
  case CC_B(CC_A(_, _, _)) => 1
}
}
