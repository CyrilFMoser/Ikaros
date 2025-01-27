package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Byte, Byte],T_A[Char, Int]), b: T_B[T_A[Boolean, E], E], c: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[H, G](a: CC_A[G], b: Byte) extends T_A[G, H]
case class CC_D(a: CC_B[Int], b: CC_B[CC_A[Char]], c: CC_B[CC_A[Byte]]) extends T_B[T_A[T_A[Byte, Char], Byte], T_A[CC_C[Char, Byte], (Int,(Byte,Boolean))]]
case class CC_E(a: CC_D, b: Char) extends T_B[T_A[T_A[Byte, Char], Byte], T_A[CC_C[Char, Byte], (Int,(Byte,Boolean))]]
case class CC_F(a: Char, b: T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]], c: T_A[T_B[Char, (Char,Boolean)], CC_B[CC_E]]) extends T_B[T_A[T_A[Byte, Char], Byte], T_A[CC_C[Char, Byte], (Int,(Byte,Boolean))]]

val v_a: T_B[T_A[T_A[Byte, Char], Byte], T_A[CC_C[Char, Byte], (Int,(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_D(CC_B(_), CC_B(_), CC_B(_)), _) => 1 
  case CC_F('x', CC_A(_, _, _), CC_C(CC_A(_, _, _), _)) => 2 
  case CC_F('x', CC_B(_), CC_C(CC_A(_, _, _), _)) => 3 
  case CC_F('x', CC_C(_, _), CC_C(CC_A(_, _, _), _)) => 4 
  case CC_F(_, CC_A(_, _, _), CC_C(CC_A(_, _, _), _)) => 5 
  case CC_F(_, CC_B(_), CC_C(CC_A(_, _, _), _)) => 6 
}
}
// This is not matched: CC_F(_, CC_C(_, _), CC_C(CC_A(_, _, _), _))