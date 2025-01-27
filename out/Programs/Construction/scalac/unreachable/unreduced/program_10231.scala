package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[Boolean, C]
case class CC_B(a: CC_A[CC_A[(Int,Int)]]) extends T_A[Boolean, CC_A[T_A[Boolean, Int]]]

val v_a: T_A[Boolean, CC_A[T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}