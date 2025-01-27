package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], Byte], b: T_A[T_A[Byte, Boolean], T_A[Byte, Byte]]) extends T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Boolean, Char]], Char]
case class CC_B(a: T_A[CC_A, CC_A], b: CC_A) extends T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Boolean, Char]], Char]
case class CC_C() extends T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Boolean, Char]], Char]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Boolean, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}