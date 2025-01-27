package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[D], D]
case class CC_B[E]() extends T_A[T_B[E], E]
case class CC_C[F](a: F, b: T_A[T_B[T_A[Byte, F]], T_A[Byte, F]], c: T_A[T_B[F], F]) extends T_B[F]
case class CC_D(a: T_B[T_B[Boolean]], b: T_A[CC_B[Char], CC_B[Byte]], c: (CC_B[Int],Int)) extends T_B[T_A[T_B[CC_A[(Char,Boolean)]], CC_A[(Char,Boolean)]]]
case class CC_E(a: CC_B[Int]) extends T_B[T_A[T_B[CC_A[(Char,Boolean)]], CC_A[(Char,Boolean)]]]

val v_a: T_B[T_A[T_B[CC_A[(Char,Boolean)]], CC_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(CC_C(_, _, _)), CC_A(_)) => 0 
  case CC_C(CC_A(_), CC_A(CC_C(_, _, _)), CC_B()) => 1 
  case CC_C(CC_B(), CC_A(CC_C(_, _, _)), CC_A(_)) => 2 
  case CC_C(CC_B(), CC_A(CC_C(_, _, _)), CC_B()) => 3 
  case CC_C(CC_A(_), CC_B(), CC_A(_)) => 4 
  case CC_C(CC_A(_), CC_B(), CC_B()) => 5 
  case CC_C(CC_B(), CC_B(), CC_A(_)) => 6 
  case CC_C(CC_B(), CC_B(), CC_B()) => 7 
  case CC_D(_, _, (CC_B(),_)) => 8 
  case CC_E(CC_B()) => 9 
}
}