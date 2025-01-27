package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Byte]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Byte]], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Byte]], E]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}