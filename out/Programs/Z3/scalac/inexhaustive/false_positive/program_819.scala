package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B() extends T_A[(Byte,Byte)]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: Pattern match is empty without constants