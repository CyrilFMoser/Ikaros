package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[(Char,Byte), Byte],T_B[(Byte,Char), Int]), b: Byte) extends T_A[T_B[T_A[Char], T_B[Int, Char]]]
case class CC_B() extends T_A[CC_A]
case class CC_C() extends T_A[CC_A]
case class CC_D(a: T_A[CC_B]) extends T_B[T_B[T_A[CC_A], T_A[CC_A]], Byte]
case class CC_E[D, E](a: E) extends T_B[E, D]
case class CC_F[G, F](a: CC_B) extends T_B[F, G]

val v_a: T_B[T_B[T_A[CC_A], T_A[CC_A]], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_E(CC_C())) => 1 
  case CC_E(CC_F(CC_B())) => 2 
  case CC_F(CC_B()) => 3 
}
}
// This is not matched: CC_E(CC_E(CC_B()))