package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[T_B[T_B[Char, Boolean], Char]]) extends T_A[D]
case class CC_B[F](a: F, b: (CC_A[Char],T_A[Byte]), c: CC_A[F]) extends T_A[F]
case class CC_C() extends T_A[T_B[T_A[Char], T_A[Int]]]
case class CC_D() extends T_B[(CC_B[Int],T_A[(Char,Boolean)]), Int]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_, _, _)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(_, _)) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, _)) => 3 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(_, _)) => 4 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_B(_, _, _)) => 5 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, _)) => 6 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 7 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 8 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 9 
  case CC_B(_, _, _) => 10 
}
}