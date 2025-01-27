package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_B[D, D]], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: (T_A[Byte],CC_B[Char])) extends T_B[(T_A[Char],T_B[Byte, Boolean]), F]
case class CC_D[G](a: (Int,CC_B[Char]), b: Byte, c: T_A[G]) extends T_B[(T_A[Char],T_B[Byte, Boolean]), T_A[((Boolean,Boolean),Char)]]
case class CC_E[H](a: CC_D[H], b: H, c: H) extends T_B[CC_D[T_B[Char, (Char,Boolean)]], H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_B(_), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_))) => 3 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_A(_, _), CC_B(_))) => 4 
  case CC_A(CC_B(_), CC_A(CC_A(_, _), CC_B(_))) => 5 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_), CC_A(_, _))) => 6 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_B(_), CC_A(_, _))) => 7 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_A(_, _))) => 8 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_), CC_B(_))) => 9 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_B(_), CC_B(_))) => 10 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_B(_))) => 11 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_)) => 12 
  case CC_A(CC_A(CC_B(_), _), CC_B(_)) => 13 
  case CC_A(CC_B(_), CC_B(_)) => 14 
  case CC_B(_) => 15 
}
}