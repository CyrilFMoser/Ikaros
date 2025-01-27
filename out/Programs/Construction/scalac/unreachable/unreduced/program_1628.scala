package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Char, Int]]) extends T_A[T_A[T_A[Char, Byte], (Char,Byte)], T_A[T_A[Byte, Int], (Int,(Char,Boolean))]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Char, Byte], (Char,Byte)], T_A[T_A[Byte, Int], (Int,(Char,Boolean))]]
case class CC_C() extends T_A[T_A[T_A[Char, Byte], (Char,Byte)], T_A[T_A[Byte, Int], (Int,(Char,Boolean))]]

val v_a: T_A[T_A[T_A[Char, Byte], (Char,Byte)], T_A[T_A[Byte, Int], (Int,(Char,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)