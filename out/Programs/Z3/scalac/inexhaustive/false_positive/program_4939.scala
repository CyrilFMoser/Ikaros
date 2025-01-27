package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: C, c: T_B) extends T_A[T_B, (Byte,T_B)]
case class CC_B() extends T_A[T_B, (Byte,T_B)]
case class CC_C(a: (Byte,CC_B)) extends T_A[T_B, (Byte,T_B)]
case class CC_D(a: Int) extends T_B

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A Byte (T_A Int Int)))