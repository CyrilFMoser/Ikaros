package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Byte]], b: T_A[Int, (Int,Boolean)], c: T_A[T_A[Char, Boolean], (Byte,Char)]) extends T_A[Int, Char]
case class CC_B() extends T_A[Int, Char]
case class CC_C(a: T_B[CC_A], b: (CC_B,CC_A)) extends T_A[Int, Char]
case class CC_D[D](a: T_A[Int, Char], b: T_A[Int, Char]) extends T_B[D]
case class CC_E[E](a: E, b: E, c: E) extends T_B[E]
case class CC_F[F](a: CC_E[F], b: CC_E[F]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_A(CC_D(_, _), _, _)) => 0 
  case CC_D(CC_A(_, _, _), CC_A(CC_E(_, _, _), _, _)) => 1 
  case CC_D(CC_A(_, _, _), CC_A(CC_F(_, _), _, _)) => 2 
  case CC_D(CC_A(_, _, _), CC_B()) => 3 
  case CC_D(CC_A(_, _, _), CC_C(_, (_,_))) => 4 
  case CC_D(CC_B(), CC_A(CC_D(_, _), _, _)) => 5 
  case CC_D(CC_B(), CC_A(CC_E(_, _, _), _, _)) => 6 
  case CC_D(CC_B(), CC_A(CC_F(_, _), _, _)) => 7 
  case CC_D(CC_B(), CC_B()) => 8 
  case CC_D(CC_B(), CC_C(_, (_,_))) => 9 
  case CC_D(CC_C(_, _), CC_A(CC_D(_, _), _, _)) => 10 
  case CC_D(CC_C(_, _), CC_A(CC_E(_, _, _), _, _)) => 11 
  case CC_D(CC_C(_, _), CC_A(CC_F(_, _), _, _)) => 12 
  case CC_D(CC_C(_, _), CC_B()) => 13 
  case CC_D(CC_C(_, _), CC_C(_, (_,_))) => 14 
  case CC_E(_, _, _) => 15 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _)) => 16 
}
}