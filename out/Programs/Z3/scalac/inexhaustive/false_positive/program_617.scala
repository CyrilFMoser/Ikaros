package Program_31 

package Program_1 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: A) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Byte (CC_A Boolean Wildcard Boolean T_A) Wildcard T_A)
// This is not matched: Pattern match is empty without constants