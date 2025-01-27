package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[(Int,Int), T_A[Boolean, Int]], C]
case class CC_B[D]() extends T_A[T_A[(Int,Int), T_A[Boolean, Int]], D]
case class CC_C[E](a: CC_A[E], b: Char) extends T_A[T_A[(Int,Int), T_A[Boolean, Int]], T_A[CC_B[Int], CC_A[Int]]]

val v_a: T_A[T_A[(Int,Int), T_A[Boolean, Int]], T_A[CC_B[Int], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()