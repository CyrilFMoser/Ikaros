package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], b: C, c: C) extends T_A[T_A[C, C], C]
case class CC_B[E](a: (Byte,T_A[Byte, Byte]), b: T_A[T_A[E, E], E]) extends T_A[T_A[CC_A[Byte], T_A[Boolean, Boolean]], E]
case class CC_C[F]() extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_C(), _, _), _, _) => 1 
  case CC_A(CC_C(), _, _) => 2 
  case CC_C() => 3 
}
}