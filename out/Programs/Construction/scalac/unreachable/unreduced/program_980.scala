package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, (Byte,Boolean)], (Char,Boolean)], T_A[T_A[Int, Char], T_A[Int, Char]]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, Byte]], b: T_A[((Byte,Char),CC_A), CC_A], c: CC_A) extends T_A[T_A[T_A[Char, (Byte,Boolean)], (Char,Boolean)], T_A[T_A[Int, Char], T_A[Int, Char]]]
case class CC_C(a: CC_A, b: T_A[T_A[CC_B, CC_A], T_A[CC_B, (Byte,Byte)]], c: CC_B) extends T_A[T_A[T_A[Char, (Byte,Boolean)], (Char,Boolean)], T_A[T_A[Int, Char], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[Char, (Byte,Boolean)], (Char,Boolean)], T_A[T_A[Int, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}