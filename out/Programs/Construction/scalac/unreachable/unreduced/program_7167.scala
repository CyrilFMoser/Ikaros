package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: T_A[F, F]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I, J](a: T_B[I, I], b: CC_A[I, I]) extends T_A[J, I]
case class CC_D[K](a: T_A[K, K], b: T_A[K, K], c: (CC_A[(Int,Int), (Int,Char)],Byte)) extends T_B[CC_A[T_A[Char, Boolean], Int], K]
case class CC_E[L](a: (T_B[Boolean, Boolean],T_A[Boolean, Boolean])) extends T_B[T_B[T_A[Int, Int], T_A[Char, Byte]], Boolean]
case class CC_F() extends T_B[T_B[T_A[Int, Int], T_A[Char, Byte]], Boolean]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(), CC_A(_, _)) => 1 
  case CC_A(CC_C(_, CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), CC_B()) => 3 
  case CC_A(CC_B(), CC_B()) => 4 
  case CC_A(CC_C(_, CC_A(_, _)), CC_B()) => 5 
  case CC_A(CC_A(_, _), CC_C(_, _)) => 6 
  case CC_A(CC_B(), CC_C(_, _)) => 7 
  case CC_A(CC_C(_, CC_A(_, _)), CC_C(_, _)) => 8 
  case CC_B() => 9 
  case CC_C(_, CC_A(CC_A(_, _), _)) => 10 
  case CC_C(_, CC_A(CC_B(), _)) => 11 
  case CC_C(_, CC_A(CC_C(_, _), _)) => 12 
}
}