package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]
case class CC_C[E]() extends T_A[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B Byte T_B (T_A Byte))
// This is not matched: (CC_B Byte T_B (T_A Byte))