package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Int)]) extends T_A[T_B[Boolean]]
case class CC_B(a: (T_B[CC_A],CC_A), b: Int) extends T_A[T_B[Boolean]]
case class CC_C(a: Int) extends T_B[T_B[CC_B]]
case class CC_D(a: CC_C, b: CC_A, c: T_A[CC_B]) extends T_B[T_B[CC_B]]
case class CC_E(a: CC_B, b: T_A[T_A[CC_C]], c: Int) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_C(_), _, _) => 1 
  case CC_E(CC_B((_,_), _), _, _) => 2 
}
}