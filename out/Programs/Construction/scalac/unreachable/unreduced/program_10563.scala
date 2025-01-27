package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, F], b: E, c: T_A[F, F]) extends T_A[E, F]
case class CC_B[G](a: G) extends T_A[G, T_B[Char, CC_A[Byte, Char]]]
case class CC_C[H](a: T_A[H, H], b: T_A[H, H]) extends T_A[H, T_B[Char, CC_A[Byte, Char]]]
case class CC_D(a: CC_C[T_B[Boolean, Char]], b: Char) extends T_B[CC_C[CC_C[Int]], Int]

val v_a: T_A[Char, T_B[Char, CC_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_B(_)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_C(_, _)) => 2 
  case CC_A(CC_B(_), _, CC_A(_, _, _)) => 3 
  case CC_A(CC_B(_), _, CC_B(_)) => 4 
  case CC_A(CC_B(_), _, CC_C(_, _)) => 5 
  case CC_A(CC_C(_, _), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_C(_, _), _, CC_B(_)) => 7 
  case CC_A(CC_C(_, _), _, CC_C(_, _)) => 8 
  case CC_B(_) => 9 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 10 
}
}