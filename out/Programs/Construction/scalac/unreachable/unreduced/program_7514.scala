package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[T_A[C, C], C], c: (T_A[Byte, Char],T_A[Int, Boolean])) extends T_A[T_A[T_A[(Char,Int), Byte], Char], C]
case class CC_B[D]() extends T_A[T_A[T_A[(Char,Int), Byte], Char], D]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[T_A[(Char,Int), Byte], Char], E]

val v_a: T_A[T_A[T_A[(Char,Int), Byte], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}