object Test {
sealed trait T_A[A, B]
case class CC_A(a:      Int                , b: T_A[Int, Byte], c:       Boolean                             ) extends T_A[T_A[Char, T_A[Char, Char]], T_A[T_A[Byte, Int], T_A[Char, Char]]]
case class CC_B() extends T_A[T_A[Char, T_A[Char, Char]], T_A[T_A[Byte, Int], T_A[Char, Char]]]
val v_a: T_A[T_A[Char, T_A[Char, Char]], T_A[T_A[Byte, Int], T_A[Char, Char]]] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 0
  case CC_B() => 1
}
}
