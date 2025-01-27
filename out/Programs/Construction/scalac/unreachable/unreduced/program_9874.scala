package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_A[Byte]]
case class CC_D[G](a: T_B[G, G], b: (T_A[Char],T_A[Boolean]), c: T_B[G, T_A[Byte]]) extends T_B[G, T_A[Int]]
case class CC_E[H]() extends T_B[H, T_A[Int]]

val v_a: T_B[Byte, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D(_, (CC_A(_, _),CC_B(_, _)), CC_C()) => 0 
  case CC_D(_, (CC_B(_, _),CC_A(_, _)), CC_C()) => 1 
  case CC_D(_, (CC_B(_, _),CC_B(_, _)), CC_C()) => 2 
  case CC_E() => 3 
}
}
// This is not matched: CC_D(_, (CC_A(_, _),CC_A(_, _)), CC_C())