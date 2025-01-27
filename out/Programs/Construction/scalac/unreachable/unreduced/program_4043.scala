package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Byte) extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_B(a: CC_A, b: (CC_A,T_A[CC_A])) extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_C[B](a: Char, b: Int, c: Boolean) extends T_A[(T_A[Char],T_A[Boolean])]

val v_a: T_A[(T_A[Char],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), (CC_A(_, _),_)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)