package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: CC_A) extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_C() extends T_A[T_A[T_A[(Boolean,Char)]]]

val v_a: T_A[T_A[T_A[(Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}