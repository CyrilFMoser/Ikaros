package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Int,Char)]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_A[(Int,Char)]]]
case class CC_C() extends T_A[T_A[T_A[(Int,Char)]]]

val v_a: T_A[T_A[T_A[(Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}