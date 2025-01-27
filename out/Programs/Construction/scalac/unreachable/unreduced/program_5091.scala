package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_B[Char, Byte]]) extends T_A[T_A[Boolean]]
case class CC_B(a: Boolean, b: T_A[T_B[CC_A, CC_A]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: Int) extends T_A[T_A[Boolean]]
case class CC_D[D, E](a: (CC_B,CC_A)) extends T_B[E, D]
case class CC_E[G, F](a: CC_B, b: CC_A, c: F) extends T_B[G, F]
case class CC_F[H](a: H, b: Byte) extends T_B[H, CC_A]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_A(CC_C(_), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(_) => 6 
}
}