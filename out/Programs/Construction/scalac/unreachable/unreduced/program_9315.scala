package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, E], b: T_A[D, D], c: D) extends T_A[D, E]
case class CC_B[G, F](a: T_B[G]) extends T_A[F, G]
case class CC_C[I, H](a: Boolean) extends T_A[H, I]
case class CC_D() extends T_B[T_A[T_A[Boolean, Char], T_A[Char, Char]]]
case class CC_E(a: Char, b: CC_C[Boolean, T_A[(Byte,Boolean), CC_D]]) extends T_B[T_A[T_A[Boolean, Char], T_A[Char, Char]]]

val v_a: T_A[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _, _), CC_D()), CC_A(_, _, CC_D()), CC_D()) => 0 
  case CC_A(CC_A(_, CC_A(_, _, _), CC_D()), CC_B(_), CC_D()) => 1 
  case CC_A(CC_A(_, CC_A(_, _, _), CC_D()), CC_C(_), CC_D()) => 2 
  case CC_A(CC_A(_, CC_B(_), CC_D()), CC_A(_, _, CC_D()), CC_D()) => 3 
  case CC_A(CC_A(_, CC_B(_), CC_D()), CC_B(_), CC_D()) => 4 
  case CC_A(CC_A(_, CC_B(_), CC_D()), CC_C(_), CC_D()) => 5 
  case CC_A(CC_A(_, CC_C(_), CC_D()), CC_A(_, _, CC_D()), CC_D()) => 6 
  case CC_A(CC_A(_, CC_C(_), CC_D()), CC_B(_), CC_D()) => 7 
  case CC_A(CC_A(_, CC_C(_), CC_D()), CC_C(_), CC_D()) => 8 
  case CC_A(CC_B(_), CC_A(_, _, CC_D()), CC_D()) => 9 
  case CC_A(CC_B(_), CC_B(_), CC_D()) => 10 
  case CC_A(CC_B(_), CC_C(_), CC_D()) => 11 
  case CC_A(CC_C(_), CC_A(_, _, CC_D()), CC_D()) => 12 
  case CC_A(CC_C(_), CC_B(_), CC_D()) => 13 
  case CC_A(CC_C(_), CC_C(_), CC_D()) => 14 
  case CC_B(_) => 15 
  case CC_C(_) => 16 
}
}