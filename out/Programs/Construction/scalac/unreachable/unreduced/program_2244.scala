package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[(Int,Byte)]]]
case class CC_B(a: T_A[T_B[Char]], b: Boolean) extends T_A[T_B[T_A[(Int,Byte)]]]
case class CC_C() extends T_A[T_B[T_A[(Int,Byte)]]]

val v_a: T_A[T_B[T_A[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()