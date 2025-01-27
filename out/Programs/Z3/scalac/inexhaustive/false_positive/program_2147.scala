package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Byte]
case class CC_B[B]() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Boolean (T_A Byte))
// This is not matched: (CC_B Byte (T_A Byte))