package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_B[Boolean, Boolean], ((Byte,Byte),Boolean)], (T_A[(Char,Int), Byte],T_A[Boolean, (Byte,Boolean)])]
case class CC_B(a: CC_A, b: (T_B[CC_A, CC_A],CC_A), c: T_A[(Char,CC_A), T_B[CC_A, CC_A]]) extends T_A[T_B[T_B[Boolean, Boolean], ((Byte,Byte),Boolean)], (T_A[(Char,Int), Byte],T_A[Boolean, (Byte,Boolean)])]
case class CC_C(a: T_B[CC_A, T_B[CC_A, CC_B]]) extends T_A[T_B[T_B[Boolean, Boolean], ((Byte,Byte),Boolean)], (T_A[(Char,Int), Byte],T_A[Boolean, (Byte,Boolean)])]
case class CC_D[F, E]() extends T_B[F, E]
case class CC_E[H, G](a: H) extends T_B[G, H]
case class CC_F[J, I, K](a: T_B[J, I]) extends T_B[J, I]

val v_a: T_A[T_B[T_B[Boolean, Boolean], ((Byte,Byte),Boolean)], (T_A[(Char,Int), Byte],T_A[Boolean, (Byte,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (CC_D(),CC_A()), _) => 1 
  case CC_B(CC_A(), (CC_E(_),CC_A()), _) => 2 
  case CC_B(CC_A(), (CC_F(_),CC_A()), _) => 3 
  case CC_C(CC_E(_)) => 4 
  case CC_C(CC_F(_)) => 5 
}
}
// This is not matched: CC_C(CC_D())