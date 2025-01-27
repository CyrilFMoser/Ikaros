package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], T_A[Char, Char]]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Char]], T_A[Char, T_A[Byte, (Byte,Int)]]]
case class CC_B(a: Char, b: CC_A) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Char]], T_A[Char, T_A[Byte, (Byte,Int)]]]
case class CC_C() extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Char]], T_A[Char, T_A[Byte, (Byte,Int)]]]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Boolean, Char]], T_A[Char, T_A[Byte, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}