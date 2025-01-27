package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C, c: T_A[C, C]) extends T_A[C, (Boolean,T_A[Boolean, Char])]
case class CC_B[D]() extends T_A[D, (Boolean,T_A[Boolean, Char])]

val v_a: T_A[Int, (Boolean,T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, _, _)