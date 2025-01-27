package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Byte]) extends T_A
case class CC_B[C](a: (CC_A,Byte), b: Int, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: T_B[D, D], b: Byte, c: (T_B[CC_C, CC_C],CC_C)) extends T_B[CC_B[D], D]
case class CC_E[E](a: T_B[CC_B[E], E], b: E) extends T_B[CC_B[E], E]
case class CC_F[F](a: CC_E[CC_E[F]]) extends T_B[CC_B[F], F]

val v_a: T_B[CC_B[CC_C], CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _, (_,CC_C())) => 0 
  case CC_E(CC_D(_, _, (_,_)), CC_C()) => 1 
  case CC_E(CC_E(CC_D(_, _, _), CC_C()), CC_C()) => 2 
  case CC_E(CC_E(CC_E(_, _), CC_C()), CC_C()) => 3 
  case CC_E(CC_E(CC_F(_), CC_C()), CC_C()) => 4 
  case CC_E(CC_F(CC_E(_, _)), CC_C()) => 5 
  case CC_F(CC_E(_, _)) => 6 
}
}