package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[(Char,Boolean)]], D]
case class CC_B[E](a: E, b: T_B[E], c: T_A[E, E]) extends T_A[T_B[T_B[(Char,Boolean)]], E]
case class CC_C[F](a: F, b: T_B[F]) extends T_B[F]
case class CC_D(a: T_B[CC_A[Byte]], b: T_A[CC_B[Byte], T_B[Char]]) extends T_B[Int]

val v_a: T_A[T_B[T_B[(Char,Boolean)]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D(CC_C(_, _), _)) => 1 
  case CC_B(_, CC_C(_, CC_C(_, _)), _) => 2 
  case CC_B(_, CC_C(_, CC_D(_, _)), _) => 3 
  case CC_B(_, CC_D(CC_C(_, _), _), _) => 4 
}
}