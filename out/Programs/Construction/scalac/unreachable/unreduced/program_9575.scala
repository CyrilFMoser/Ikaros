package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]], c: CC_A) extends T_A[T_A[T_A[(Int,Byte)]]]

val v_a: T_A[T_A[T_A[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
}
}