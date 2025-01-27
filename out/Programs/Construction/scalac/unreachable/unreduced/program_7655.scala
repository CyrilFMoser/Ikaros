package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[T_A[C, C], C], c: C) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[T_A[Int, Byte], T_A[Int, Byte]], T_A[Int, Byte]], b: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]) extends T_A[T_A[T_A[T_A[T_A[Boolean, (Byte,Char)], T_A[Boolean, (Byte,Char)]], T_A[Boolean, (Byte,Char)]], T_A[T_A[T_A[Boolean, (Byte,Char)], T_A[Boolean, (Byte,Char)]], T_A[Boolean, (Byte,Char)]]], T_A[T_A[T_A[Boolean, (Byte,Char)], T_A[Boolean, (Byte,Char)]], T_A[Boolean, (Byte,Char)]]]
case class CC_C(a: Char, b: (T_A[CC_B, Byte],CC_B), c: CC_A[T_A[Byte, CC_B]]) extends T_A[T_A[T_A[T_A[CC_B, CC_B], Byte], T_A[T_A[CC_B, CC_B], Byte]], T_A[T_A[CC_B, CC_B], Byte]]

val v_a: T_A[T_A[T_A[T_A[CC_B, CC_B], Byte], T_A[T_A[CC_B, CC_B], Byte]], T_A[T_A[CC_B, CC_B], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(CC_A(_, _, _), CC_C(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(CC_C(_, _, _), CC_A(_, _, _), _), _) => 2 
  case CC_A(_, CC_A(CC_C(_, _, _), CC_C(_, _, _), _), _) => 3 
  case CC_A(_, CC_C(_, _, _), _) => 4 
  case CC_C(_, _, _) => 5 
}
}