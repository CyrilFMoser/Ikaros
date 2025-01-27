package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D]() extends T_A[Int, D]
case class CC_C[E](a: E, b: (Char,T_A[T_B, T_B])) extends T_A[Int, E]
case class CC_D(a: T_A[Int, Boolean], b: T_A[Int, Boolean], c: T_B) extends T_B

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_D(_, _, CC_D(_, _, _)), (_,_)) => 1 
}
}
// This is not matched: CC_B()