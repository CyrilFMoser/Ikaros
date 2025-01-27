package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_A[E, T_B[E]]
case class CC_C(a: T_A[CC_B[Byte], T_B[CC_B[Byte]]], b: CC_A[(Boolean,Int)]) extends T_B[T_A[T_B[Boolean], T_B[(Int,Int)]]]
case class CC_D[F](a: Int, b: T_A[F, T_B[F]]) extends T_B[T_A[T_B[Boolean], T_B[(Int,Int)]]]
case class CC_E(a: T_B[T_A[CC_C, CC_C]]) extends T_B[T_A[Boolean, T_B[Boolean]]]

val v_a: T_B[T_A[T_B[Boolean], T_B[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_B(), _), CC_A(CC_A(_, _), _)) => 0 
  case CC_C(CC_B(), CC_A(CC_A(_, _), _)) => 1 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(CC_B(), _)) => 2 
  case CC_C(CC_A(CC_B(), _), CC_A(CC_B(), _)) => 3 
  case CC_C(CC_B(), CC_A(CC_B(), _)) => 4 
  case CC_D(12, _) => 5 
  case CC_D(_, _) => 6 
}
}
// This is not matched: CC_C(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), _))