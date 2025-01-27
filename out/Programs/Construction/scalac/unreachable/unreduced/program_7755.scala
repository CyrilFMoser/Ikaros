package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, (Char,Int)]) extends T_A[T_B[T_A[Boolean, Boolean], T_A[Int, Byte]], E]
case class CC_B[F](a: Boolean, b: T_B[F, F]) extends T_A[T_A[Char, (Char,Char)], F]
case class CC_C[G](a: G, b: CC_B[G], c: G) extends T_A[T_A[Char, (Char,Char)], G]
case class CC_D() extends T_B[(Byte,(Byte,Char)), T_B[CC_B[Int], T_B[Char, Boolean]]]
case class CC_E() extends T_B[(Byte,(Byte,Char)), T_B[CC_B[Int], T_B[Char, Boolean]]]

val v_a: T_A[T_A[Char, (Char,Char)], T_B[(Byte,(Byte,Char)), T_B[CC_B[Int], T_B[Char, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_E(), _, CC_D()) => 1 
  case CC_C(CC_D(), _, CC_E()) => 2 
  case CC_C(CC_E(), _, CC_E()) => 3 
}
}
// This is not matched: CC_C(CC_D(), _, CC_D())