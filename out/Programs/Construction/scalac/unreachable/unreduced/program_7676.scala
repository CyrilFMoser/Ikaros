package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Int],T_B[Boolean, Boolean]), b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F]) extends T_A[F]
case class CC_D[G](a: G, b: Byte) extends T_B[G, Char]
case class CC_E[H](a: CC_A[H], b: H) extends T_B[H, T_A[T_A[H]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _), CC_A((_,_), CC_D(_, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_D(_, _), CC_A((_,_), CC_D(_, _), CC_B(_))) => 1 
  case CC_A(_, CC_D(_, _), CC_A((_,_), CC_D(_, _), CC_C(_))) => 2 
  case CC_A(_, CC_D(_, _), CC_B(CC_A(_, _, _))) => 3 
  case CC_A(_, CC_D(_, _), CC_B(CC_B(_))) => 4 
  case CC_A(_, CC_D(_, _), CC_B(CC_C(_))) => 5 
  case CC_A(_, CC_D(_, _), CC_C(_)) => 6 
  case CC_B(CC_A(_, _, _)) => 7 
  case CC_B(CC_B(CC_A(_, _, _))) => 8 
  case CC_B(CC_B(CC_B(_))) => 9 
  case CC_B(CC_B(CC_C(_))) => 10 
  case CC_B(CC_C(CC_D(_, _))) => 11 
  case CC_C(CC_D(_, _)) => 12 
}
}