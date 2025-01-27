package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: Byte, c: T_A[T_B[Byte, (Char,Int)]]) extends T_A[T_B[T_A[Boolean], T_B[Byte, Int]]]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_A[T_B[T_A[Boolean], T_B[Byte, Int]]]
case class CC_D[E](a: T_B[E, CC_A], b: T_B[E, E]) extends T_B[E, CC_A]
case class CC_E[F](a: Char, b: T_B[F, CC_A], c: F) extends T_B[F, CC_A]

val v_a: T_B[T_A[T_B[T_A[Boolean], T_B[Byte, Int]]], CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, CC_A(_, _, _)) => 1 
  case CC_E(_, _, CC_B()) => 2 
  case CC_E(_, _, CC_C()) => 3 
}
}