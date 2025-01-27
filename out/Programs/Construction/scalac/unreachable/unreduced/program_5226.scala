package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: C, c: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: CC_A[D], c: Boolean) extends T_A[D, T_A[T_A[T_A[D, T_B], T_A[D, T_B]], T_A[D, T_B]]]
case class CC_C[E](a: CC_B[E]) extends T_A[E, T_A[T_A[T_A[E, T_B], T_A[E, T_B]], T_A[E, T_B]]]
case class CC_D() extends T_B
case class CC_E(a: T_A[(CC_D,CC_D), Int], b: T_B, c: T_A[T_A[CC_D, CC_D], CC_D]) extends T_B
case class CC_F(a: CC_C[T_A[CC_E, Boolean]], b: T_A[Byte, CC_E], c: T_B) extends T_B

val v_a: T_A[T_B, T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), _, true) => 0 
  case CC_B(CC_E(_, _, _), _, true) => 1 
  case CC_B(CC_F(CC_C(_), _, _), _, true) => 2 
  case CC_B(CC_D(), _, false) => 3 
  case CC_B(CC_E(_, _, _), _, false) => 4 
  case CC_B(CC_F(CC_C(_), _, _), _, false) => 5 
  case CC_C(CC_B(_, _, _)) => 6 
}
}