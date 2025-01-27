package Program_12 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: Byte, b: T_A[D], c: C) extends T_A[C]
case class CC_C[E](a: CC_B[E, E], b: (Boolean,T_B)) extends T_A[E]
case class CC_D(a: CC_C[T_B], b: T_A[T_B]) extends T_B
case class CC_E() extends T_B

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), (_,CC_D(_, _))) => 0 
  case CC_C(_, (_,CC_D(_, _))) => 1 
}
}
// This is not matched: (CC_C Byte Wildcard (Tuple Wildcard (CC_E T_B)) (T_A Byte))
// This is not matched: Pattern match is empty without constants