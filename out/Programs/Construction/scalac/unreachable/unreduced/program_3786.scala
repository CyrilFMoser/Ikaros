package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Boolean, D], b: T_A[D, D]) extends T_A[Boolean, D]
case class CC_B(a: T_A[Boolean, (Char,Byte)], b: T_A[CC_A[Char], T_B[Byte]], c: CC_A[T_A[Int, Boolean]]) extends T_A[Boolean, T_B[T_A[Boolean, (Byte,Boolean)]]]
case class CC_C() extends T_A[Boolean, Byte]
case class CC_D[E, F]() extends T_B[E]
case class CC_E[G, H](a: Int, b: H, c: CC_D[G, G]) extends T_B[G]
case class CC_F[I]() extends T_B[I]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(CC_A(_, _), _)