package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[Byte], D]
case class CC_B[E]() extends T_A[T_B[Byte], E]
case class CC_C(a: T_A[T_B[Byte], T_B[Char]], b: T_A[T_B[Byte], T_B[Char]], c: T_A[Char, CC_A[Char]]) extends T_B[Char]
case class CC_D[F](a: T_B[F], b: CC_B[F], c: T_A[F, F]) extends T_B[F]
case class CC_E(a: CC_A[CC_C]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A(), _) => 0 
  case CC_C(CC_B(), CC_A(), _) => 1 
  case CC_C(CC_A(), CC_B(), _) => 2 
  case CC_C(CC_B(), CC_B(), _) => 3 
  case CC_D(CC_C(CC_A(), _, _), CC_B(), _) => 4 
  case CC_D(CC_C(CC_B(), _, _), CC_B(), _) => 5 
  case CC_D(CC_D(CC_C(_, _, _), CC_B(), _), CC_B(), _) => 6 
  case CC_D(CC_D(CC_D(_, _, _), CC_B(), _), CC_B(), _) => 7 
  case CC_D(CC_D(CC_E(_), CC_B(), _), CC_B(), _) => 8 
  case CC_D(CC_E(CC_A()), CC_B(), _) => 9 
  case CC_E(CC_A()) => 10 
}
}