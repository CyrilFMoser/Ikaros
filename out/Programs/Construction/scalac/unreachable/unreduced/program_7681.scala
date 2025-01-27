package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, (Byte,Byte)], Byte], b: Char, c: Boolean) extends T_A[T_A[Int]]
case class CC_B(a: T_A[CC_A], b: T_A[CC_A]) extends T_A[T_A[Int]]
case class CC_C() extends T_B[(T_B[CC_B, CC_A],CC_B), T_B[CC_A, T_B[CC_A, CC_A]]]
case class CC_D[E, D](a: D, b: D, c: T_A[T_A[Int]]) extends T_B[E, D]
case class CC_E[F](a: F, b: F) extends T_B[F, CC_C]

val v_a: T_B[(T_B[CC_B, CC_A],CC_B), T_B[CC_A, T_B[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_A(_, _, _)), CC_D(_, _, _), CC_A(CC_D(_, _, _), 'x', _)) => 1 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_B(_, _)), CC_D(_, _, _), CC_A(CC_D(_, _, _), 'x', _)) => 2 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_A(_, _, _)), CC_D(_, _, _), CC_A(CC_D(_, _, _), _, _)) => 3 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_B(_, _)), CC_D(_, _, _), CC_A(CC_D(_, _, _), _, _)) => 4 
  case CC_D(CC_D(CC_D(_, _, _), _, CC_B(_, _)), CC_D(_, _, _), CC_B(_, _)) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_D(_, _, _), _, CC_A(_, _, _)), CC_D(_, _, _), CC_B(_, _))