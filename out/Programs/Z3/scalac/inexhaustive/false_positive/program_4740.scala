package Program_13 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: A) extends T_A
case class CC_B(a: CC_A[T_A], b: T_A, c: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_A Boolean Wildcard Boolean T_A) Wildcard T_A)
// This is not matched: (CC_B Wildcard
//      (T_A (T_A Boolean Int) (CC_A Byte Char Boolean Boolean Boolean Boolean)))