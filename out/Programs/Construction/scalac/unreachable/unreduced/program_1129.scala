package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: (T_A[Byte],T_A[Char])) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Boolean, c: E) extends T_A[E]
case class CC_C[F](a: Byte, b: F, c: T_A[CC_B[F]]) extends T_B[CC_B[T_B[Boolean, Boolean]], F]
case class CC_D[G](a: T_A[G], b: T_B[G, Boolean]) extends T_B[CC_B[T_B[Boolean, Boolean]], G]
case class CC_E(a: CC_B[((Int,Int),(Byte,Char))]) extends T_B[CC_B[T_B[Boolean, Boolean]], T_B[CC_C[Char], (Char,Boolean)]]

val v_a: T_B[CC_B[T_B[Boolean, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A(_, _), _) => 1 
}
}
// This is not matched: CC_D(CC_B(_, _, _), _)