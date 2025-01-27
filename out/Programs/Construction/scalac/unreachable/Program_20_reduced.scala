object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: Int) extends T_A
case class CC_D() extends T_B
val v_a: T_A = null
val v_b      = v_a match{
  case CC_A(CC_A(_)) => 0
  case CC_A(CC_B(_, _)) => 1
  case CC_B(_, _) => 3
}
}
