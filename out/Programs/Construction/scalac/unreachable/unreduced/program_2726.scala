package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Boolean]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, Boolean]
case class CC_C(a: T_A[Int, Boolean], b: T_A[T_A[Int, Char], Boolean], c: T_A[T_A[Int, Boolean], T_A[Byte, Boolean]]) extends T_A[Int, Boolean]
case class CC_D[H, G]() extends T_B[H, G]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(), CC_A(), _) => 2 
  case CC_C(CC_B(_), CC_A(), _) => 3 
  case CC_C(CC_C(_, _, _), CC_A(), _) => 4 
  case CC_C(CC_A(), CC_B(_), _) => 5 
  case CC_C(CC_B(_), CC_B(_), _) => 6 
  case CC_C(CC_C(_, _, _), CC_B(_), _) => 7 
}
}