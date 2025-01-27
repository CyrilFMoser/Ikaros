package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_B[T_A[(Int,Int)]]]
case class CC_B() extends T_A[T_B[T_A[(Int,Int)]]]
case class CC_C(a: T_A[Int], b: Int, c: T_B[T_A[CC_A]]) extends T_A[T_B[T_A[(Int,Int)]]]

val v_a: T_A[T_B[T_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}