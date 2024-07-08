object Test {
sealed trait T_A
case class CC_A()
case class CC_B(a: T_A, b: Boolean, c:     T_A       )
case class CC_C[C](a: C)
val v_a                 = null
val v_b      = v_a match{
  case CC_C(CC_A  ) => 0
  case CC_C(CC_B(_, _, _)) => 1
}
}
