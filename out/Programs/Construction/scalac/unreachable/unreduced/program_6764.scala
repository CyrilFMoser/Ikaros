package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_A[T_B[Int]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: Int) extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: CC_B) extends T_A[T_B[T_B[Boolean]]]
case class CC_D(a: CC_C) extends T_B[T_A[CC_B]]
case class CC_E() extends T_B[T_A[CC_B]]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
}
}