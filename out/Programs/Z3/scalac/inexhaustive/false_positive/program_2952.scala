package Program_12 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(Char,Byte)], c: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: Int, c: (T_A,CC_A)) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D[C, D](a: T_B[D], b: Int) extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _), _, _) => 0 
  case CC_B(_, 12, _) => 1 
}
}
// This is not matched: (CC_B (CC_C T_A (T_B T_A)) Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants