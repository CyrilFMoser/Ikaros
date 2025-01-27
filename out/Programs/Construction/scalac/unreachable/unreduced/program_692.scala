package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: (T_B[(Byte,Byte), CC_A],CC_A), b: Char, c: T_B[Int, T_A[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_D[E](a: CC_A, b: CC_C, c: E) extends T_B[E, Int]
case class CC_E[F]() extends T_B[F, CC_A]
case class CC_F(a: T_B[Char, CC_A]) extends T_B[(T_B[CC_C, Byte],T_B[CC_A, Char]), Int]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C((_,_), _, _) => 1 
}
}
// This is not matched: CC_B()