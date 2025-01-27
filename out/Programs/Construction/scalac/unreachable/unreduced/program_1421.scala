package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: CC_A, c: T_A) extends T_A
case class CC_C(a: T_A) extends T_B[CC_B, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}