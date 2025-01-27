package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[(Int,Byte)], b: C, c: C) extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_A[D], c: T_A[(Int,Char)]) extends T_A[D]
case class CC_C[E](a: T_B[E], b: CC_A[E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), CC_A(CC_C(_, _), _, _)) => 0 
  case CC_C(CC_D(), CC_A(CC_C(_, _), _, _)) => 1 
  case CC_C(CC_C(_, _), CC_A(CC_D(), _, _)) => 2 
  case CC_C(CC_D(), CC_A(CC_D(), _, _)) => 3 
  case CC_D() => 4 
}
}