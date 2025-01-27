package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Byte], T_A[Int]]) extends T_A[(T_A[Char],(Boolean,Byte))]
case class CC_B(a: Int) extends T_A[(T_A[Char],(Boolean,Byte))]
case class CC_C[D]() extends T_A[D]
case class CC_D[E](a: E, b: CC_B) extends T_B[E, CC_A]
case class CC_E[F](a: F) extends T_B[F, CC_A]

val v_a: T_A[(T_A[Char],(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)