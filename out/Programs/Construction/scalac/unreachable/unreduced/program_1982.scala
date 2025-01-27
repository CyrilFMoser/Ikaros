package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Int]]) extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_C(a: CC_A, b: Int, c: T_A[(CC_B,Byte)]) extends T_A[T_A[T_A[(Int,Boolean)]]]

val v_a: T_A[T_A[T_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}