package Program_30 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: T_A[D], b: T_B) extends T_A[C]
case class CC_C[E](a: ((Int,Int),Int)) extends T_A[E]
case class CC_D(a: Int) extends T_B
case class CC_E[F](a: T_A[F]) extends T_B
case class CC_F() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
  case CC_B(CC_B(_, _), CC_E(_)) => 4 
  case CC_B(CC_B(_, _), CC_F()) => 5 
}
}
// This is not matched: (CC_B Int Byte (CC_C Byte Wildcard (T_A Byte)) (CC_D Int T_B) (T_A Int))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_B Boolean (Tuple Byte Char)))