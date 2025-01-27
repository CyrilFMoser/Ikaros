package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Char],T_B[Byte]), b: Int) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: CC_A, b: T_B[(CC_A,Boolean)]) extends T_A[T_B[CC_A]]
case class CC_C(a: T_A[T_A[CC_B]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_D[C](a: T_A[T_B[CC_A]], b: CC_C) extends T_B[C]

val v_a: T_A[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),CC_D(_, _)), _) => 0 
  case CC_C(_) => 1 
}
}