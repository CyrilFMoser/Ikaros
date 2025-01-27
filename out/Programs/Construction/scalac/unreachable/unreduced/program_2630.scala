package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], ((Char,Int),Int)], b: T_A[T_A[Char, Char], Int], c: T_A[T_A[(Int,Byte), Byte], T_A[Byte, Byte]]) extends T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Char, Char]]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Char, Char]]]
case class CC_C(a: T_A[CC_A, Int], b: T_A[T_A[CC_A, CC_A], CC_B], c: CC_A) extends T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Char, Char]]]

val v_a: T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, CC_A(_, _, _)) => 2 
}
}