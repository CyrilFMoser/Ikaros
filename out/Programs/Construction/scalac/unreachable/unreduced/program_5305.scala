package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[T_A[Int]], c: T_A[Int]) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_C(a: (CC_B,CC_B)) extends T_A[T_A[T_A[(Boolean,Int)]]]

val v_a: T_A[T_A[T_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C((CC_B(),CC_B()))