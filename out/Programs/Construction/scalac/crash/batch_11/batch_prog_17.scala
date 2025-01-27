package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F]() extends T_A[F, T_B[F, F]]
case class CC_C[G](a: CC_A[G], b: G, c: T_A[G, T_B[G, G]]) extends T_A[G, T_B[G, G]]
case class CC_D[H](a: H, b: T_A[H, T_B[H, H]], c: T_A[H, T_B[H, H]]) extends T_B[T_B[H, H], H]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_D('x', CC_A(), CC_A()) => 0 
  case CC_D(_, CC_A(), CC_A()) => 1 
  case CC_D('x', CC_A(), CC_B()) => 2 
  case CC_D(_, CC_A(), CC_B()) => 3 
  case CC_D('x', CC_A(), CC_C(_, _, _)) => 4 
  case CC_D(_, CC_A(), CC_C(_, _, _)) => 5 
  case CC_D('x', CC_B(), CC_A()) => 6 
  case CC_D(_, CC_B(), CC_A()) => 7 
  case CC_D('x', CC_B(), CC_B()) => 8 
  case CC_D(_, CC_B(), CC_B()) => 9 
  case CC_D('x', CC_B(), CC_C(_, _, _)) => 10 
  case CC_D(_, CC_B(), CC_C(_, _, _)) => 11 
  case CC_D('x', CC_C(CC_A(), _, _), CC_A()) => 12 
  case CC_D(_, CC_C(CC_A(), _, _), CC_A()) => 13 
  case CC_D('x', CC_C(CC_A(), _, _), CC_B()) => 14 
  case CC_D(_, CC_C(CC_A(), _, _), CC_B()) => 15 
  case CC_D('x', CC_C(CC_A(), _, _), CC_C(_, _, _)) => 16 
  case CC_D(_, CC_C(CC_A(), _, _), CC_C(_, _, _)) => 17 
}
}