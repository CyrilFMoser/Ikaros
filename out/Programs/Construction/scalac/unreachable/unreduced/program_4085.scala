package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[(T_A[Int, (Int,Boolean)],T_A[Boolean, Boolean]), D]
case class CC_B[E](a: CC_A[E], b: Byte) extends T_A[(T_A[Int, (Int,Boolean)],T_A[Boolean, Boolean]), E]
case class CC_C(a: CC_A[CC_B[Int]]) extends T_A[(T_A[Int, (Int,Boolean)],T_A[Boolean, Boolean]), ((Boolean,Byte),CC_B[(Char,Boolean)])]
case class CC_D[F](a: F, b: CC_A[F]) extends T_B[CC_B[CC_A[CC_C]]]
case class CC_E[G](a: Char) extends T_B[G]
case class CC_F(a: CC_C, b: CC_B[CC_B[CC_C]]) extends T_B[CC_B[CC_A[CC_C]]]

val v_a: T_A[(T_A[Int, (Int,Boolean)],T_A[Boolean, Boolean]), ((Boolean,Byte),CC_B[(Char,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _))