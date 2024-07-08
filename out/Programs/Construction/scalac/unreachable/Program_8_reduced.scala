object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C, c: T_A[C, C]) extends T_A[C, (T_A[Byte, Byte],T_A[Byte, Int])]
case class CC_C[E](a: Int) extends T_A[E, (T_A[Byte, Byte],T_A[Byte, Int])]
val v_a: T_A[Char, (T_A[Byte, Byte],T_A[Byte, Int])] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 0
  case CC_C(_) => 2
}
}
