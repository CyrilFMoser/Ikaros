package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: T_A[Char]) extends T_A[CC_A[Byte, Byte]]

val v_a: T_A[CC_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A (CC_A Byte Byte (T_A Boolean))
//      Boolean
//      (T_A (CC_A Byte Byte (T_A Boolean))))
// This is not matched: Pattern match is empty without constants