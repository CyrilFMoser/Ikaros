package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[E, E], T_A[E, E]], E]
case class CC_B(a: T_B[T_B[Byte, Int], CC_A[Char]], b: Char) extends T_A[T_A[T_B[CC_A[T_B[Boolean, Char]], CC_A[T_B[Boolean, Char]]], T_A[CC_A[T_B[Boolean, Char]], CC_A[T_B[Boolean, Char]]]], CC_A[T_B[Boolean, Char]]]
case class CC_C[F](a: T_B[F, T_A[F, F]]) extends T_B[F, T_A[F, F]]
case class CC_D[G, H](a: Boolean, b: (T_A[CC_B, Int],T_B[CC_B, Char]), c: Char) extends T_B[G, T_A[G, G]]

val v_a: T_B[CC_B, T_A[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, _, _)) => 1 
  case CC_D(_, (_,_), _) => 2 
}
}