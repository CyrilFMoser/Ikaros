package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Int, c: T_B[C]) extends T_A[C]
case class CC_B(a: T_A[Char]) extends T_A[T_A[(Byte,Int)]]
case class CC_C[D, E]() extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_C(), _, _) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
}
}
// This is not matched: (CC_A Byte (CC_C Byte Boolean (T_A Byte)) Int Wildcard (T_A Byte))
// This is not matched: (CC_A Int (CC_B Int Wildcard Wildcard (T_A Int)) (T_A Int))