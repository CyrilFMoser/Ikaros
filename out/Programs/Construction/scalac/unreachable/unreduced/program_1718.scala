package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Char],T_A[Int, Char]), b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Char, Char], (Boolean,Boolean)], C]
case class CC_B[D](a: T_A[D, D], b: T_A[CC_A[D], D], c: Char) extends T_A[T_A[T_A[Char, Char], (Boolean,Boolean)], D]
case class CC_C[E]() extends T_A[T_A[T_A[Char, Char], (Boolean,Boolean)], E]

val v_a: T_A[T_A[T_A[Char, Char], (Boolean,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}