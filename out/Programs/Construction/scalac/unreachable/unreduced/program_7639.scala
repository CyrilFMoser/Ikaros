package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Char],T_A[Boolean]), b: Char, c: T_B[T_A[Char], T_B[Boolean, Char]]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C[D, E]() extends T_B[D, E]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A((_,_), _, _)) => 1 
}
}