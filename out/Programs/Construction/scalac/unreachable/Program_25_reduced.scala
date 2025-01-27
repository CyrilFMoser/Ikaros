object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a:      D , b: Char, c: T_A[     D , D]) extends T_A
case class CC_C(a:      Byte , b: CC_B     [T_B] ) extends T_B
case class CC_D() extends T_B
val v_a: T_B = null
val v_b      = v_a match{
  case CC_C(_, CC_B(_, _, _)) => 0
  case CC_D() => 1
}
}
