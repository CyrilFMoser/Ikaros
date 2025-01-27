package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Int], T_A[(Int,Byte), Boolean]], T_A[T_A[Char, Char], Int]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]], b: CC_A) extends T_A[T_A[T_A[Byte, Int], T_A[(Int,Byte), Boolean]], T_A[T_A[Char, Char], Int]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Byte, Int], T_A[(Int,Byte), Boolean]], T_A[T_A[Char, Char], Int]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[(Int,Byte), Boolean]], T_A[T_A[Char, Char], Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C(CC_A()) => 1 
}
}
// This is not matched: CC_A()