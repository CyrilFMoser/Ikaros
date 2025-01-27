package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Int]), b: T_A[T_A[Boolean]]) extends T_A[(T_A[Boolean],T_A[Char])]
case class CC_B[B](a: B, b: B, c: CC_A) extends T_A[(T_A[Boolean],T_A[Char])]
case class CC_C[C](a: CC_A) extends T_A[(T_A[Boolean],T_A[Char])]

val v_a: T_A[(T_A[Boolean],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A((_,_), _)) => 2 
}
}