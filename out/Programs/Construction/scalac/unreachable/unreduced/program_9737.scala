package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Byte,Char), Boolean], T_A[Boolean, (Char,Byte)]], T_A[T_A[Char, Int], (Int,Boolean)]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[T_A[(Byte,Char), Boolean], T_A[Boolean, (Char,Byte)]], T_A[T_A[Char, Int], (Int,Boolean)]]
case class CC_C(a: CC_A, b: CC_B, c: Char) extends T_A[T_A[T_A[(Byte,Char), Boolean], T_A[Boolean, (Char,Byte)]], T_A[T_A[Char, Int], (Int,Boolean)]]

val v_a: T_A[T_A[T_A[(Byte,Char), Boolean], T_A[Boolean, (Char,Byte)]], T_A[T_A[Char, Int], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()