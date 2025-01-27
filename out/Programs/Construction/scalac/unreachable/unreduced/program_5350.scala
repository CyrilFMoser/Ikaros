package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[(Char,Byte), Int], Boolean], Boolean]
case class CC_B(a: Char) extends T_A[T_B[T_A[(Char,Byte), Int], Boolean], Boolean]
case class CC_C(a: T_A[CC_A, Int], b: T_B[T_A[CC_B, CC_A], T_A[CC_B, Boolean]], c: T_A[CC_B, CC_A]) extends T_A[T_B[T_A[(Char,Byte), Int], Boolean], Boolean]

val v_a: T_A[T_B[T_A[(Char,Byte), Int], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()