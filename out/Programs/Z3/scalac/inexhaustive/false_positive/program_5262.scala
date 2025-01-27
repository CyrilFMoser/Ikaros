package Program_15 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: (T_B,(Boolean,Byte)), b: T_A[C, D], c: T_B) extends T_A[C, D]
case class CC_B(a: CC_A[T_B, T_B]) extends T_B
case class CC_C[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_C T_B T_B)
// This is not matched: Pattern match is empty without constants