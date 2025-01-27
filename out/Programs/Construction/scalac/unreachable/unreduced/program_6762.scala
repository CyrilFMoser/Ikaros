package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: Char) extends T_A[T_B[(Byte,Boolean), T_B[Int, Boolean]]]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[T_B[(Byte,Boolean), T_B[Int, Boolean]]]
case class CC_C(a: T_A[((Boolean,Byte),CC_B)], b: T_A[T_B[Boolean, CC_A]]) extends T_A[T_B[(Byte,Boolean), T_B[Int, Boolean]]]
case class CC_D[D](a: T_B[T_A[Boolean], D]) extends T_B[T_A[Boolean], D]
case class CC_E[E, F](a: E, b: CC_C) extends T_B[T_A[Boolean], E]
case class CC_F[G](a: T_B[T_A[Boolean], G], b: Boolean, c: G) extends T_B[T_A[Boolean], G]

val v_a: T_A[T_B[(Byte,Boolean), T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)