package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[CC_A], c: (CC_A,T_A[CC_A])) extends T_A[T_A[T_A[(Byte,Int)]]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_B]]) extends T_A[T_A[T_A[(Byte,Int)]]]

val v_a: T_A[T_A[T_A[(Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)