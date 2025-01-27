package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Boolean]], c: T_A[Byte]) extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_B() extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_C() extends T_A[T_A[T_A[(Int,Boolean)]]]

val v_a: T_A[T_A[T_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()