package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: (T_B[Char],T_A[Int, Int])) extends T_B[E]
case class CC_C() extends T_B[(CC_B[Int],CC_B[Byte])]
case class CC_D(a: CC_A[T_A[CC_C, CC_C]], b: CC_C, c: T_B[CC_B[CC_C]]) extends T_B[(CC_B[Int],CC_B[Byte])]

val v_a: T_B[(CC_B[Int],CC_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_),_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(_, _, _)