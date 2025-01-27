package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: C) extends T_A[C]
case class CC_B(a: T_B[Boolean]) extends T_B[CC_A[T_A[Char]]]
case class CC_C(a: (T_A[(Boolean,Boolean)],CC_B)) extends T_B[CC_A[T_A[Char]]]
case class CC_D() extends T_B[CC_A[T_A[Char]]]

val v_a: T_B[CC_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((CC_A(_, _),CC_B(_))) => 1 
  case CC_D() => 2 
}
}