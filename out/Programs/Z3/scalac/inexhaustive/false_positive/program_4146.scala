package Program_14 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: Byte) extends T_A
case class CC_C[C](a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 0) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants