object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: C, c: Byte) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, D], b: D, c:         Char           ) extends T_A[D, Char]
val v_a: T_A[Int, Char] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 3
  case CC_B(_, _, _) => 4
}
}
