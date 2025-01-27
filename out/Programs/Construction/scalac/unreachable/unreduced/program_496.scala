package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, E], b: T_B[D], c: T_A[T_B[(Char,Byte)], T_B[(Char,Byte)]]) extends T_A[D, E]
case class CC_B[G, F](a: T_A[G, G]) extends T_A[F, G]
case class CC_C(a: Int, b: T_A[CC_B[Int, (Byte,Boolean)], T_A[Byte, Boolean]], c: CC_A[T_A[Int, Boolean], CC_A[Char, (Int,Int)]]) extends T_B[T_A[Byte, T_A[Char, Byte]]]
case class CC_D(a: T_B[CC_C], b: T_A[Boolean, Boolean], c: CC_B[CC_B[CC_C, Boolean], T_A[Char, CC_C]]) extends T_B[T_A[Byte, T_A[Char, Byte]]]

val v_a: CC_B[Byte, T_B[T_A[Byte, T_A[Char, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}