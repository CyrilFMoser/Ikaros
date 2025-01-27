package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C[B](a: T_B[B], b: (CC_B,CC_A)) extends T_A
case class CC_D[C](a: C, b: C, c: T_A) extends T_B[C]
case class CC_E[D](a: CC_A, b: Int) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_B(CC_E(_, _)) => 2 
  case CC_C(_, (CC_B(_),CC_A())) => 3 
  case CC_C(_, _) => 4 
  case CC_C(CC_D(_, _, _), (CC_B(_),CC_A())) => 5 
  case CC_C(CC_F(), (CC_B(_),CC_A())) => 6 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Byte Byte Boolean Wildcard (T_A Byte Byte))