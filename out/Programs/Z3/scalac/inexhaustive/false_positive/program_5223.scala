package Program_9 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[D]]
case class CC_B(a: CC_A[Boolean], b: (Byte,Char)) extends T_A[T_B[Byte], T_B[T_B[Byte]]]
case class CC_C[E](a: E) extends T_B[CC_B]
case class CC_D[F](a: T_B[CC_B], b: T_B[CC_B], c: T_A[F, F]) extends T_B[F]
case class CC_E(a: Byte) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_) => 1 
  case CC_D(_, CC_D(_, _, _), _) => 2 
  case CC_D(CC_C(_), CC_C(_), _) => 3 
  case CC_D(CC_D(_, _, _), _, _) => 4 
  case CC_D(_, CC_C(_), _) => 5 
  case CC_D(CC_E(_), CC_E(_), _) => 6 
  case CC_D(CC_C(_), _, _) => 7 
}
}
// This is not matched: (CC_C (CC_B Boolean (T_A Boolean Boolean) Boolean)
//      Wildcard
//      (T_B (CC_B (T_B Boolean) (T_B Boolean) (T_B Boolean))))
// This is not matched: (CC_B Wildcard Byte T_A)