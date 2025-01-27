package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[Boolean, T_A[Char, Int]]]
case class CC_B[D](a: D) extends T_A[D, T_A[Boolean, T_A[Char, Int]]]
case class CC_C[E](a: (CC_A[Boolean],T_A[Boolean, Boolean])) extends T_A[E, T_A[Boolean, T_A[Char, Int]]]

val v_a: T_A[Char, T_A[Boolean, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C((CC_A(_, _),_)) => 2 
}
}