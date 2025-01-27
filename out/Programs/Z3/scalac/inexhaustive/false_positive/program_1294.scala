package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F](a: CC_B[F]) extends T_B
case class CC_D(a: T_A[T_B, T_B], b: (T_B,T_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(CC_A(), _) => 1 
  case CC_D(_, _) => 2 
  case CC_D(_, (CC_D(_, _),CC_D(_, _))) => 3 
  case CC_D(CC_A(), (CC_D(_, _),CC_D(_, _))) => 4 
  case CC_D(_, (CC_C(_),CC_D(_, _))) => 5 
  case CC_D(CC_A(), (CC_C(_),CC_D(_, _))) => 6 
}
}
// This is not matched: (CC_C T_B Wildcard T_B)
// This is not matched: (CC_B Boolean (T_A Boolean))