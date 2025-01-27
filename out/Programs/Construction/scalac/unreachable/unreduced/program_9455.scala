package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[D, T_B[D, D]], b: T_A[D]) extends T_A[D]
case class CC_B[F](a: F) extends T_B[Char, F]
case class CC_C[G](a: T_B[G, G]) extends T_B[Char, G]
case class CC_D[H]() extends T_B[Char, H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_A(_, _))) => 0 
  case CC_A(CC_B(_), CC_A(CC_C(_), CC_A(_, _))) => 1 
  case CC_A(CC_B(_), CC_A(CC_D(), CC_A(_, _))) => 2 
  case CC_A(CC_C(_), CC_A(CC_B(_), CC_A(_, _))) => 3 
  case CC_A(CC_C(_), CC_A(CC_C(_), CC_A(_, _))) => 4 
  case CC_A(CC_C(_), CC_A(CC_D(), CC_A(_, _))) => 5 
  case CC_A(CC_D(), CC_A(CC_B(_), CC_A(_, _))) => 6 
  case CC_A(CC_D(), CC_A(CC_D(), CC_A(_, _))) => 7 
}
}
// This is not matched: CC_A(CC_D(), CC_A(CC_C(_), CC_A(_, _)))