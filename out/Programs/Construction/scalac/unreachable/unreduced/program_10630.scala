package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Byte]
case class CC_B[D, E](a: T_A[E], b: T_B[E, E]) extends T_B[E, D]
case class CC_C[F](a: T_B[F, F], b: F) extends T_B[(T_B[CC_A, CC_A],T_B[CC_A, CC_A]), F]
case class CC_D[G](a: T_B[G, G]) extends T_B[(T_B[CC_A, CC_A],T_B[CC_A, CC_A]), G]

val v_a: T_B[(T_B[CC_A, CC_A],T_B[CC_A, CC_A]), Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 1 
  case CC_B(_, CC_B(_, CC_D(_))) => 2 
  case CC_B(_, CC_C(CC_B(_, _), (_,_))) => 3 
  case CC_B(_, CC_C(CC_C(_, _), (_,_))) => 4 
  case CC_B(_, CC_C(CC_D(_), (_,_))) => 5 
  case CC_B(_, CC_D(_)) => 6 
  case CC_C(_, _) => 7 
  case CC_D(CC_B(_, _)) => 8 
}
}