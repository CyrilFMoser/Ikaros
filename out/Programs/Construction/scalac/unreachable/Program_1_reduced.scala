object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a:     T_B , b: T_A[CC_A], c: CC_A) extends T_A[T_B]
val v_a: T_A[T_B] = null
val v_b      = v_a match{
  case CC_A(_, CC_A(_, _)) => 0
  case CC_A(_, CC_B(_, _, _)) => 1
  case CC_B(CC_A      , _, _) => 5
}
}
