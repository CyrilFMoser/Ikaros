package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[Boolean, Byte], T_B[Char, (Int,Int)]], T_A[T_B[Byte, Char], (Boolean,(Byte,Boolean))]]
case class CC_B(a: CC_A) extends T_A[T_B[T_A[Boolean, Byte], T_B[Char, (Int,Int)]], T_A[T_B[Byte, Char], (Boolean,(Byte,Boolean))]]
case class CC_C[E](a: T_A[E, Boolean], b: CC_A, c: E) extends T_A[T_B[T_A[Boolean, Byte], T_B[Char, (Int,Int)]], T_A[T_B[Byte, Char], (Boolean,(Byte,Boolean))]]

val v_a: T_A[T_B[T_A[Boolean, Byte], T_B[Char, (Int,Int)]], T_A[T_B[Byte, Char], (Boolean,(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, CC_A(), _) => 1 
}
}
// This is not matched: CC_A()