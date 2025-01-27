package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte) extends T_A[(T_A[Byte, Int],T_A[Byte, Int]), T_A[T_A[Byte, Int], Byte]]
case class CC_B(a: T_A[T_A[(Char,Byte), Boolean], T_A[CC_A, (Char,Boolean)]], b: CC_A) extends T_A[(T_A[Byte, Int],T_A[Byte, Int]), T_A[T_A[Byte, Int], Byte]]
case class CC_C(a: T_A[T_A[CC_B, Int], CC_A], b: CC_B, c: Char) extends T_A[CC_B, Int]

val v_a: T_A[(T_A[Byte, Int],T_A[Byte, Int]), T_A[T_A[Byte, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(0)) => 1 
  case CC_B(_, CC_A(_)) => 2 
}
}