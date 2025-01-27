package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A], c: Char) extends T_A
case class CC_C(a: CC_B, b: CC_A, c: T_A) extends T_A
case class CC_D(a: T_B[CC_A], b: (T_A,T_B[CC_B])) extends T_B[CC_B]
case class CC_E() extends T_B[T_B[Boolean]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}