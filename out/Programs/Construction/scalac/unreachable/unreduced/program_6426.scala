package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]]) extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_B(a: T_A[Char]) extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_C(a: Int, b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[(Int,Int)]]]

val v_a: T_A[T_A[T_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_)