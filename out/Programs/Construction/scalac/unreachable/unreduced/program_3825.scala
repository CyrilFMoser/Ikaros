package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_B[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Int, Char], T_B[Byte, Char]]]
case class CC_B() extends T_A[T_A[T_B[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Int, Char], T_B[Byte, Char]]]
case class CC_C[F, E](a: T_B[(CC_B,CC_A), E], b: E) extends T_B[F, E]
case class CC_D[G](a: T_B[G, G], b: CC_C[G, G], c: T_A[CC_A, G]) extends T_B[CC_C[T_B[CC_A, CC_B], T_B[CC_A, (Char,Boolean)]], G]

val v_a: T_B[CC_C[T_B[CC_A, CC_B], T_B[CC_A, (Char,Boolean)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), true), _) => 0 
  case CC_C(CC_C(CC_C(_, _), false), _) => 1 
  case CC_D(_, _, _) => 2 
}
}