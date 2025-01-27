package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: (T_B,Int)) extends T_A[C, D]
case class CC_B[F, G](a: T_B, b: T_A[G, G]) extends T_A[F, G]
case class CC_C(a: T_A[Boolean, T_B], b: (T_B,T_B), c: T_A[Byte, (Byte,Byte)]) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A((CC_C(_, _, _),12)) => 1 
  case CC_A((CC_D(_),12)) => 2 
  case CC_A((CC_C(_, _, _),_)) => 3 
  case CC_B(CC_D(_), _) => 4 
  case CC_B(CC_C(_, _, _), CC_A(_)) => 5 
  case CC_B(CC_C(_, _, _), CC_B(_, _)) => 6 
  case CC_B(_, CC_B(_, _)) => 7 
}
}
// This is not matched: (CC_A Boolean Boolean T_B Wildcard (T_A Boolean Boolean))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (Tuple Char Char)))