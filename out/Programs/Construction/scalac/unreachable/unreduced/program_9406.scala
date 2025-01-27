package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[T_B[T_B[(Byte,Int), Int], T_A[Char, (Boolean,Char)]], E]
case class CC_B[F]() extends T_A[T_B[T_B[(Byte,Int), Int], T_A[Char, (Boolean,Char)]], F]
case class CC_C[G, H](a: T_B[G, CC_A[G]], b: T_A[G, H]) extends T_B[Boolean, G]
case class CC_D[I]() extends T_B[Boolean, I]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
}
}