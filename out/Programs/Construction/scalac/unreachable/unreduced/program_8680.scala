package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Boolean, b: T_A[T_A[Byte, Boolean], T_B[Byte]], c: T_A[Boolean, T_B[Byte]]) extends T_A[(T_B[Byte],T_A[Byte, Int]), Char]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[(T_B[Byte],T_A[Byte, Int]), Char]
case class CC_C[D](a: D) extends T_A[(T_B[Byte],T_A[Byte, Int]), Char]

val v_a: T_A[(T_B[Byte],T_A[Byte, Int]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}