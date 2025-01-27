package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Char) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: E) extends T_A[E]
case class CC_C[F](a: T_B[F, F]) extends T_A[F]
case class CC_D(a: T_B[CC_B[Char], Boolean], b: T_A[(Int,Boolean)]) extends T_B[T_A[Byte], (((Int,Byte),Int),Byte)]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 1 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 2 
  case CC_B(CC_A(_, _), CC_C(_), _) => 3 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 4 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 5 
  case CC_B(CC_B(_, _, _), CC_C(_), _) => 6 
  case CC_B(CC_C(_), CC_A(_, _), _) => 7 
  case CC_B(CC_C(_), CC_B(_, _, _), _) => 8 
  case CC_B(CC_C(_), CC_C(_), _) => 9 
  case CC_C(_) => 10 
}
}