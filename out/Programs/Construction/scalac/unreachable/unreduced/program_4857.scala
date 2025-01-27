package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Boolean, Int], T_A[(Byte,Int)]]]
case class CC_B(a: T_A[(CC_A,CC_A)]) extends T_A[T_B[T_B[Boolean, Int], T_A[(Byte,Int)]]]
case class CC_C(a: (T_B[CC_B, CC_A],CC_A)) extends T_A[T_B[T_B[Boolean, Int], T_A[(Byte,Int)]]]
case class CC_D[E, D](a: Boolean, b: CC_C) extends T_B[D, E]
case class CC_E[F, G](a: T_B[F, F], b: F, c: (T_B[CC_B, CC_A],T_B[CC_A, Char])) extends T_B[F, G]
case class CC_F[H](a: H) extends T_B[H, Int]

val v_a: T_A[T_B[T_B[Boolean, Int], T_A[(Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C((CC_D(_, _),CC_A())) => 2 
}
}
// This is not matched: CC_C((CC_E(_, _, _),CC_A()))