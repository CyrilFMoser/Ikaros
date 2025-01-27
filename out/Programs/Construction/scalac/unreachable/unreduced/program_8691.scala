package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G, H](a: T_B[G, (Boolean,Int)], b: G) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: T_A[I, I]) extends T_B[CC_A[T_A[Boolean, (Int,Boolean)], T_A[Byte, Char]], I]
case class CC_D[J](a: Char, b: T_A[J, J], c: Char) extends T_B[CC_A[T_A[Boolean, (Int,Boolean)], T_A[Byte, Char]], J]
case class CC_E[K](a: Int) extends T_B[CC_A[T_A[Boolean, (Int,Boolean)], T_A[Byte, Char]], K]

val v_a: T_B[CC_A[T_A[Boolean, (Int,Boolean)], T_A[Byte, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_D(_, CC_A(), _) => 1 
  case CC_D(_, CC_B(_, _), _) => 2 
  case CC_E(12) => 3 
  case CC_E(_) => 4 
}
}
// This is not matched: CC_C(_, CC_B(_, _))