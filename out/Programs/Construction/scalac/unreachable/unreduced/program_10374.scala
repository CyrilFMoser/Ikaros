package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[T_A[T_B[(Int,Int)]]]
case class CC_B(a: T_A[Int]) extends T_A[T_A[T_B[(Int,Int)]]]
case class CC_C[C]() extends T_A[T_A[T_B[(Int,Int)]]]

val v_a: T_A[T_A[T_B[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()