package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Byte, T_B[(Int,Boolean), Int]], b: T_A[Boolean, T_B[Char, Char]], c: Char) extends T_A[Byte, T_A[T_B[Int, (Boolean,Char)], (Byte,Char)]]
case class CC_B(a: Int) extends T_A[Byte, T_A[T_B[Int, (Boolean,Char)], (Byte,Char)]]
case class CC_C[F, E](a: E, b: T_B[E, F], c: CC_B) extends T_B[E, F]
case class CC_D[H, G](a: (Byte,T_A[Boolean, CC_A]), b: CC_B, c: CC_C[G, H]) extends T_B[H, G]
case class CC_E[I, J](a: J) extends T_B[I, CC_B]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D((_,_), _, CC_C(_, CC_C(_, _, _), _)) => 1 
}
}
// This is not matched: CC_D((_,_), _, CC_C(_, CC_D(_, _, _), _))