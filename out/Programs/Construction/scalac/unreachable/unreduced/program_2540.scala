package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: T_A[D, D]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], E]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}