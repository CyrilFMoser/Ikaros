package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean) extends T_A[((Boolean,Byte),T_B[Int])]
case class CC_B() extends T_A[((Boolean,Byte),T_B[Int])]
case class CC_C[C](a: C) extends T_B[C]
case class CC_D[D](a: CC_B, b: CC_C[D], c: T_A[D]) extends T_B[D]
case class CC_E[E](a: Byte, b: CC_A) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(_, CC_C(_), _) => 1 
}
}
// This is not matched: CC_E(_, CC_A(_))