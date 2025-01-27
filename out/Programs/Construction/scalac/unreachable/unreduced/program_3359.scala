package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (Byte,T_A[Int, Boolean])]
case class CC_B[D](a: T_A[D, D], b: CC_A[T_A[D, D]], c: D) extends T_A[D, (Byte,T_A[Int, Boolean])]
case class CC_C[E](a: T_A[E, E], b: Char) extends T_A[E, (Byte,T_A[Int, Boolean])]

val v_a: T_A[Int, (Byte,T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}