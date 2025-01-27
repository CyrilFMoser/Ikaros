package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: (Int,T_A), c: T_A) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,CC_A(_, _, _)), _) => 0 
}
}
// This is not matched: (CC_A Byte (CC_A T_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)
// This is not matched: (CC_C Wildcard (CC_B T_B Wildcard Wildcard (T_A T_B)) T_B)