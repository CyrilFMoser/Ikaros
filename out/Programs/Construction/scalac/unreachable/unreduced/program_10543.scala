package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_A[(Int,Byte)]]]

val v_a: T_A[T_A[T_A[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}