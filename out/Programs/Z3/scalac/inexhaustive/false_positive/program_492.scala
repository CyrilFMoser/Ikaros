package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[C]
case class CC_A() extends T_A[(Boolean,Char)]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_A[E], b: T_B[E]) extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
}
}
// This is not matched: Pattern match is empty without constants