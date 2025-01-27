package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Byte))
// This is not matched: (CC_A Byte (T_A Byte))