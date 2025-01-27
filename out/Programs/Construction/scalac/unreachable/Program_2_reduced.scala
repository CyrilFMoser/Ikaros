object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b:         Byte              , c: CC_A[Boolean]) extends T_A
case class CC_D() extends T_A
case class CC_E(a: T_B[T_A, Boolean]) extends T_A
case class CC_H   (             ) extends T_B
val v_a: T_A = null
val v_b      = v_a match{
  case CC_A() => 0
  case CC_B() => 1
  case CC_C(_, _, CC_A()) => 2
  case CC_D() => 3
  case CC_E(_) => 4
}
}
