package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], Boolean], b: T_A[T_B[Char, Byte]], c: Int) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_B(a: T_B[T_B[CC_A, (Boolean,Int)], (CC_A,Char)]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_C(a: T_B[Char, T_A[CC_A]]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_D[D, E](a: T_B[D, D], b: CC_C) extends T_B[D, E]
case class CC_E[G, F](a: (T_B[CC_C, Byte],T_A[Boolean]), b: F, c: G) extends T_B[F, G]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_D(CC_D(_, _), _)) => 0 
  case CC_C(CC_D(CC_E(_, _, _), _)) => 1 
  case CC_C(CC_E(_, _, _)) => 2 
}
}