package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Char], T_A[Char, (Int,Byte)]], T_A[T_A[Int, Boolean], T_A[Int, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte, Char], T_A[Char, (Int,Byte)]], T_A[T_A[Int, Boolean], T_A[Int, Byte]]]
case class CC_C(a: T_A[T_A[Int, CC_A], Byte], b: CC_B, c: CC_B) extends T_A[T_A[T_A[Byte, Char], T_A[Char, (Int,Byte)]], T_A[T_A[Int, Boolean], T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Char, (Int,Byte)]], T_A[T_A[Int, Boolean], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()