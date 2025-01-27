package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Char, D], b: D) extends T_A[Char, D]
case class CC_B(a: (T_B[Byte],(Byte,(Boolean,Byte))), b: T_A[Char, T_A[Char, Byte]]) extends T_A[Char, T_A[T_A[Char, Int], T_A[Char, Int]]]
case class CC_C[E](a: T_A[Char, E], b: E, c: T_B[E]) extends T_A[Char, E]
case class CC_D(a: CC_C[CC_B]) extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _)) => 0 
  case CC_E() => 1 
}
}