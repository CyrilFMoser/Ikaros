package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_B(a: Boolean, b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_C() extends T_A[T_A[T_A[(Boolean,Byte)]]]

val v_a: T_A[T_A[T_A[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)