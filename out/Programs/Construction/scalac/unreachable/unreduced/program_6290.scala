package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: Int) extends T_A[C, T_A[Char, T_A[Boolean, Int]]]
case class CC_B[D]() extends T_A[D, T_A[Char, T_A[Boolean, Int]]]

val v_a: T_A[Boolean, T_A[Char, T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}