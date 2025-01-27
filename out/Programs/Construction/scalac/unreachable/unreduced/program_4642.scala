package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B(a: T_A[CC_A[Int]], b: T_B[Byte, T_A[(Int,Boolean)]], c: T_A[T_A[Boolean]]) extends T_B[CC_A[(Boolean,Boolean)], T_B[CC_A[Int], T_B[Char, Boolean]]]
case class CC_C(a: Boolean, b: Char, c: CC_A[Byte]) extends T_B[CC_A[(Boolean,Boolean)], T_B[CC_A[Int], T_B[Char, Boolean]]]

val v_a: T_B[CC_A[(Boolean,Boolean)], T_B[CC_A[Int], T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), _, _) => 0 
  case CC_C(_, _, CC_A(CC_A(_, _), _)) => 1 
}
}