package Program_30 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (Int,CC_A), b: CC_A, c: Boolean) extends T_A
case class CC_C(a: Int, b: (CC_A,Int)) extends T_A
case class CC_D[B](a: T_B[B], b: CC_A, c: CC_C) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), CC_A(), _) => 0 
}
}
// This is not matched: (CC_D T_A Wildcard Wildcard Wildcard (T_B Byte))
// This is not matched: (CC_A (T_B (T_A Byte Boolean)) (T_A Byte (T_B (T_A Byte Boolean))))