package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: Byte, c: E) extends T_A[E, T_B[E, E]]
case class CC_B[F]() extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_A[G, T_B[G, G]], b: T_A[T_A[G, G], T_B[T_A[G, G], T_A[G, G]]]) extends T_A[G, T_B[G, G]]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_C(CC_A(_, _, _), CC_B()) => 3 
  case CC_C(CC_A(_, _, _), CC_C(_, _)) => 4 
  case CC_C(CC_B(), CC_A(_, _, _)) => 5 
  case CC_C(CC_B(), CC_B()) => 6 
  case CC_C(CC_B(), CC_C(_, _)) => 7 
  case CC_C(CC_C(_, _), CC_B()) => 8 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 9 
}
}
// This is not matched: CC_C(CC_C(_, _), CC_A(_, _, _))