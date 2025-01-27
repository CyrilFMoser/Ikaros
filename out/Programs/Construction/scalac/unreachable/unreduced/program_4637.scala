package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Int, Boolean],Boolean), b: Int, c: Boolean) extends T_A[T_B[D], D]
case class CC_B[E]() extends T_A[T_B[E], E]

val v_a: T_A[T_B[Char], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
}
}