package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[F, (T_A[Char],Boolean)]
case class CC_D[G](a: Byte, b: T_A[G], c: T_A[G]) extends T_B[G, (T_A[Char],Boolean)]

val v_a: T_B[Byte, (T_A[Char],Boolean)] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(_, _)) => 1 
  case CC_D(0, CC_A(), CC_A()) => 2 
  case CC_D(0, CC_A(), CC_B(CC_A(), _)) => 3 
  case CC_D(0, CC_A(), CC_B(CC_B(_, _), _)) => 4 
  case CC_D(_, CC_A(), CC_A()) => 5 
  case CC_D(_, CC_A(), CC_B(CC_A(), _)) => 6 
  case CC_D(0, CC_B(CC_A(), _), CC_A()) => 7 
  case CC_D(0, CC_B(CC_A(), _), CC_B(CC_A(), _)) => 8 
  case CC_D(0, CC_B(CC_A(), _), CC_B(CC_B(_, _), _)) => 9 
  case CC_D(_, CC_B(CC_A(), _), CC_A()) => 10 
  case CC_D(_, CC_B(CC_A(), _), CC_B(CC_A(), _)) => 11 
  case CC_D(_, CC_B(CC_A(), _), CC_B(CC_B(_, _), _)) => 12 
  case CC_D(0, CC_B(CC_B(_, _), _), CC_A()) => 13 
  case CC_D(0, CC_B(CC_B(_, _), _), CC_B(CC_A(), _)) => 14 
  case CC_D(0, CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), _)) => 15 
  case CC_D(_, CC_B(CC_B(_, _), _), CC_A()) => 16 
  case CC_D(_, CC_B(CC_B(_, _), _), CC_B(CC_A(), _)) => 17 
  case CC_D(_, CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), _)) => 18 
}
}
// This is not matched: CC_D(_, CC_A(), CC_B(CC_B(_, _), _))