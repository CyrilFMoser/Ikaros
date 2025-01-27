package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Byte],T_A[Boolean, Byte])) extends T_A[D, (T_B[Char],T_B[(Char,Boolean)])]
case class CC_B() extends T_A[T_A[T_B[Int], CC_A[Char]], (T_B[Char],T_B[(Char,Boolean)])]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_B[Int], CC_A[Char]], (T_B[Char],T_B[(Char,Boolean)])]
case class CC_D[E](a: E, b: T_A[E, E], c: CC_B) extends T_B[E]
case class CC_E[F]() extends T_B[F]
case class CC_F(a: CC_A[Int], b: (CC_C,T_B[Byte]), c: Byte) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B()) => 0 
  case CC_E() => 1 
  case CC_F(_, _, _) => 2 
}
}