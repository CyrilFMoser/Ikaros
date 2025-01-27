package Program_14 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (Char,Char), c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[CC_A], b: T_A) extends T_A
case class CC_C[B](a: B, b: T_B[B]) extends T_A
case class CC_D[C](a: C, b: T_A, c: CC_A) extends T_B[C]

val v_a: CC_C[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_D(_, _, _)) => 0 
}
}
// This is not matched: (CC_C T_A (CC_C Boolean Boolean Wildcard T_A) Wildcard T_A)
// This is not matched: (CC_A T_A)