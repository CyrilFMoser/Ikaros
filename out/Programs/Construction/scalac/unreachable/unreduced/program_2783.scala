package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_B[D](a: (Byte,Char), b: Char, c: T_A[Boolean, D]) extends T_A[Boolean, D]
case class CC_C[E](a: T_A[E, E]) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}