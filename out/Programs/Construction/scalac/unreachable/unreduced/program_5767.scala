package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Boolean], T_A[Byte]]) extends T_A[T_B[T_A[Boolean], Int]]
case class CC_B[D, E](a: D, b: T_B[D, E], c: (T_B[CC_A, Byte],T_A[Byte])) extends T_B[D, E]
case class CC_C[F](a: F, b: (T_B[CC_A, CC_A],T_B[CC_A, Boolean])) extends T_B[F, Boolean]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (CC_B(_, _, _),_)) => 0 
  case CC_C(_, _) => 1 
}
}