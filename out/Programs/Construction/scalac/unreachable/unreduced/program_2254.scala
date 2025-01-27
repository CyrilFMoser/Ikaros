package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[CC_A], b: T_B[T_B[(Char,Char), CC_A], CC_A]) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: T_A[Byte]) extends T_A[Byte]
case class CC_D[D, E](a: T_B[D, D]) extends T_B[D, E]
case class CC_E[G, F](a: F) extends T_B[G, F]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_E(_))) => 0 
  case CC_D(CC_E(_)) => 1 
  case CC_E(CC_B(_, CC_D(_))) => 2 
  case CC_E(CC_B(_, CC_E(_))) => 3 
}
}
// This is not matched: CC_D(CC_D(CC_D(_)))