package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[Char], c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[T_A], b: Char) extends T_B[T_B[CC_B]]
case class CC_D[B](a: Int) extends T_B[T_B[CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _))