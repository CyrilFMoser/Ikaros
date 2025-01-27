package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[(Byte,Char), Boolean]], b: T_A[T_A[(Char,Boolean)]]) extends T_A[T_B[Boolean, T_B[Char, Boolean]]]
case class CC_B[D](a: CC_A, b: CC_A) extends T_A[T_B[Boolean, T_B[Char, Boolean]]]
case class CC_C(a: T_A[T_B[CC_A, CC_A]], b: T_B[T_B[CC_A, CC_A], T_B[(Boolean,Byte), Byte]], c: CC_B[CC_B[Byte]]) extends T_A[T_B[Boolean, T_B[Char, Boolean]]]
case class CC_D[E, F, G](a: E) extends T_B[F, E]
case class CC_E[H]() extends T_B[Int, H]

val v_a: T_A[T_B[Boolean, T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_D(CC_D(_)), CC_B(_, CC_A(_, _))) => 1 
}
}
// This is not matched: CC_A(_, _)