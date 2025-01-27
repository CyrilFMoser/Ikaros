package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Byte],T_A[Int, Int])) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: CC_A[D]) extends T_A[D, Int]
case class CC_C[E]() extends T_A[E, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}