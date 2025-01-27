package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[(Boolean,(Char,Int)), T_A[(Int,Int), Byte]]) extends T_A[T_B[Boolean], Byte]
case class CC_B(a: T_B[CC_A]) extends T_A[T_B[Boolean], Byte]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: Byte) extends T_B[E]
case class CC_E[F](a: CC_A, b: (T_A[CC_A, CC_A],(CC_B,CC_B))) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_, (_,(_,_))) => 1 
}
}
// This is not matched: CC_D(_)