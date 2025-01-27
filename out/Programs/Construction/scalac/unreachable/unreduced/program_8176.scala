package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Boolean, (Char,Char)]], b: (T_A[Byte, Int],T_A[Char, Boolean]), c: T_A[T_A[Boolean, (Int,Boolean)], T_A[Boolean, Boolean]]) extends T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Boolean, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Int]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A, (Int,Int)], CC_A]) extends T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Boolean, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Int]]]
case class CC_C(a: CC_B, b: CC_B, c: Boolean) extends T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Boolean, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Boolean, Char]], T_A[T_A[Boolean, Char], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}