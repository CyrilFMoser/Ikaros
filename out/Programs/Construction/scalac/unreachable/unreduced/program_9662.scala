package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: C) extends T_A[C, (T_A[Int, Char],T_A[Boolean, Char])]
case class CC_B[D]() extends T_A[D, (T_A[Int, Char],T_A[Boolean, Char])]
case class CC_C[E](a: Boolean, b: (Int,CC_A[Int])) extends T_A[CC_A[E], E]

val v_a: T_A[Boolean, (T_A[Int, Char],T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}